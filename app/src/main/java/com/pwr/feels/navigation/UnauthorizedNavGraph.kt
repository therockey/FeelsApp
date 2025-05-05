package com.pwr.feels.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pwr.feels.ui.screens.LoginScreen

fun NavGraphBuilder.unauthorizedNavGraph(navController: NavHostController) {
    navigation(startDestination = Route.LOGIN, route = Route.UNAUTHORIZED_GRAPH) {
        composable(Route.LOGIN) {
            LoginScreen(
                onLoginSuccess = {
                    navController.navigate(Route.AUTHORIZED_GRAPH) {
                        popUpTo(Route.AUTHORIZED_GRAPH) { inclusive = true }
                    }
                }
            )
        }
    }
}