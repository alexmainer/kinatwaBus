package com.mit.kinatwabusapplication.navigation

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.busbookingmadeeasier.ui.theme.screens.startscreen.SplashScreen
import com.mit.kinatwabusapplication.ui.theme.screen.about.AboutScreen
import com.mit.kinatwabusapplication.ui.theme.screen.booking.BookingScreen
import com.mit.kinatwabusapplication.ui.theme.screen.checkout.CheckOutScreen
import com.mit.kinatwabusapplication.ui.theme.screen.nairobiterminal.CityBikesScreen
import com.mit.kinatwabusapplication.ui.theme.screen.contact.ContactScreen
import com.mit.kinatwabusapplication.ui.theme.screen.details.DetailsScreen
import com.mit.kinatwabusapplication.ui.theme.screen.home.HomeScreen
import com.mit.kinatwabusapplication.ui.theme.screen.index.IndexScreen
import com.mit.kinatwabusapplication.ui.theme.screen.login.LoginScreen
import com.mit.kinatwabusapplication.ui.theme.screen.mombasaterminal.MountainBikesScreen
import com.mit.kinatwabusapplication.ui.theme.screen.register.RegisterScreen

@SuppressLint("NewApi")
@RequiresApi(Build.VERSION_CODES.N)
@Composable
fun AppNavHost(
    controller: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_INDEX
){

    NavHost(navController = controller,modifier=Modifier, startDestination=startDestination ){
        composable(ROUTE_INDEX){
            IndexScreen(controller)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(controller)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(controller)
        }
        composable(ROUTE_HOME){
            HomeScreen(controller)
        }
        composable(ROUTE_MOUNTAIN_BIKES){
            MountainBikesScreen(controller)
        }
        composable(ROUTE_CITY_BIKES){
            CityBikesScreen(controller)
        }

        composable(ROUTE_BOOKING){
            BookingScreen(controller)
        }
        composable(ROUTE_DETAILS){
            DetailsScreen(controller)
        }
        composable(ROUTE_CHECK_OUT){
            CheckOutScreen(controller)
        }
        composable(ROUTE_ABOUT){
            AboutScreen(controller)
        }
        composable(ROUTE_CONTACT_US){
            ContactScreen(controller)
        }
        composable(ROUTE_SPLASH){
            SplashScreen(controller)
        }






    }


}






