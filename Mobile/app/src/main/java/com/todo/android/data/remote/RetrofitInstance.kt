package com.todo.android.data.remote

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    // ⚠️ DİKKAT: Emulator için 10.0.2.2 kullan
    // Gerçek cihaz için: bilgisayarın IP adresini kullan (örn: 192.168.1.100)
    private const val BASE_URL = "http://192.168.1.4:5099/"

    private val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    private val client = OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        // SSL sertifika hatası için (development only!)
        .hostnameVerifier { _, _ -> true }
        .build()

    val api: ToDoApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ToDoApiService::class.java)
    }
}
