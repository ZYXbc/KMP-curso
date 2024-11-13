package org.alvaroaa.helloworldkmp

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import helloworld.composeapp.generated.resources.Res
import helloworld.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
        var name:String by remember { mutableStateOf("")}
        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = name,
                onValueChange = {name = it}
            )

            Spacer(modifier = Modifier.height(38.dp))
            AnimatedVisibility(name.isNotEmpty()){
                if(name =="Alvaro") //Mi nombre completo no el del tutorial
                    Text("PRUEBA!!!!!!!", fontSize = 30.sp)
                else
                Text("Hola $name", fontSize = 24.sp)
            }
        }
    }
}
