package com.example.class36a


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Scaffold { innerPadding ->
                InstaClone(innerPadding)
            }
        }
    }
}

@Composable
fun InstaClone(innerPadding : PaddingValues){
    Column(
        modifier =
            Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(color = Color.White)
    ) {
        Row() {
            Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = null)

        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewInsta() {
    InstaClone(innerPadding = PaddingValues(0.dp))

}