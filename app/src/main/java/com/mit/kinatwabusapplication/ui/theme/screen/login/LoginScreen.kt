package com.mit.kinatwabusapplication.ui.theme.screen.login

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mit.kinatwabusapplication.R
import com.mit.kinatwabusapplication.data.AuthViewModel
import com.mit.kinatwabusapplication.navigation.ROUTE_REGISTER


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(controller:NavHostController) {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var pass by remember { mutableStateOf(TextFieldValue("")) }
    val context = LocalContext.current


    Box(modifier = Modifier.fillMaxSize().background(Color.White)) {
        Image(
            painter = painterResource(id = R.drawable.gb),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Text(
                text = "Log In",
                color = Color(0xFFFF9800),
                fontFamily = FontFamily.Serif,
                fontSize = 40.sp
            )
            Spacer(modifier = Modifier.height(79.dp))

            Image(
                painter = painterResource(id = R.drawable.prof),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape)
                    .border(
                        width = 5.dp,
                        color = Color.White,
                        shape = CircleShape
                    )
            )

            Spacer(modifier = Modifier.height(19.dp))

            OutlinedTextField(
                value = email,
                label = { Text(text = "Enter Email Address", color = Color.Black) },
                singleLine = true,
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Email,
                    imeAction = ImeAction.Next
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    //.background(MaterialTheme.colorScheme.background)
                    .padding(8.dp),
                onValueChange = {
                    email = it
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    textColor = Color.Black, // Set text color to black
                    focusedBorderColor = Color.Yellow, // Change border color when focused
                    unfocusedBorderColor = Color.Gray, // Change border color when not focused
                    cursorColor = Color.Black // Set cursor color to black
                ),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = null,
                        //tint = MaterialTheme.colorScheme.primary
                    )
                }
            )


            Spacer(modifier = Modifier.height(10.dp))

            OutlinedTextField(
                value = pass,
                label = { Text(text = "Enter Password", color = Color.Black) },
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                onValueChange = {
                    pass = it
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    textColor = Color.Black, // Set text color to black
                    focusedBorderColor = Color.Blue, // Change border color when focused
                    unfocusedBorderColor = Color.Gray, // Change border color when not focused
                    cursorColor = Color.Black // Set cursor color to black
                ),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = null,
                        //tint = MaterialTheme.colorScheme.primary
                    )
                }
            )

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = {
                    val mylogin = AuthViewModel(controller, context)
                    mylogin.login(email.text.trim(), pass.text.trim())
                    //controller.navigate(ROUTE_HOME)
                },
                colors = ButtonDefaults.buttonColors(Color.Black),
            )
            {
                Text(text = "LogIn", color = Color.White)


            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = { controller.navigate(ROUTE_REGISTER) },
                modifier = Modifier.fillMaxWidth(),
                border = BorderStroke(0.dp, Color.Transparent), // Remove the border
                colors = ButtonDefaults.buttonColors(Color.White)
            ) // Set a custom background color)
            {
                Text(
                    text = "Don't have an account? Click to register",
//            color = Color.Black,
                    color = Color(0xFF7D5260),
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )


            }

        }
    }
}


@Preview
@Composable
fun LogInPreview() {
    LoginScreen(rememberNavController())

}
