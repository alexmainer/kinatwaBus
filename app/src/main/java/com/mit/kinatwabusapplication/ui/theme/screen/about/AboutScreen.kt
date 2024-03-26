package com.mit.kinatwabusapplication.ui.theme.screen.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mit.kinatwabusapplication.R
import com.mit.kinatwabusapplication.navigation.ROUTE_ABOUT
import com.mit.kinatwabusapplication.navigation.ROUTE_CONTACT_US
import com.mit.kinatwabusapplication.navigation.ROUTE_DETAILS
import com.mit.kinatwabusapplication.navigation.ROUTE_HOME

@androidx.compose.runtime.Composable
fun AboutScreen(controller: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(rememberScrollState()
        ),
        horizontalAlignment = Alignment.CenterHorizontally,
    )
    {
       //Spacer(modifier = Modifier.height(19.dp))

        Surface(
            //color = MaterialTheme.colorScheme.primary,
            color= Color.Transparent,
//            elevation = 2.dp,
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
                    // Add text for each screen in the navigation bar
                    Text(
                        text = "HOME",
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF4CAF50),
                        modifier = Modifier
                            .padding(8.dp)
                            .clickable {
                                controller.navigate(ROUTE_HOME)
                            }
                    )

                    Text(
                        text = "ABOUT US",
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF4CAF50),
//                    style = MaterialTheme.typography.h6,
                        modifier = Modifier
                            .padding(4.dp)
                            .clickable {
                                controller.navigate(ROUTE_ABOUT)
                            }
                    )
                    Text(
                        text = "CONTACT US",
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF4CAF50),
//                    style = MaterialTheme.typography.h6,
                        modifier = Modifier
                            .padding(4.dp)
                            .clickable {
                                controller.navigate(ROUTE_CONTACT_US)
                            }
                    )
                    Text(
                        text = "RECEIPTS",
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF4CAF50),
//                    style = MaterialTheme.typography.h6,
                        modifier = Modifier
                            .padding(4.dp)
                            .clickable {
                                controller.navigate(ROUTE_DETAILS)
                            }
                    )

                    // Add more text for other screens as needed
                }
            }
        }

        Text(
            text = "ABOUT US",
            color = Color(0xFF4CAF50),
            fontFamily = FontFamily.SansSerif,
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold
        )

        Spacer(modifier = Modifier.height(10.dp))

        Image(
            painter = painterResource(id = R.drawable.kin_logo),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
                .border(
                width = 3.dp,
                color = Color(0xFF4CAF50),
                shape = CircleShape
            )
        )
        Spacer(modifier = Modifier.height(30.dp))


        Text(
            text = "Welcome to Kinatwa bus company . we strive to provide our customers with the best travel experience possible. We aim to make your \" +\n" +
                    "\"journey hustle free and convenient, but we don’t stop there we also offer other valuable insights to help our esteemed customers\" +\n" +
                    "\" informed with our operations. From real-time bus availability to detailed information about routes and fares we’ve got you covered.\" +\n" +
                    " \" Let the journey begin!.",
            color = Color(0xFF070707),
            fontFamily = FontFamily.SansSerif,
            fontSize = 15.sp
        )
        Spacer(modifier = Modifier.height(30.dp))


        Text(
            text = "Vision\n " +
                    "We strive to be a go_to platform for bus travelers offering a comprehensive network of routes , reliable operators and competitive " +
                    "prices . Through continuous innovation and customer centric approach , we envision a future where bus travel is not only convenient " +
                    "but also eco_friendly , contributing to a connected world",
            color = Color(0xFF070707),
            fontFamily = FontFamily.SansSerif,
            fontSize = 15.sp
        )
        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Mission\n" +
                    "Our mission is to revolutionalize bus booking and travelling by providing the best platform that is seamless and convenient to our " +
                    "customers. We aim to offering exceptional customer service and user friendly experience not to mention ensuring that every journey " +
                    "is comfortable and enjoyable",
            color = Color(0xFF070707),
            fontFamily = FontFamily.SansSerif,
            fontSize = 15.sp
        )

        Spacer(modifier = Modifier.height(30.dp))

//        Text(
//            text = "Location\n" +
//                    "Avispa Bike Hire Company is nestled in the heart of [Wakanda], a region renowned for its stunning natural beauty and diverse cycling trails. " +
//                    "Our strategic location allows easy access scenic routes, varying in difficulty and terrain, ensuring there's a perfect ride for everyone," +
//                    " from beginners to avid cyclists.",
//            color = Color(0xFF070707),
//            fontFamily = FontFamily.SansSerif,
//            fontSize = 15.sp
//        )
//        Spacer(modifier = Modifier.height(10.dp))


        Text(
            text = "Connecting Hearts,One Route at a Time",
            color = Color(0xFFCDDC39),
            fontFamily = FontFamily.SansSerif,
            fontSize = 15.sp
        )


    }

}
@Preview
@Composable
fun AboutPreview() {
    AboutScreen(rememberNavController())

}