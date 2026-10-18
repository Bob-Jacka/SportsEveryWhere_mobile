package com.kirill.sportseverywhere_mobile.pages

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kirill.sportseverywhere_mobile.ui.theme.SportsEveryWhere_mobileTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SportsEveryWhere_mobileTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    start_menu(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun start_menu(modifier: Modifier = Modifier) {
    Column {
        Button(onClick = {}) {
            val navController = rememberNavController()

            NavHost(navController = navController, startDestination = "home") {
                composable(route = "training") {
                    CurrentDayTrainingActivity()
                }
                composable(route = "settings") {
                    ProfileScreen(navController = navController)
                }
            }
        }
        Button(onClick = {}) { }
    }
}