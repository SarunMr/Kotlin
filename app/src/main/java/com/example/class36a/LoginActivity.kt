package com.example.class36a


import android.os.Bundle
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 20.dp)

        ) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowLeft,
                contentDescription = null,
                modifier = Modifier.height(50.dp).width(50.dp)
            )
            Text(
                text = "Andrew",
                fontSize =  20.sp,
                fontWeight = FontWeight.Bold,
            )
            Icon(
                painterResource(R.drawable.baseline_more_horiz_24),
                contentDescription = null,
                modifier = Modifier.height(50.dp).width(50.dp)
            )
        }
        Row (){
            Image(
                painter = painterResource(R.drawable.person),
                contentDescription = null,
                modifier = Modifier
                    .height(120.dp).width(120.dp)
                    .clip(shape = RoundedCornerShape(100.dp))
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewInsta() {
    InstaClone(innerPadding = PaddingValues(0.dp))

}