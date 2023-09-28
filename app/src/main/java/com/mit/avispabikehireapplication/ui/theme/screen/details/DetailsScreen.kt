package com.mit.avispabikehireapplication.ui.theme.screen.details

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mit.avispabikehireapplication.data.ProductViewModel
import com.mit.avispabikehireapplication.model.Product

@Composable
fun DetailsScreen(controller: NavHostController) {

    Column(modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {

        var context = LocalContext.current
        var productRepository = ProductViewModel(controller, context)
        val emptyProductState = remember { mutableStateOf(Product("","","","","","")) }
        var emptyProductsListState = remember { mutableStateListOf<Product>() }

        var products = productRepository.viewProducts(emptyProductState, emptyProductsListState)


        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(androidx.compose.ui.graphics.Color.White)
            ,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "View Booking",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = androidx.compose.ui.graphics.Color.Red)

            Spacer(modifier = Modifier.height(20.dp))

           LazyColumn(){
               items(products){
                   ProductItem(
                       name = it.name,
                       idNumber = it.idNumber,
                       type = it.type,
                       quantity = it.quantity,
                       date = it.date,
                       id = it.id,
                       controller = controller ,
                       productRepository = productRepository
                   )

               }
//                items(products){
//                    ProductItem(
//                        name = it.name,
//                        idNumber=it.idNumber,
//                        type=it.type,
//                        quantity = it.quantity,
//                        date=it.date,
//                        id = it.id,
//                        navController = navController,
//                        productRepository = productRepository
//                    )
//                }
            }
        }
    }

}


//fun items(count: SnapshotStateList<Product>, itemContent: LazyItemScope.(index: Int) -> Unit) {
//
//}

@Composable
fun ProductItem(name:String,
                idNumber:String,
                type:String,
                quantity:String,
                date: String,
                id:String,
                controller:NavHostController,
                productRepository:ProductViewModel) {

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = name)
        Text(text = idNumber)
        Text(text = type)
        Text(text = quantity)
        Text(text = date)

    }

}

@Preview
@Composable
fun view() {
    DetailsScreen(rememberNavController())

}
