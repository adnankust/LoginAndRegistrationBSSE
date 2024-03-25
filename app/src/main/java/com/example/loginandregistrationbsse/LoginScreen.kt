package com.example.loginandregistrationbsse

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun LoginScreen(navController: NavController) {
    var username by remember{ mutableStateOf("") }
    var password by remember{mutableStateOf("")}

    Column(modifier = Modifier.padding(16.dp),
          verticalArrangement = Arrangement.Center,
          ) {

        Text("Login", style = MaterialTheme.typography.h5)
        TextField(value = username, onValueChange = {username = it}, label = { Text("Username")})
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = password, onValueChange = {password = it}, label = { Text("Password")},
        visualTransformation = PasswordVisualTransformation())
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { /*TODO*/ }) {
            Text("Login")
        }
        Spacer(modifier = Modifier.height(8.dp))
       TextButton(onClick = { navController.navigate(Screen.Registration.route) }) {
           Text("Don't have an account? Register")
       }

    }
}