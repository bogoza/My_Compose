package com.example.my_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.my_compose.ui.theme.My_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TV()
        }
    }
    @Preview
    @Composable
    fun TV(){
        Row(modifier = Modifier.background(Color.Gray).fillMaxHeight(0.5f).fillMaxWidth()) {
            Column(
                modifier = Modifier.background(Color.Cyan).fillMaxHeight().fillMaxWidth(0.5f),
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "Hello World!")
                Text(text = "Hello World!")
                Text(text = "Hello World!")
            }
            Column(
                modifier = Modifier.background(Color.Green).fillMaxSize(),
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "Hello World!")
                Text(text = "Hello World!")
                Text(text = "Hello World!")
            }
        }
    }
}
