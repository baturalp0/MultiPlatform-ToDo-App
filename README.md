# 📝 Multi-Platform ToDo Application

A modern, cross-platform task management application with seamless integration across Backend API, Web interface, and Android mobile app.

![Project Banner](https://img.shields.io/badge/Platform-MultiPlatform-blue)
![Backend](https://img.shields.io/badge/.NET-8.0-purple)
![Mobile](https://img.shields.io/badge/Kotlin-2.0-orange)
![Database](https://img.shields.io/badge/PostgreSQL-16-blue)

## 🚀 Features

- ✅ **Full CRUD Operations** - Create, read, update, and delete tasks
- 🔍 **Search Functionality** - Real-time task search across all platforms
- ✔️ **Task Completion** - Mark tasks as completed/pending
- 📱 **3 Platform Support** - Backend API, Web, and Android
- 🎨 **Modern UI** - Bootstrap 5 (Web) and Material 3 (Android)
- 🔄 **Real-time Sync** - All platforms share the same database
- 🌐 **RESTful API** - Well-documented API with Swagger


## 🛠️ Technology Stack

### Backend API

- **.NET 8.0** - Web API Framework
- **PostgreSQL 16** - Relational Database
- **Entity Framework Core** - ORM
- **Swagger/OpenAPI** - API Documentation


### Web Application

- **ASP.NET MVC** - Web Framework
- **Bootstrap 5** - Responsive UI Framework
- **HttpClient** - REST API Communication


### Android Application

- **Kotlin** - Programming Language
- **Jetpack Compose** - Modern UI Toolkit
- **MVVM Architecture** - Clean Architecture Pattern
- **Retrofit** - Type-safe HTTP Client
- **Coroutines \\& Flow** - Asynchronous Programming
- **Navigation Component** - App Navigation
- **Material 3** - Design System


## 📂 Project Structure

ToDoProject/
├── Backend/
│ └── ToDoAPI/ \\# .NET Web API
│ ├── Controllers/ \\# API Endpoints
│ ├── Models/ \\# Data Models
│ ├── Data/ \\# Database Context
│ └── Program.cs \\# App Configuration
│
├── Web/
│ └── ToDoMVC/ \\# ASP.NET MVC Web App
│ ├── Controllers/ \\# MVC Controllers
│ ├── Views/ \\# Razor Views
│ ├── Models/ \\# View Models
│ └── Services/ \\# API Service Layer
│
└── Mobile/
└── ToDoAndroid/ \\# Kotlin Android App
├── data/ \\# Data Layer
│ ├── model/ \\# Data Models
│ ├── remote/ \\# Retrofit API
│ └── repository/ \\# Repository Pattern
├── ui/ \\# UI Layer
│ └── screens/ \\# Compose Screens
└── viewmodel/ \\# ViewModels (MVVM)

text

## 🔧 Installation \\& Setup

### Prerequisites

- **.NET SDK 8.0+**
- **PostgreSQL 14+**
- **Android Studio** (for Android development)
- **macOS / Windows / Linux**


### 1️⃣ Database Setup

```bash
# Start PostgreSQL service
# Create database using pgAdmin or psql
CREATE DATABASE "ToDoDb";
2️⃣ Backend API


bash
cd Backend/ToDoAPI


# Update connection string in appsettings.json
# "DefaultConnection": "Host=localhost;Port=5432;Database=ToDoDb;Username=postgres;Password=YOUR_PASSWORD"


# Apply migrations
dotnet ef database update


# Run the API
dotnet run


# API will be available at: https://localhost:5099
# Swagger UI: https://localhost:5099/swagger
3️⃣ Web Application


bash
cd Web/ToDoMVC


# Verify API URL in Services/ToDoApiService.cs
# private const string _baseUrl = "https://localhost:5099/api/ToDos";


# Run the web app
dotnet run


4️⃣ Android Application


bash
# Open Android Studio
# Import project from Mobile/ToDoAndroid


# Update API base URL in data/remote/RetrofitInstance.kt
# For Emulator: private const val BASE_URL = "http://10.0.2.2:7122/"
# For Physical Device: private const val BASE_URL = "http://YOUR_IP:7122/"


# Sync Project with Gradle Files
# Run the app on emulator or physical device


🔌 API Endpoints
Method  Endpoint    Description
GET /api/ToDos  Get all tasks
GET /api/ToDos/{id} Get task by ID
GET /api/ToDos/search/{keyword} Search tasks
POST /api/ToDos Create new task
PUT /api/ToDos/{id} Update task
DELETE  /api/ToDos/{id} Delete task
Sample Request (POST)


json
{
  "name": "Complete project documentation",
  "isCompleted": false
}
Sample Response


json
{
  "id": 1,
  "name": "Complete project documentation",
  "isCompleted": false,
  "createdAt": "2026-02-08T21:00:00Z"
}
🏗️ Architecture
Backend


RESTful API design principles


Repository Pattern for data access


Entity Framework Core ORM


Dependency Injection


Web


MVC Pattern - Model-View-Controller


Service Layer - API communication abstraction


Responsive Design - Bootstrap Grid System


Android


MVVM Pattern - Model-View-ViewModel


Repository Pattern - Data layer abstraction


Clean Architecture - Separation of concerns


Unidirectional Data Flow - StateFlow implementation


Dependency Injection - Manual DI


🧪 Testing
bash
# Test Backend API with Swagger
https://localhost:5099/swagger


# Test API Endpoints with Postman/curl
curl -X GET https://localhost:5099/api/ToDos
🚀 Future Enhancements
 User authentication & authorization


 Dark/Light theme support


 Task categories and tags


 Due dates and reminders


 Priority levels (Low, Medium, High)


 Offline support with Room Database (Android)


 Push notifications


 Cloud deployment


🤝 Contributing
Contributions are welcome! Please feel free to submit a Pull Request.


Fork the project


Create your feature branch (git checkout -b feature/AmazingFeature)


Commit your changes (git commit -m 'Add some AmazingFeature')


Push to the branch (git push origin feature/AmazingFeature)


Open a Pull Request


📝 License
This project is open source and available under the MIT License.


👨‍💻 Developer
Baturalp


💼 Software Developer


🛠️ .NET | Kotlin | Android Development


📍 Antalya, Turkey


🔗 LinkedIn


📧 Email


🙏 Acknowledgments
This project was developed to demonstrate modern software development practices including:


Cross-platform development


RESTful API design


Clean Architecture principles


Modern UI frameworks (Jetpack Compose, Bootstrap 5)


⭐ If you found this project useful, please consider giving it a star!


Made with ❤️ using .NET, Kotlin, and PostgreSQL


text


***

Harika! Çok iyi görünüyor! 🎉 Sadece birkaç ufak düzeltme var:

## ✅ Düzeltilmiş Final README.md

```markdown
# 📝 Multi-Platform ToDo Application

A modern, cross-platform task management application with seamless integration across Backend API, Web interface, and Android mobile app.

![Project Banner](https://img.shields.io/badge/Platform-MultiPlatform-blue)
![Backend](https://img.shields.io/badge/.NET-8.0-purple)
![Mobile](https://img.shields.io/badge/Kotlin-2.0-orange)
![Database](https://img.shields.io/badge/PostgreSQL-16-blue)

## 🚀 Features

- ✅ **Full CRUD Operations** - Create, read, update, and delete tasks
- 🔍 **Search Functionality** - Real-time task search across all platforms
- ✔️ **Task Completion** - Mark tasks as completed/pending
- 📱 **3 Platform Support** - Backend API, Web, and Android
- 🎨 **Modern UI** - Bootstrap 5 (Web) and Material 3 (Android)
- 🔄 **Real-time Sync** - All platforms share the same database
- 🌐 **RESTful API** - Well-documented API with Swagger

## 🛠️ Technology Stack

### Backend API
- **.NET 8.0** - Web API Framework
- **PostgreSQL 16** - Relational Database
- **Entity Framework Core** - ORM
- **Swagger/OpenAPI** - API Documentation

### Web Application
- **ASP.NET MVC** - Web Framework
- **Bootstrap 5** - Responsive UI Framework
- **HttpClient** - REST API Communication

### Android Application
- **Kotlin** - Programming Language
- **Jetpack Compose** - Modern UI Toolkit
- **MVVM Architecture** - Clean Architecture Pattern
- **Retrofit** - Type-safe HTTP Client
- **Coroutines & Flow** - Asynchronous Programming
- **Navigation Component** - App Navigation
- **Material 3** - Design System

## 📂 Project Structure

```

ToDoProject/
├── Backend/
│   └── ToDoAPI/              \\# .NET Web API
│       ├── Controllers/      \\# API Endpoints
│       ├── Models/          \\# Data Models
│       ├── Data/            \\# Database Context
│       └── Program.cs       \\# App Configuration
│
├── Web/
│   └── ToDoMVC/             \\# ASP.NET MVC Web App
│       ├── Controllers/     \\# MVC Controllers
│       ├── Views/          \\# Razor Views
│       ├── Models/         \\# View Models
│       └── Services/       \\# API Service Layer
│
└── Mobile/
└── ToDoAndroid/         \\# Kotlin Android App
├── data/           \\# Data Layer
│   ├── model/     \\# Data Models
│   ├── remote/    \\# Retrofit API
│   └── repository/ \\# Repository Pattern
├── ui/            \\# UI Layer
│   └── screens/   \\# Compose Screens
└── viewmodel/     \\# ViewModels (MVVM)

```

## 🔧 Installation & Setup

### Prerequisites

- **.NET SDK 8.0+**
- **PostgreSQL 14+**
- **Android Studio** (for Android development)
- **macOS / Windows / Linux**

### 1️⃣ Database Setup

```bash
# Start PostgreSQL service
# Create database using pgAdmin or psql
CREATE DATABASE "ToDoDb";
```


### 2️⃣ Backend API

```bash
cd Backend/ToDoAPI

# Update connection string in appsettings.json
# "DefaultConnection": "Host=localhost;Port=5432;Database=ToDoDb;Username=postgres;Password=YOUR_PASSWORD"

# Apply migrations
dotnet ef database update

# Run the API
dotnet run

# API will be available at: https://localhost:5099
# Swagger UI: https://localhost:5099/swagger
```


### 3️⃣ Web Application

```bash
cd Web/ToDoMVC

# Verify API URL in Services/ToDoApiService.cs
# private const string _baseUrl = "https://localhost:5099/api/ToDos";

# Run the web app
dotnet run
```


### 4️⃣ Android Application

```bash
# Open Android Studio
# Import project from Mobile/ToDoAndroid

# Update API base URL in data/remote/RetrofitInstance.kt
# For Emulator: private const val BASE_URL = "http://10.0.2.2:5098/"
# For Physical Device: private const val BASE_URL = "http://YOUR_IP:5098/"

# Sync Project with Gradle Files
# Run the app on emulator or physical device
```


## 🔌 API Endpoints

| Method | Endpoint | Description |
| :-- | :-- | :-- |
| GET | `/api/ToDos` | Get all tasks |
| GET | `/api/ToDos/{id}` | Get task by ID |
| GET | `/api/ToDos/search/{keyword}` | Search tasks |
| POST | `/api/ToDos` | Create new task |
| PUT | `/api/ToDos/{id}` | Update task |
| DELETE | `/api/ToDos/{id}` | Delete task |

### Sample Request (POST)

```json
{
  "name": "Complete project documentation",
  "isCompleted": false
}
```


### Sample Response

```json
{
  "id": 1,
  "name": "Complete project documentation",
  "isCompleted": false,
  "createdAt": "2026-02-08T21:00:00Z"
}
```


## 🏗️ Architecture

### Backend

- **RESTful API** design principles
- **Repository Pattern** for data access
- **Entity Framework Core** ORM
- **Dependency Injection**


### Web

- **MVC Pattern** - Model-View-Controller
- **Service Layer** - API communication abstraction
- **Responsive Design** - Bootstrap Grid System


### Android

- **MVVM Pattern** - Model-View-ViewModel
- **Repository Pattern** - Data layer abstraction
- **Clean Architecture** - Separation of concerns
- **Unidirectional Data Flow** - StateFlow implementation
- **Dependency Injection** - Manual DI


## 🧪 Testing

```bash
# Test Backend API with Swagger
https://localhost:5099/swagger

# Test API Endpoints with Postman/curl
curl -X GET https://localhost:5099/api/ToDos
```


## 🚀 Future Enhancements

- [ ] User authentication \\& authorization
- [ ] Dark/Light theme support
- [ ] Task categories and tags
- [ ] Due dates and reminders
- [ ] Priority levels (Low, Medium, High)
- [ ] Offline support with Room Database (Android)
- [ ] Push notifications
- [ ] Cloud deployment


## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

1. Fork the project
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is open source and available under the MIT License.

## 👨‍💻 Developer

**Baturalp**

- 💼 Software Developer
- 🛠️ .NET | Kotlin | Android Development
- 📍 Antalya, Turkey
- 🔗 [LinkedIn](https://www.linkedin.com/in/baturalptastan/)
- 📧 [Email](baturalptastan.ce@gmail.com)


## 🙏 Acknowledgments

This project was developed to demonstrate modern software development practices including:

- Cross-platform development
- RESTful API design
- Clean Architecture principles
- Modern UI frameworks (Jetpack Compose, Bootstrap 5)

---

⭐ If you found this project useful, please consider giving it a star!

Made with ❤️ using .NET, Kotlin, and PostgreSQL

```

Haklısın! Markdown formatı bozulmuş. İşte **tamamen düzeltilmiş** versiyon:

***

GitHub'da **Edit file** (kalem simgesi) tıkla ve **tamamını sil**, sonra şunu yapıştır:

```markdown
# 📝 Multi-Platform ToDo Application

A modern, cross-platform task management application with seamless integration across Backend API, Web interface, and Android mobile app.

![Project Banner](https://img.shields.io/badge/Platform-MultiPlatform-blue)
![Backend](https://img.shields.io/badge/.NET-8.0-purple)
![Mobile](https://img.shields.io/badge/Kotlin-2.0-orange)
![Database](https://img.shields.io/badge/PostgreSQL-16-blue)

## 🚀 Features

- ✅ **Full CRUD Operations** - Create, read, update, and delete tasks
- 🔍 **Search Functionality** - Real-time task search across all platforms
- ✔️ **Task Completion** - Mark tasks as completed/pending
- 📱 **3 Platform Support** - Backend API, Web, and Android
- 🎨 **Modern UI** - Bootstrap 5 (Web) and Material 3 (Android)
- 🔄 **Real-time Sync** - All platforms share the same database
- 🌐 **RESTful API** - Well-documented API with Swagger

## 🛠️ Technology Stack

### Backend API
- **.NET 8.0** - Web API Framework
- **PostgreSQL 16** - Relational Database
- **Entity Framework Core** - ORM
- **Swagger/OpenAPI** - API Documentation

### Web Application
- **ASP.NET MVC** - Web Framework
- **Bootstrap 5** - Responsive UI Framework
- **HttpClient** - REST API Communication

### Android Application
- **Kotlin** - Programming Language
- **Jetpack Compose** - Modern UI Toolkit
- **MVVM Architecture** - Clean Architecture Pattern
- **Retrofit** - Type-safe HTTP Client
- **Coroutines & Flow** - Asynchronous Programming
- **Navigation Component** - App Navigation
- **Material 3** - Design System

## 📂 Project Structure

```

ToDoProject/
├── Backend/
│   └── ToDoAPI/              \# .NET Web API
│       ├── Controllers/      \# API Endpoints
│       ├── Models/          \# Data Models
│       ├── Data/            \# Database Context
│       └── Program.cs       \# App Configuration
│
├── Web/
│   └── ToDoMVC/             \# ASP.NET MVC Web App
│       ├── Controllers/     \# MVC Controllers
│       ├── Views/          \# Razor Views
│       ├── Models/         \# View Models
│       └── Services/       \# API Service Layer
│
└── Mobile/
└── ToDoAndroid/         \# Kotlin Android App
├── data/           \# Data Layer
│   ├── model/     \# Data Models
│   ├── remote/    \# Retrofit API
│   └── repository/ \# Repository Pattern
├── ui/            \# UI Layer
│   └── screens/   \# Compose Screens
└── viewmodel/     \# ViewModels (MVVM)

```

## 🔧 Installation & Setup

### Prerequisites

- **.NET SDK 8.0+**
- **PostgreSQL 14+**
- **Android Studio** (for Android development)
- **macOS / Windows / Linux**

### 1️⃣ Database Setup

```bash
# Start PostgreSQL service
# Create database using pgAdmin or psql
CREATE DATABASE "ToDoDb";
```


### 2️⃣ Backend API

```bash
cd Backend/ToDoAPI

# Update connection string in appsettings.json
# "DefaultConnection": "Host=localhost;Port=5432;Database=ToDoDb;Username=postgres;Password=YOUR_PASSWORD"

# Apply migrations
dotnet ef database update

# Run the API
dotnet run

# API will be available at: https://localhost:5099
# Swagger UI: https://localhost:5099/swagger
```


### 3️⃣ Web Application

```bash
cd Web/ToDoMVC

# Verify API URL in Services/ToDoApiService.cs
# private const string _baseUrl = "https://localhost:5099/api/ToDos";

# Run the web app
dotnet run
```


### 4️⃣ Android Application

```bash
# Open Android Studio
# Import project from Mobile/ToDoAndroid

# Update API base URL in data/remote/RetrofitInstance.kt
# For Emulator: private const val BASE_URL = "http://10.0.2.2:5098/"
# For Physical Device: private const val BASE_URL = "http://YOUR_IP:5098/"

# Sync Project with Gradle Files
# Run the app on emulator or physical device
```


## 🔌 API Endpoints

| Method | Endpoint | Description |
| :-- | :-- | :-- |
| GET | `/api/ToDos` | Get all tasks |
| GET | `/api/ToDos/{id}` | Get task by ID |
| GET | `/api/ToDos/search/{keyword}` | Search tasks |
| POST | `/api/ToDos` | Create new task |
| PUT | `/api/ToDos/{id}` | Update task |
| DELETE | `/api/ToDos/{id}` | Delete task |

### Sample Request (POST)

```json
{
  "name": "Complete project documentation",
  "isCompleted": false
}
```


### Sample Response

```json
{
  "id": 1,
  "name": "Complete project documentation",
  "isCompleted": false,
  "createdAt": "2026-02-08T21:00:00Z"
}
```


## 🏗️ Architecture

### Backend

- **RESTful API** design principles
- **Repository Pattern** for data access
- **Entity Framework Core** ORM
- **Dependency Injection**


### Web

- **MVC Pattern** - Model-View-Controller
- **Service Layer** - API communication abstraction
- **Responsive Design** - Bootstrap Grid System


### Android

- **MVVM Pattern** - Model-View-ViewModel
- **Repository Pattern** - Data layer abstraction
- **Clean Architecture** - Separation of concerns
- **Unidirectional Data Flow** - StateFlow implementation
- **Dependency Injection** - Manual DI


## 🧪 Testing

```bash
# Test Backend API with Swagger
https://localhost:5099/swagger

# Test API Endpoints with Postman/curl
curl -X GET https://localhost:5099/api/ToDos
```


## 🚀 Future Enhancements

- [ ] User authentication \& authorization
- [ ] Dark/Light theme support
- [ ] Task categories and tags
- [ ] Due dates and reminders
- [ ] Priority levels (Low, Medium, High)
- [ ] Offline support with Room Database (Android)
- [ ] Push notifications
- [ ] Cloud deployment


## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

1. Fork the project
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is open source and available under the MIT License.

## 👨‍💻 Developer

**Baturalp**

- 💼 Software Developer
- 🛠️ .NET | Kotlin | Android Development
- 📍 Antalya, Turkey
- 🔗 [LinkedIn](https://www.linkedin.com/in/baturalptastan/)
- 📧 [Email](mailto:baturalptastan.ce@gmail.com)


## 🙏 Acknowledgments

This project was developed to demonstrate modern software development practices including:

- Cross-platform development
- RESTful API design
- Clean Architecture principles
- Modern UI frameworks (Jetpack Compose, Bootstrap 5)

---

⭐ If you found this project useful, please consider giving it a star!

Made with ❤️ using .NET, Kotlin, and PostgreSQL
