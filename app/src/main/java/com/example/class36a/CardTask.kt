package com.example.class36a

import android.os.Bundle
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.class36a.ui.theme.*
class CardTask : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Scaffold { innerPadding ->
                CardClone(innerPadding)
            }
        }
    }
}

@Composable
fun CardClone(innerPadding : PaddingValues){
    Column(
        modifier =
            Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(color = Green40)
    ){
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 5.dp),
            verticalAlignment =Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {
            Image(
                painter = painterResource(R.drawable.person),
                contentDescription = null,
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp)
                    .clip(shape = RoundedCornerShape(100.dp))
            )
        }
        Column (
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 20.dp)
        ){
            Text(
                text = "Card",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Text(
                text = "Simple and easy to use app",
                fontSize = 16.sp,
                color = Color.White,
                modifier = Modifier.alpha(alpha = 0.8f)
            )
        }
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ){
            Card (
                modifier = Modifier.weight(1f)
            ){
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(16.dp)
                ){
                    Image(
                        painter = painterResource(R.drawable.bible_icon),
                        contentDescription = "Bible",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(bottom = 8.dp)
                    )
                    Text(
                        text = "Text",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                    )
                    Text(
                        text = "Lorem text below",
                        modifier = Modifier.alpha(alpha = 0.5f)
                    )

                }
            }

            Card (
                modifier = Modifier.weight(1f)
            ){
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(16.dp)
                ){
                    Image(
                        painter = painterResource(R.drawable.bible_icon),
                        contentDescription = "Bible",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(bottom = 8.dp)
                    )
                    Text(
                        text = "Address",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                    )
                    Text(
                        text = "Lorem text below",
                        modifier = Modifier.alpha(alpha = 0.5f)
                        )

                }
            }

        }

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ){
            Card (
                modifier = Modifier.weight(1f)
            ){
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(16.dp)
                ){
                    Image(
                        painter = painterResource(R.drawable.bible_icon),
                        contentDescription = "Bible",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(bottom = 8.dp)
                    )
                    Text(
                        text = "Character",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                    )
                    Text(
                        text = "Lorem text below",
                        modifier = Modifier.alpha(alpha = 0.5f)
                    )

                }
            }

            Card (
                modifier = Modifier.weight(1f)
            ){
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(16.dp)
                ){
                    Image(
                        painter = painterResource(R.drawable.bible_icon),
                        contentDescription = "Bible",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(bottom = 8.dp)
                    )
                    Text(
                        text = "Bank Card",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                    )
                    Text(
                        text = "Lorem text below",
                        modifier = Modifier.alpha(alpha = 0.5f)
                    )

                }
            }

        }

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ){
            Card (
                modifier = Modifier.weight(1f)
            ){
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(16.dp)
                ){
                    Image(
                        painter = painterResource(R.drawable.bible_icon),
                        contentDescription = "Bible",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(bottom = 8.dp)
                    )
                    Text(
                        text = "Password",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                    )
                    Text(
                        text = "Lorem text below",
                        modifier = Modifier.alpha(alpha = 0.5f)
                    )

                }
            }

            Card (
                modifier = Modifier.weight(1f)
            ){
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(16.dp)
                ){
                    Image(
                        painter = painterResource(R.drawable.bible_icon),
                        contentDescription = "Bible",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(bottom = 8.dp)
                    )
                    Text(
                        text = "Logistics",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                    )
                    Text(
                        text = "Lorem text below",
                        modifier = Modifier.alpha(alpha = 0.5f)
                    )

                }
            }

        }

        Card(
            modifier = Modifier.padding(horizontal = 20.dp).height(height = 110.dp)
        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
            ){
                Image(
                    painter = painterResource(R.drawable.settings_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(70.dp)
                )
                Column (
                    modifier = Modifier.padding(16.dp)
                ){
                    Text(
                        text = "Settings",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Text(
                        text = "lorem text for settings",
                        modifier = Modifier.alpha(alpha = 0.5f)
                    )
                }
            }

        }
    }

}
@Preview(showBackground = true)
@Composable
fun PreviewCard() {
    CardClone(innerPadding = PaddingValues(0.dp))

}
