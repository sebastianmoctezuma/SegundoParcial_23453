package com.example.segundoparcial_23453.ExamenP2

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable

@Serializable
object Inicio



@Serializable
object Lista


@Preview(showBackground = true)
@Composable
fun NavManager(){
    val navController = rememberNavController()
    NavHost(navController, startDestination = Inicio ) {
        composable<Inicio>{
            LibrosView(navController)
        }
        composable<Lista>{
            DragonLista(navController)
        }

    }

}