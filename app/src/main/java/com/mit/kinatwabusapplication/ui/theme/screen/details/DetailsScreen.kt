package com.mit.kinatwabusapplication.ui.theme.screen.details

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mit.kinatwabusapplication.data.ProductViewModel
import com.mit.kinatwabusapplication.model.Product

@Composable
fun DetailsScreen(controller: NavHostController) {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        var context = LocalContext.current
        var productRepository = ProductViewModel(controller, context)

        val emptyProductState = remember { mutableStateOf(Product("", "", "", "", "", "")) }
        var emptyProductsListState = remember { mutableStateListOf<Product>() }

        var products = productRepository.viewProducts(emptyProductState, emptyProductsListState)

        Column(
            modifier = Modifier.fillMaxSize().background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "RECEIPT",
                modifier = Modifier.fillMaxWidth().padding(8.dp),
                color = Color(0xFF4CAF50),
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 40.sp,
                letterSpacing = 0.1.em,
                lineHeight = 50.sp
            )

            LazyColumn {
                items(products) { product ->
                    ProductItem(
                        name = product.name,
                        idNumber = product.idNumber,
                        type = product.selectedbusroute,
                        tickets = product.tickets,
                        date = product.date,
                        id = product.id,
                        controller = controller,
                        productRepository = productRepository
                    )
                }
            }
        }
    }
}

@SuppressLint("SimpleDateFormat")
@Composable
fun ProductItem(
    name: String,
    idNumber: String,
    type: String,
    tickets: String,
    date: String,
    id: String,
    controller: NavHostController,
    productRepository: ProductViewModel
) {
    var isDetailsVisible by remember { mutableStateOf(false) }

    Column(modifier = Modifier.fillMaxWidth()) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(Color.White)
                .clickable { isDetailsVisible = !isDetailsVisible }
        ) {
            Text(
                text = name,
                modifier = Modifier.padding(8.dp),
                color = Color(0xFF4CAF50),
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )

            if (isDetailsVisible) {
                Text(text = "ID: $idNumber", modifier = Modifier.padding(8.dp))
                Text(text = "Route: $type", modifier = Modifier.padding(8.dp))
                Text(text = "Tickets: $tickets", modifier = Modifier.padding(8.dp))
                Text(text = "Date: $date", modifier = Modifier.padding(8.dp))
            }
        }
    }
}

@Preview
@Composable
fun DetailsScreenPreview() {
    DetailsScreen(rememberNavController())
}

