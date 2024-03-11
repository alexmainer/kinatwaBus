package com.mit.kinatwabusapplication.ui.theme.screen.contact

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
import androidx.compose.ui.platform.LocalContext
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


@Composable
fun ContactScreen(controller: NavHostController) {
    val context= LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(
                rememberScrollState()
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
    )
    {
        Surface(
            //color = MaterialTheme.colorScheme.primary,
            color = Color.Transparent,
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
                    color = Color(0xFF090808),
                    modifier = Modifier
                        .padding(8.dp)
                        .clickable {
                            controller.navigate(ROUTE_HOME)
                        }
                )

                Text(
                    text = "ABOUT US",
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
            text = "CONTACT US",
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
            text = "We value your inquiries and feedback. Feel free to reach out to us using any of the following methods:",
            color = Color(0xFF070707),
            modifier = Modifier.padding(16.dp),
            fontFamily = FontFamily.SansSerif,
            fontSize = 15.sp
        )
        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Contact Information",
            color = Color(0xFF070707),
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.SansSerif,
            fontSize = 15.sp
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Physical Address:\n" +
                    " Tchalla Street, Suite 101, Kalakuta, \n" +
                    "\n" +
                    "Phone Number:\n" +
                    "+254-715-789-670\n" +
                    "\n" +
                    "Email Address:\n" +
                    "info@avispabikehire.com",
            color = Color(0xFF070707),
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.SansSerif,
            fontSize = 15.sp
        )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Social Media",
                color = Color(0xFF070707),
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.SansSerif,
                fontSize = 15.sp
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Stay connected with us on social media:",
                color = Color(0xFF070707),
                modifier = Modifier.padding(11.dp),
                fontFamily = FontFamily.SansSerif,
                fontSize = 15.sp
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp)
            ) {
                // Profile picture icon

                Image(
                    painterResource(id = R.drawable.x),
                    contentDescription = null, // You can add a content description here
                    modifier = Modifier.size(50.dp)
                )
                Image(
                    painterResource(id = R.drawable.insta),
                    contentDescription = null, // You can add a content description here
                    modifier = Modifier.size(50.dp)
                )
                Image(
                    painterResource(id = R.drawable.facebook),
                    contentDescription = null, // You can add a content description here
                    modifier = Modifier.size(50.dp)
                )
                Image(
                    painterResource(id = R.drawable.app),
                    contentDescription = null, // You can add a content description here
                    modifier = Modifier.size(50.dp)
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Map and Directions",
                color = Color(0xFF070707),
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.SansSerif,
                fontSize = 15.sp
            )

            Spacer(modifier = Modifier.height(10.dp))

            Image(
                painter = painterResource(id = R.drawable.capture),
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



            Text(
                text = "Operating Hours",
                fontWeight = FontWeight.ExtraBold,
                color = Color(0xFF070707),
                fontFamily = FontFamily.SansSerif,
                fontSize = 15.sp
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Monday to Friday:\n" +
                        "9:00 AM - 6:00 PM\n" +
                        "\n" +
                        "Saturday and Sunday:\n" +
                        "10:00 AM - 4:00 PM",
                color = Color(0xFF070707),
                fontFamily = FontFamily.SansSerif,
                fontSize = 15.sp
            )

            Spacer(modifier = Modifier.height(10.dp))



    }
}





@Preview
@Composable
fun ContactScreenPreview() {
    ContactScreen(rememberNavController())

}