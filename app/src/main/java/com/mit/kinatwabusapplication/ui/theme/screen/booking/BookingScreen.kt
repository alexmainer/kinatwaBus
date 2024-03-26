@file:OptIn(ExperimentalMaterial3Api::class)

package com.mit.kinatwabusapplication.ui.theme.screen.booking

import android.app.DatePickerDialog
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.FlowRowScopeInstance.align
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mit.kinatwabusapplication.data.ProductViewModel
import com.mit.kinatwabusapplication.navigation.ROUTE_DETAILS
import com.vanpra.composematerialdialogs.rememberMaterialDialogState
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale


//@RequiresApi(Build.VERSION_CODES.N)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomDatePicker(
    selectedDate: Date?,
    onDateSelected: (Date) -> Unit
) {
    val calendar = Calendar.getInstance()
    val dateSetListener = DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
        calendar.set(Calendar.YEAR, year)
        calendar.set(Calendar.MONTH, month)
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
        onDateSelected(calendar.time)
    }
    val context = LocalContext.current

    OutlinedButton(
        onClick = {
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH)
            val datePickerDialog = DatePickerDialog(context, dateSetListener, year, month, dayOfMonth)
            datePickerDialog.show()
        },
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .background(Color.Transparent),
        shape = RoundedCornerShape(4.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = Color.Black,
        ),
        border = BorderStroke(0.5.dp, Color.Gray),
        contentPadding = PaddingValues(8.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                tint = MaterialTheme.colorScheme.background,
                imageVector = Icons.Default.DateRange,
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
            Text(
                text = selectedDate?.formatToDisplayDate() ?: "Select Date",
                modifier = Modifier
                    .padding(8.dp)
                    .weight(1f),
                color = Color.Black,
            )
        }
    }
}

fun Date.formatToDisplayDate(): String {
    val sdf = SimpleDateFormat("dd/MMMM/yyyy", Locale.getDefault())
    return sdf.format(this)
}

@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookingScreen(controller: NavHostController) {


    val context= LocalContext.current
    var expanded by remember { mutableStateOf(false) }

    val busroutes = listOf("Nairobi to voi ", "Nairobi to Kitui", "Nairobi to Mwingi","Nairobi to Machakos ","Nairobi to Wote","From Mombasa to Nairobi ","From Mombasa to voi",
        "From Mombasa to Kitui","From Mombasa to Mwingi","From Mombasa to Machakos","From Mombasa to Wote ",) // Add your specific options here
    var selectedbusroute by remember { mutableStateOf(busroutes[0]) }
    val options by remember { mutableStateOf(busroutes) }
    var selectedOption by remember { mutableStateOf(options[0]) }

    var selectedTypeIndex by remember { mutableIntStateOf(0) }
//    var selectedType by remember { mutableStateOf(typeOptions[0]) }
    var selectedDate by remember { mutableStateOf<Date?>(null) }
//    var pickedDate by remember { mutableStateOf(LocalDate.now())    }
//    val formattedDate by remember { derivedStateOf { DateTimeFormatter.ofPattern("MM dd yyyy").format(pickedDate)}    }
    val dateDialogState = rememberMaterialDialogState()



    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier= Modifier.background(Color.White),)
    {
        Text(
            text = "BOOKING",
            color = Color(0xFF4CAF50),
            modifier = Modifier.padding(16.dp),
            fontFamily = FontFamily.Serif,
            fontSize = 40.sp
        )
        Spacer(modifier = Modifier.height(30.dp))

        // Form
        var name by remember { mutableStateOf("") }
        var idNumber by remember { mutableStateOf("") }
        var selectedbusroute by remember { mutableStateOf("") }
        var quantity by remember { mutableStateOf("") }
        //var selectedDate by remember { mutableStateOf<Date?>(null) }
        var date by remember { mutableStateOf("") }

        // Define the prices for each bus route
        val nairobiToVoiPrice = 1000
        val nairobiToKituiPrice = 500
        val nairobiToMwingiPrice = 500
        val nairobiToMachakosPrice = 500
        val nairobiToWotePrice = 500
        val mombasaToNairobiPrice = 1500
        val mombasaToVoiPrice = 1300
        val mombasaToKituiPrice = 1800
        val mombasaToMwingiPrice = 1500
        val mombasaToMachakosPrice = 1500
        val mombasaToWotePrice = 1500

// Calculate the total price based on the selected bus route and quantity
        val totalPrice = when (selectedbusroute) {
            "Nairobi to Voi" -> nairobiToVoiPrice * quantity.toInt()
            "Nairobi to Kitui" -> nairobiToKituiPrice * quantity.toInt()
            "Nairobi to Mwingi" -> nairobiToMwingiPrice * quantity.toInt()
            "Nairobi to Machakos" -> nairobiToMachakosPrice * quantity.toInt()
            "Nairobi to Wote" -> nairobiToWotePrice * quantity.toInt()
            "Mombasa to Nairobi" -> mombasaToNairobiPrice * quantity.toInt()
            "Mombasa to Voi" -> mombasaToVoiPrice * quantity.toInt()
            "Mombasa to Kitui" -> mombasaToKituiPrice * quantity.toInt()
            "Mombasa to Mwingi" -> mombasaToMwingiPrice * quantity.toInt()
            "Mombasa to Machakos" -> mombasaToMachakosPrice * quantity.toInt()
            "Mombasa to Wote" -> mombasaToWotePrice * quantity.toInt()
            else -> 0 // Handle default case
        }


        OutlinedTextField(
            value = name,
            label = { Text(text = "Name", color = Color(0xFF4CAF50)) },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            onValueChange = {
                name = it
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = Color.Black, // Set text color to black
                focusedBorderColor = Color.Black, // Change border color when focused
                unfocusedBorderColor = Color.Gray, // Change border color when not focused
                cursorColor = Color(0xFF4CAF50) // Set cursor color to black
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.background
                )
            }
        )



        OutlinedTextField(
            value = idNumber,
            label = { Text(text = "Id Number", color = Color(0xFF4CAF50)) },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            onValueChange = {
                idNumber = it
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = Color.Black, // Set text color to black
                focusedBorderColor = Color.Black, // Change border color when focused
                unfocusedBorderColor = Color.Gray, // Change border color when not focused
                cursorColor = Color(0xFF4CAF50) // Set cursor color to black
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Info,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.background
                )
            }
        )


        OutlinedTextField(
            value = quantity,
            label = { Text(text = "Tickets", color =Color(0xFF4CAF50)) },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            onValueChange = {
                quantity = it
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = Color.Black, // Set text color to black
                focusedBorderColor = Color.Black, // Change border color when focused
                unfocusedBorderColor = Color.Gray, // Change border color when not focused
                cursorColor = Color(0xFF4CAF50) // Set cursor color to black
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.background
                )
            }
        )
        OutlinedDropdown(
            value = selectedbusroute,
            onValueChange = { selectedbusroute = it },
            options = busroutes,
            label = { Text("Routes",color = Color(0xFF4CAF50)) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),

            )

        Text("Total Price: $totalPrice", modifier = Modifier.padding(8.dp),color= Color.Black)

        CustomDatePicker(
            selectedDate = selectedDate,
            onDateSelected = { date -> selectedDate = date }
        )



        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {
                //-----------WRITE THE SAVE LOGIC HERE---------------//
                val productRepository = ProductViewModel(controller, context)
                productRepository.saveProduct(
                    name.trim(),
                    idNumber.trim(),
                    selectedbusroute.trim(),
                    quantity.trim(),
                    selectedDate?.formatToDisplayDate() ?: ""
                )
                        controller.navigate(ROUTE_DETAILS)


            },
            modifier = Modifier
                .padding(16.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF4CAF50)),
        )
        {
            Text(
                text = " DONE",
                color = Color.White
            )


        }
    }

}

@Composable
fun OutlinedDropdown(
    value: String,
    onValueChange: (String) -> Unit,
    options: List<String>,
    label: @Composable () -> Unit,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }
    var selectedIndex by remember { mutableStateOf(0) }
    var hasSelection by remember { mutableStateOf(false) }

    Column(
        modifier = modifier
    ) {
        BasicTextField(
            value = if (hasSelection) options[selectedIndex] else "Routes",
            onValueChange = {},
            textStyle = TextStyle(color = Color.Black),
            readOnly = true,
            decorationBox = { innerTextField ->
                Box(
                    contentAlignment = Alignment.CenterStart,
                    modifier = Modifier
                        .border(1.dp, Color.Gray)
                        .padding(16.dp)
                        .fillMaxWidth()
                        .clickable { expanded = !expanded },
                ) {
//                    Icon(
//                        imageVector = Icons.Default.DateRange,
//                        contentDescription = null,
//                        tint = MaterialTheme.colorScheme.surfaceTint
//
//                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    innerTextField()
                }
            },

        )

        if (expanded) {
            options.forEachIndexed { index, option ->
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            selectedIndex = index
                            onValueChange(option)
                            expanded = false
                            hasSelection = true
                        }
                        .padding(8.dp)
                ) {
                    Text(text = option, color = Color(0xFF4CAF50))
                }
            }
        }
    }
}


@RequiresApi(Build.VERSION_CODES.O)
@Preview
@Composable
fun BookingScreenPreview() {
    BookingScreen(rememberNavController())

}

