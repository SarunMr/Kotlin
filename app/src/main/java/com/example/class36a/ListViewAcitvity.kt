package com.example.class36a

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class ListViewAcitvity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ListViewBody()
        }
    }
}

@Composable
@Preview(showBackground = true)
fun ListViewBody(){
    Scaffold (){padding ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)
            .padding(padding),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Box(modifier = Modifier.height(200.dp).fillMaxWidth().background(color = Color.Red).padding(20.dp))

            Box(modifier = Modifier.height(200.dp).fillMaxWidth().background(color = Color.Green).padding(20.dp))

            Box(modifier = Modifier.height(200.dp).fillMaxWidth().background(color = Color.Yellow).padding(20.dp))
            Box(modifier = Modifier.height(200.dp).fillMaxWidth().background(color = Color.Blue).padding(20.dp))
            Box(modifier = Modifier.height(200.dp).fillMaxWidth().background(color = Color.Magenta).padding(20.dp))
        }
    }

}
@Composable
fun PreviewListViewBody(){
    ListViewBody()

}