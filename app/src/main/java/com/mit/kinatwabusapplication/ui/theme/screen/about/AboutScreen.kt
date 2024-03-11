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
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Add text for each screen in the navigation bar
                Text(
                    text = "HOME",
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF090808),
                    modifier = Modifier
                        .padding(8.dp)
                        .clickable {
                            controller.navigate(ROUTE_HOME)
                        }
                )

                Text(
                    text = "ABOUT US",
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF020202),
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
                    color = Color(0xFF020202),
//                    style = MaterialTheme.typography.h6,
                    modifier = Modifier
                        .padding(4.dp)
                        .clickable {
                            controller.navigate(ROUTE_CONTACT_US)
                        }
                )

                // Add more text for other screens as needed
            }
        }

        Text(
            text = "ABOUT US",
            color = Color(0xFFFF9800),
            fontFamily = FontFamily.SansSerif,
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold
        )

        Spacer(modifier = Modifier.height(10.dp))

        Image(
            painter = painterResource(id = R.drawable.la),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
                .border(
                    width = 5.dp,
                    color = Color.Black,
                    shape = CircleShape
                )
        )
        Spacer(modifier = Modifier.height(30.dp))


        Text(
            text = "Welcome to Avispa Bike Hire Company! We are passionate about providing exceptional bike rental services to enhance your cycling experience in the beautiful" +
                    " landscapes of Wakanda. Our mission is to promote an active and sustainable lifestyle while exploring the wonders on two wheels.",
            color = Color(0xFF070707),
            fontFamily = FontFamily.SansSerif,
            fontSize = 15.sp
        )
        Spacer(modifier = Modifier.height(30.dp))


        Text(
            text = "Functions\n \n" +
                    " 1. Quality Bike Rentals\n \n" +
                    "At Avispa Bike Hire Company, we offer a wide range of meticulously maintained bicycles suitable for different preferences and riding styles." +
                    " Whether you're into leisurely rides, mountain biking adventures, or road cycling escapades, we have the perfect bike for you.\n" +
                    "\n" +
                    " 2. Guided Tours and Routes\n\n" +
                    "Discover the hidden gems of [Location] with our curated guided tours and recommended cycling routes. Our experienced team can provide insights, " +
                    "safety tips, and local knowledge to make your cycling journey memorable and enjoyable.",
            color = Color(0xFF070707),
            fontFamily = FontFamily.SansSerif,
            fontSize = 15.sp
        )
        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Mission\n" +
                    "Our mission at Avispa Bike Hire Company is to empower individuals to embrace an active lifestyle by providing access to high-quality bicycles and exceptional" +
                    " cycling experiences. We believe in fostering a sense of adventure, promoting sustainable travel, and encouraging a strong connection with the environment " +
                    "through cycling.",
            color = Color(0xFF070707),
            fontFamily = FontFamily.SansSerif,
            fontSize = 15.sp
        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Location\n" +
                    "Avispa Bike Hire Company is nestled in the heart of [Wakanda], a region renowned for its stunning natural beauty and diverse cycling trails. " +
                    "Our strategic location allows easy access scenic routes, varying in difficulty and terrain, ensuring there's a perfect ride for everyone," +
                    " from beginners to avid cyclists.",
            color = Color(0xFF070707),
            fontFamily = FontFamily.SansSerif,
            fontSize = 15.sp
        )
        Spacer(modifier = Modifier.height(10.dp))


        Text(
            text = "Ride with Avispa: Where Wheels Meet Wonders",
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