package com.example.segundoparcial_23453.ExamenP2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.segundoparcial_23453.R


@Composable
fun LibrosView(navegante: NavHostController){
    Box(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(R.drawable.libro),
            contentDescription = "Libro dragones",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize(),
            )
        }
    OutlinedButton(onClick = {
        navegante.navigate(Lista)
    }) {
        Text("Abrir")
    }
}