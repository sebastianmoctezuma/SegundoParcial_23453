package com.example.segundoparcial_23453.ExamenP2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.segundoparcial_23453.R

@Composable
fun DragonView(dragon : DragonModelo){
    Card(modifier = Modifier.fillMaxWidth()) {
        Box() {
            Column(Modifier.fillMaxWidth()) {
                Image(
                    modifier = Modifier.height(250.dp).fillMaxWidth(),
                    painter = painterResource(dragon.imagen),
                    contentDescription = "imagen del animal",
                )
                Text(dragon.nombre)
            }

        }
    }

}