package com.pwr.feels.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pwr.feels.ui.screens.HomeScreen

fun NavGraphBuilder.authorizedNavGraph(navController: NavHostController) {
    navigation(startDestination = Route.HOME, route = Route.AUTHORIZED_GRAPH) {
        composable(Route.HOME) {
            HomeScreen(
                onLogout = {
                    navController.navigate(Route.UNAUTHORIZED_GRAPH) {
                        popUpTo(Route.AUTHORIZED_GRAPH) { inclusive = true }
                    }
                })
        }


    }
}