# 📁 What Goes Where?

This guide helps you structure your project in a scalable and maintainable way.

---

## 🔧 di/
Dependency Injection modules.

- Declare all injected classes using Hilt.
- Use `AppModule` for general app-wide dependencies.
- Create feature-specific modules like `NetworkModule`, `StorageModule`, etc.

---

## 🎨 ui/
User interface components.

- All screens, composables, and fragments go here.
- Organize screens into folders by feature (e.g., `login/`, `home/`).
- Screen files should be suffixed with `Screen`, e.g. `LoginScreen.kt`.

---

## 🌐 network/
All network-related logic.

- `ApiService.kt` – Retrofit API interface
- `AuthInterceptor.kt`, `LoggingInterceptor.kt`
- Optional: `ApiClient.kt` if you're not using Hilt modules

---

## 📊 viewmodel/
State and logic for each screen.

- All `ViewModel` classes go here
- Use Hilt for injection
- Name format: `HomeViewModel.kt`, `LoginViewModel.kt`

---

## 💾 data/
Everything related to data management.

### 📁 repository/
- Contains repository interfaces and implementations
- Suffix with `Repository`, e.g., `UserRepository.kt`
- Should be the only layer accessing both local + remote data

### 📁 local/
- Contains local data sources like `DataStore`, `SharedPreferences`, or Room DAOs

### 📁 models/
- DTOs, entities, and model classes used across the app

---

## 🧭 navigation/
Navigation structure and route definitions.

- `Route.kt` – all route constants
- `AppNavHost.kt` – root navigation host
- Feature-specific graphs like `HomeNavGraph.kt`, `AuthNavGraph.kt`

---

## 🛠 utils/
Generic helper classes.

- Extensions
- Mappers
- Other utilities that don’t fit in other categories

---

# 💡 Tips

- 📝 **Avoid hardcoded strings** – Use `strings.xml` and access them via `stringResource(R.string.some_text)`
- 🧼 **Don’t access `ApiService` or `DataStore` directly in ViewModels** – Use a Repository instead for clean separation of concerns.
- use Enums for constants like `Status`, `Type`, etc, avoid STRINGS, INTS, etc.