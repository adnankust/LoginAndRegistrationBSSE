package com.example.loginandregistrationbsse

sealed class Screen(val route: String) {
    object Login: Screen("login_screen")
    object Registration: Screen("registration_screen")
}
