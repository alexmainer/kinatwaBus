package com.mit.kinatwabusapplication.ui.theme.screen.nairobiterminal

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mit.kinatwabusapplication.R
import com.mit.kinatwabusapplication.navigation.ROUTE_BOOKING

@Composable
fun CityBikesScreen(controller: NavHostController) {
    Column(
        modifier= Modifier.background(Color.White)
            .verticalScroll(rememberScrollState()),
    )
    {
        Text(
            text = "NAIROBI TERMINAL",
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            color = Color(0xFF4CAF50),
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 40.sp,
            letterSpacing = 0.1.em,
            lineHeight = 50.sp
        )

        Spacer(modifier = Modifier.height(10.dp))

        HorizontalImageScroll(
            listOf(
                R.drawable.mat,
                R.drawable.mat_i,
            )
        )

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(Color.White) // Background color of the card
        ) {


            Text(
                text = "From Nairobi to voi  ",
                modifier = Modifier.padding(16.dp),
                color = Color(0xFF4CAF50),
                fontFamily = FontFamily.Serif,
                fontSize = 20.sp
            )

            Text(
                text = "8:00 a.m  1000 ksh\n" +
                        "10:00 p.m 1200 ksh\n ",
                modifier = Modifier.padding(16.dp),
                color = Color(0xFFFFFFFF),
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp
            )


            Button(
                onClick = {
                    controller.navigate(ROUTE_BOOKING)

                },
                colors = ButtonDefaults.buttonColors(Color(0xFF4CAF50)),
                modifier = Modifier.padding(30.dp)

            )
            {
                Text(
                    text = " BOOK ",
                    color = Color.White
                )

            }
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(Color.White) // Background color of the card
        ) {


            Text(
                text = "From Nairobi to Kitui ",
                modifier = Modifier.padding(16.dp),
                color = Color(0xFF4CAF50),
                fontFamily = FontFamily.Serif,
                fontSize = 20.sp
            )

            Text(
                text = "8:00 a.m  500 ksh\n" +
                        "10:00 p.m 700 ksh\n",
                modifier = Modifier.padding(16.dp),
                color = Color(0xFFFFFFFF),
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp
            )


            Button(
                onClick = {
                    controller.navigate(ROUTE_BOOKING)

                },
                colors = ButtonDefaults.buttonColors(Color(0xFF4CAF50)),
                modifier = Modifier.padding(30.dp)

            )
            {
                Text(
                    text = " BOOK ",
                    color = Color.White
                )

            }
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(Color.White) // Background color of the card
        ) {


            Text(
                text = "From Nairobi to voi  ",
                modifier = Modifier.padding(16.dp),
                color = Color(0xFF4CAF50),
                fontFamily = FontFamily.Serif,
                fontSize = 20.sp
            )

            Text(
                text = "8:00 a.m  1000 ksh\n" +
                        "10:00 p.m 1200 ksh\n ",
                modifier = Modifier.padding(16.dp),
                color = Color(0xFFFFFFFF),
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp
            )


            Button(
                onClick = {
                    controller.navigate(ROUTE_BOOKING)

                },
                colors = ButtonDefaults.buttonColors(Color(0xFF4CAF50)),
                modifier = Modifier.padding(30.dp)

            )
            {
                Text(
                    text = " BOOK ",
                    color = Color.White
                )

            }
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(Color.White) // Background color of the card
        ) {


            Text(
                text = "From Nairobi to Mwingi ",
                modifier = Modifier.padding(16.dp),
                color = Color(0xFF4CAF50),
                fontFamily = FontFamily.Serif,
                fontSize = 20.sp
            )

            Text(
                text = "8:00 a.m  500 ksh\n" +
                        "10:00 p.m 700 ksh\n ",
                modifier = Modifier.padding(16.dp),
                color = Color(0xFFFFFFFF),
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp
            )


            Button(
                onClick = {
                    controller.navigate(ROUTE_BOOKING)

                },
                colors = ButtonDefaults.buttonColors(Color(0xFF4CAF50)),
                modifier = Modifier.padding(30.dp)

            )
            {
                Text(
                    text = " BOOK ",
                    color = Color.White
                )

            }
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(Color.White) // Background color of the card
        ) {


            Text(
                text = "From Nairobi to Machakos   ",
                modifier = Modifier.padding(16.dp),
                color = Color(0xFF4CAF50),
                fontFamily = FontFamily.Serif,
                fontSize = 20.sp
            )

            Text(
                text = "8:00 a.m  500 ksh\n" +
                        "10:00 p.m 700 ksh\n ",
                modifier = Modifier.padding(16.dp),
                color = Color(0xFFFFFFFF),
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp
            )


            Button(
                onClick = {
                    controller.navigate(ROUTE_BOOKING)

                },
                colors = ButtonDefaults.buttonColors(Color(0xFF4CAF50)),
                modifier = Modifier.padding(30.dp)

            )
            {
                Text(
                    text = " BOOK ",
                    color = Color.White
                )

            }
        }

    }


}
@Composable
fun HorizontalImageScroll(imageList: List<Int>) {
    LazyRow(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        items(imageList) { imageResId ->
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = null,
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
                    .padding(8.dp)
            )
        }
    }
}

@Preview
@Composable
fun CityBikesPreview() {
    CityBikesScreen(rememberNavController())

}