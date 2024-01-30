package com.mit.avispabikehireapplication.ui.theme.screen.booking

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
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
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mit.avispabikehireapplication.data.ProductViewModel
import com.mit.avispabikehireapplication.navigation.ROUTE_DETAILS
import com.vanpra.composematerialdialogs.rememberMaterialDialogState
import org.intellij.lang.annotations.JdkConstants.CalendarMonth
import org.w3c.dom.Text
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Calendar


//@RequiresApi(Build.VERSION_CODES.N)

@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookingScreen(controller: NavHostController) {


    val context= LocalContext.current
    var expanded by remember { mutableStateOf(false) }

    val bikeTypes = listOf("Mountain Bike", "City Bikes", "Kid Bikes") // Add your specific options here
    var selectedBikeType by remember { mutableStateOf(bikeTypes[0]) }
    val options by remember { mutableStateOf(bikeTypes) }
    var selectedOption by remember { mutableStateOf(options[0]) }

    //var selectedTypeIndex by remember { mutableIntStateOf(0) }
    //var selectedType by remember { mutableStateOf(typeOptions[0]) }
    //var pickedDate by remember { mutableStateOf(LocalDate.now())    }
    //val formattedDate by remember { derivedStateOf { DateTimeFormatter.ofPattern("MM dd yyyy").format(pickedDate)}    }
    //val dateDialogState = rememberMaterialDialogState()






    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier= Modifier.background(Color.White),)
    {
        Text(
            text = "BOOKING",
            color = Color(0xFFFF9800),
            modifier = Modifier.padding(16.dp),
            fontFamily = FontFamily.Serif,
            fontSize = 40.sp
        )
        Spacer(modifier = Modifier.height(30.dp))

        // Form
        var name by remember { mutableStateOf("") }
        var idNumber by remember { mutableStateOf("") }
        var selectedBikeType by remember { mutableStateOf("") }
        var quantity by remember { mutableStateOf("") }
        var date by remember { mutableStateOf("") }


        OutlinedTextField(
            value = name,
            label = { Text(text = "Name", color = Color.Black) },
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
                cursorColor = Color.Black // Set cursor color to black
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.surfaceTint
                )
            }
        )



        OutlinedTextField(
            value = idNumber,
            label = { Text(text = "Id Number", color = Color.Black) },
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
                cursorColor = Color.Black // Set cursor color to black
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Info,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.surfaceTint
                )
            }
        )


        OutlinedDropdown(
            value = selectedBikeType,
            onValueChange = { selectedBikeType = it },
            options = bikeTypes,
            label = { Text("Bike Type",color = Color.Black) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),

        )


        OutlinedTextField(
            value = quantity,
            label = { Text(text = "Quantity", color = Color.Black) },
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
                cursorColor = Color.Black // Set cursor color to black
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.surfaceTint
                )
            }
        )

        TextField(
            value = date,
            onValueChange = { date = it },
            label = { Text("Date (DD/MM/YYYY)") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )
        


        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {
                //-----------WRITE THE SAVE LOGIC HERE---------------//
                var productRepository = ProductViewModel(controller, context)
                productRepository.saveProduct(
                    name.trim(),
                    idNumber.trim(),
                    selectedBikeType.trim(),
                    quantity.trim(),
                    date)
                controller.navigate(ROUTE_DETAILS)


            },
            modifier = Modifier
                .padding(16.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
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
            value = if (hasSelection) options[selectedIndex] else "Type of Bike",
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
                        .clickable { expanded = !expanded }
                ) {
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
                    Text(text = option)
                }
            }
        }
    }
}

//@RequiresApi(Build.VERSION_CODES.N)
@RequiresApi(Build.VERSION_CODES.O)
@Preview
@Composable
fun BookingScreenPreview() {
    BookingScreen(rememberNavController())

}

