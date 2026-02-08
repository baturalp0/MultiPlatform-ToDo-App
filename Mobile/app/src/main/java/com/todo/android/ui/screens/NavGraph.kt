package com.todo.android.ui.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.todo.android.viewmodel.ToDoViewModel

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Create : Screen("create")
    object Edit : Screen("edit/{id}/{name}/{isCompleted}/{createdAt}") {
        fun createRoute(id: Int, name: String, isCompleted: Boolean, createdAt: String): String {
            return "edit/$id/$name/$isCompleted/$createdAt"
        }
    }
}

@Composable
fun NavGraph(
    navController: NavHostController,
    viewModel: ToDoViewModel = viewModel()
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen(
                navController = navController,
                viewModel = viewModel
            )
        }

        composable(Screen.Create.route) {
            CreateScreen(
                navController = navController,
                viewModel = viewModel
            )
        }

        composable(
            route = Screen.Edit.route,
            arguments = listOf(
                navArgument("id") { type = NavType.IntType },
                navArgument("name") { type = NavType.StringType },
                navArgument("isCompleted") { type = NavType.BoolType },
                navArgument("createdAt") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("id") ?: 0
            val name = backStackEntry.arguments?.getString("name") ?: ""
            val isCompleted = backStackEntry.arguments?.getBoolean("isCompleted") ?: false
            val createdAt = backStackEntry.arguments?.getString("createdAt") ?: ""

            EditScreen(
                navController = navController,
                viewModel = viewModel,
                id = id,
                name = name,
                isCompleted = isCompleted,
                createdAt = createdAt
            )
        }
    }
}
