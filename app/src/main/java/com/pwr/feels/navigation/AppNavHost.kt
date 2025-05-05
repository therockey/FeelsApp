package com.pwr.feels.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavHost() {
    val navController = rememberNavController()
    Scaffold { padding ->
        NavHost(
            navController = navController,
            startDestination = Route.UNAUTHORIZED_GRAPH,
            modifier = Modifier.padding(padding)
        ) {
            unauthorizedNavGraph(navController)
            authorizedNavGraph(navController)
        }
    }
}

