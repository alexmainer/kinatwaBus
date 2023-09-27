package com.example.busbookingmadeeasier.ui.theme.screens.startscreen

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.mit.avispabikehireapplication.R
import com.mit.avispabikehireapplication.navigation.ROUTE_HOME
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(navController: NavController) {
    val scale= remember{
        Animatable(0f)

    }
    LaunchedEffect( key1 =true ){
        scale.animateTo(
            targetValue = 0.7f,
            animationSpec = tween(
                durationMillis = 500,
                easing = {
                    OvershootInterpolator(2f).getInterpolation(it)
                }
            )
        )
        delay(3000L)
        navController.navigate(ROUTE_HOME)
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        // You can use an Image or any other Composable to display your splash screen UI
        Image(
            painter = painterResource(id = R.drawable.la),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primary)
                .clip(shape = RoundedCornerShape(50.dp))
                .scale(scale.value)
        )
    }

}