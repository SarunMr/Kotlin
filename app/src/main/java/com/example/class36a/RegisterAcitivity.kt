package com.example.class36a

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsEndWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.class36a.ui.theme.Class36ATheme

class RegisterAcitivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold {padding ->
                RegisterBody(padding)
            }
            }
        }
    }


@Composable
fun RegisterBody(paddingValues: PaddingValues){

    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
       Text(
           text="Register",
           fontSize = 20.sp,
           fontWeight = FontWeight.Bold,
           )
        Row (
            modifier = Modifier
                .padding(horizontal = 15.dp).weight(1f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround,
        ){
            OutlinedTextField(
                value = firstName,
                onValueChange = {
                    firstName = it
                },
                modifier = Modifier
                    .padding(horizontal = 15.dp).weight(1f),
                placeholder = {
                    Text(text = "FirstName")
                },
//            minLines = 4,
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Gray.copy(alpha = 0.2f),
                    focusedIndicatorColor = Color.Green,
                    unfocusedContainerColor = Color.Gray.copy(alpha = 0.2f),
                    unfocusedIndicatorColor = Color.Blue
                ),
                shape = RoundedCornerShape(12.dp),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text
                )
            )
            OutlinedTextField(
                value = lastName,
                onValueChange = {
                    lastName = it
                },
                modifier = Modifier
                    .padding(horizontal = 15.dp).weight(1f),

                placeholder = {
                    Text(text = "LastName")
                },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Gray.copy(alpha = 0.2f),
                    focusedIndicatorColor = Color.Green,
                    unfocusedContainerColor = Color.Gray.copy(alpha = 0.2f),
                    unfocusedIndicatorColor = Color.Blue
                ),
                shape = RoundedCornerShape(12.dp),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text
                )
            )
        }
    }




}

@Preview(showBackground = true)
@Composable
fun RegisterPreview() {
    RegisterBody(paddingValues = PaddingValues(0.dp))
}