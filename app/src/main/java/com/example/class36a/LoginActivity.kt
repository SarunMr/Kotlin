package com.example.class36a


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
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
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 20.dp)
        ){
            Image(
                painter = painterResource(R.drawable.person),
                contentDescription = null,
                modifier = Modifier
                    .height(120.dp).width(120.dp)
                    .clip(shape = RoundedCornerShape(100.dp))
            )
            Column (
               verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text("174")
                Text("Posts")
            }

            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text("177k")
                Text("Followers")
            }

            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text("774")
                Text("Following")
            }
        }
        Column(
            modifier = Modifier.padding(
                horizontal = 15.dp,
                vertical = 15.dp
            )
        ){
            Text("Andrew Queo")
            Text("Programmer", modifier = Modifier.alpha(alpha = 0.5f))
            Text("I use neovim btw")
            Text("issbella@art.com")
            Text("Followed by jeena and anna")
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 10.dp)
        ) {
            Button(
                onClick = {},
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White
                ),
                ) {
                Text(text = "Follow")
            }

            Button(
                onClick = {},
                shape = RoundedCornerShape(10.dp),
                border = BorderStroke(1.dp,Color.Gray),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color.Black
                ),
            ) {
                Text(text = "Message")
            }

            Button(
                onClick = {},
                shape = RoundedCornerShape(10.dp),
                border = BorderStroke(1.dp,Color.Gray),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color.Black
                ),
            ) {
                Text(text = "Email")
            }

            Button(
                onClick = {},
                shape = RoundedCornerShape(10.dp),
                border = BorderStroke(1.dp,Color.Gray),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color.Black
                ),
            ) {
                Icon(
                    painterResource(R.drawable.baseline_keyboard_arrow_down_24),
                    contentDescription = null,
                    modifier = Modifier.height(25.dp).width(25.dp)
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewInsta() {
    InstaClone(innerPadding = PaddingValues(0.dp))

}