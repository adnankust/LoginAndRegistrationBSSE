package com.example.loginandregistrationbsse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginandregistrationbsse.ui.theme.LoginAndRegistrationBSSETheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginAndRegistrationBSSETheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    NavigationApp()
                }
            }
        }
    }
}

@Composable
fun NavigationApp() {
     val navController = rememberNavController()
     NavHost(navController = navController, startDestination = Screen.Login.route) {
         composable(Screen.Login.route){LoginScreen(navController)}
         composable(Screen.Registration.route){RegistrationScreen(navController)}
     }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LoginAndRegistrationBSSETheme {
        NavigationApp()
    }
}