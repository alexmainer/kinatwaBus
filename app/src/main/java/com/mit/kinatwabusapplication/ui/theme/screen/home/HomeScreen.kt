package com.mit.kinatwabusapplication.ui.theme.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
import com.mit.kinatwabusapplication.navigation.ROUTE_ABOUT
import com.mit.kinatwabusapplication.navigation.ROUTE_CITY_BIKES
import com.mit.kinatwabusapplication.navigation.ROUTE_CONTACT_US
import com.mit.kinatwabusapplication.navigation.ROUTE_HOME
import com.mit.kinatwabusapplication.navigation.ROUTE_KID_BIKES
import com.mit.kinatwabusapplication.navigation.ROUTE_MOUNTAIN_BIKES

//@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(controller: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {

        Surface(
            color= Color.Transparent,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .background(Color.White) // Background color of the card
                    .clickable { /* Handle card click if needed */ }
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    NavigationItem(
                        text = "HOME",
                        route = ROUTE_HOME,
                        controller = controller
                    )

                    NavigationItem(
                        text = "ABOUT US",
                        route = ROUTE_ABOUT,
                        controller = controller
                    )

                    NavigationItem(
                        text = "CONTACT US",
                        route = ROUTE_CONTACT_US,
                        controller = controller
                    )
                }
            }
        }

        Text(
            text = "KINATWA SACCO",
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


        HorizontalImageScroll(listOf(R.drawable.city2,R.drawable.m4,R.drawable.kid))



        Spacer(modifier = Modifier.height(10.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(Color.White) // Background color of the card
                .clickable { controller.navigate(ROUTE_MOUNTAIN_BIKES)}
        ) {

            Text(
                text = "MOMBASA TERMINAL ",
                modifier = Modifier.padding(16.dp),
                color = Color(0xFFFF9800),
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )

            Text(
                text =  "To : Nairobi\n" +
                        "To : Voi\n" +
                        "To : Kitui \n" +
                        "To : Mwingi\n" +
                        "To : Machakos \n" +
                        "To : Wote\n",
                modifier = Modifier.padding(8.dp),
                color = Color(0xFFFFFEFE),
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp
            )

            Button(
                onClick = {
                    //controller.navigate(ROUTE_MOUNTAIN_BIKES)
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(Color.Transparent)
            )
            {
                Text(
                    text = "View Routes",
                    color = Color(0xFFFF9800),
                    fontWeight = FontWeight.Bold

                )

            }
        }

        Spacer(modifier = Modifier.height(4.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(Color.White) // Background color of the card
                .clickable { controller.navigate(ROUTE_CITY_BIKES) }
        ) {

            Text(
                text = "NAIROBI TERMINAL ",
                modifier = Modifier.padding(16.dp),
                color = Color(0xFFFF9800),
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )


            Text(
                text = "To : Mombasa  \n" +
                        "To : Voi\n" +
                        "To : Kitui \n" +
                        "To : Mwingi\n" +
                        "To : Machakos \n" +
                        "To : Wote\n",
                modifier = Modifier.padding(8.dp),
                color = Color(0xFFFFFCFC),
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp
            )

            Button(
                onClick = {
                    //controller.navigate(ROUTE_CITY_BIKES)
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(Color.Transparent)
            )
            {
                Text(
                    text = "View Routes",
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFF9800),
                )

            }
        }

        Spacer(modifier = Modifier.height(4.dp))

//        Card(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(8.dp)
//                .background(Color.White) // Background color of the card
//                .clickable { controller.navigate(ROUTE_KID_BIKES) }
//        ) {

//            Text(
//                text = "KIDS BIKES ",
//                modifier = Modifier.padding(16.dp),
//                color = Color(0xFFFF9800),
//                fontFamily = FontFamily.Serif,
//                fontWeight = FontWeight.Bold,
//                fontSize = 20.sp
//            )
//
//            Text(
//                text = "Introduce your little ones to the joy of cycling with our specially designed kid bikes for hire. Engineered with safety and fun in mind, our kid bikes" +
//                        " allow young riders to embark on exciting adventures. Watch their confidence grow as they pedal through parks, neighborhoods, and beyond",
//                modifier = Modifier.padding(8.dp),
//                color = Color(0xFFFFFFFF),
//                fontFamily = FontFamily.Serif,
//                fontSize = 15.sp
//            )
//
//            Button(
//                onClick = {
//                    //controller.navigate(ROUTE_KID_BIKES)
//                },
//                modifier = Modifier.fillMaxWidth(),
//                colors = ButtonDefaults.buttonColors(Color.Transparent)
//            )
//            {
//                Text(
//                    text = "View Bikes",
//                    fontWeight = FontWeight.Bold,
//                    color = Color(0xFFFF9800),
//                )
//
//            }
//        }

        Text(
            text = "Connecting Hearts, One Route at a Time",
            color = Color(0xFF000000),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.SansSerif,
            fontSize = 15.sp
        )


    }
}

@Composable
private fun NavigationItem(text: String, route: String, controller: NavHostController) {
    Text(
        text = text,
        color = Color(0xFFFFFFFF),
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .padding(10.dp)
            .clickable {
                controller.navigate(route)
            }
    )
}


@Composable
fun HorizontalImageScroll(imageList: List<Int>) {
    LazyRow(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {

        items(imageList) { imageResId ->
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = null,
                modifier = Modifier
                    .width(300.dp)
                    .height(200.dp)
                    .padding(8.dp)
            )
        }
    }
}




@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen(rememberNavController())

}



