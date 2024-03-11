package com.mit.kinatwabusapplication.ui.theme.screen.kidbikes

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
fun KidBikesScreen(controller: NavHostController) {
    Column(
        modifier= Modifier.background(Color.White)
            .verticalScroll(rememberScrollState()),
    )
    {

        Text(
            text = "KIDS BIKES",
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            color = Color(0xFFFF9800),
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
                R.drawable.kid1,
                R.drawable.kid
            )
        )

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(Color.White) // Background color of the card

        ) {


            Text(
                text = "KIDS BIKES ",
                modifier = Modifier.padding(16.dp),
                color = Color(0xFFFF9800),
                fontFamily = FontFamily.Serif,
                fontSize = 20.sp
            )

            Text(
                text = "Unlock the thrill of childhood exploration with our range of kid bikes for rent. Tailored to nurture young riders' confidence and coordination," +
                        " our kid-friendly bikes offer a secure and enjoyable journey",
                modifier = Modifier.padding(16.dp),
                color = Color(0xFFFFFFFF),
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp
            )


            Text(
                text = "PRICE : KSH 150 per Hour ",
                modifier = Modifier.padding(16.dp),
                color = Color(0xFFFF9800),
                fontFamily = FontFamily.Serif,
                fontSize = 20.sp
            )


            Button(
                onClick = {
                    controller.navigate(ROUTE_BOOKING)

                },
                colors = ButtonDefaults.buttonColors(Color.Black),
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
fun KidBikesPreview() {
    KidBikesScreen(rememberNavController())

}