package com.example.segundoparcial_23453.ExamenP2

import android.util.Log
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun DragonLista(navegante : NavHostController){
    val dragonVM = DragonModeloView()
        Row(modifier = Modifier.fillMaxWidth()) {
            Text("Elige un dragon")
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = {navegante.navigate(Inicio)}) {
                Text("Regresar")
            }
        }
    LazyColumn(modifier = Modifier.padding(18.dp)) {
        items(dragonVM.getProducts()){ producto ->
            DragonView(producto)
        }
    }
}