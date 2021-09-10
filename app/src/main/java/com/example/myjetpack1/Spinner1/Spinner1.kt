package com.example.myjetpack1.Spinner1

import android.content.Context
import android.graphics.drawable.Drawable
import android.graphics.drawable.PaintDrawable
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import com.example.myjetpack1.R

class Spinner1: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val context = this
            spinner(context)
        }
    }
}
@Composable

fun spinner(context: Context)
{

    var close by remember { mutableStateOf(false)}

    var array3: Array<String> = arrayOf("Samsung Galaxy M30s 6GB","Samsung Galaxy S21 Ultra 5G",
        "Samsung Galaxy M31s")

    var mobilename:String by remember{
        mutableStateOf(array3[0])
    }


        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 90.dp)
            .height(30.dp),
            backgroundColor = MaterialTheme.colors.surface,


        ) {
            Box (modifier = Modifier.clickable {
                close=!close
            }){

                DropdownMenu(
                    expanded = close,
                    onDismissRequest = { close = false },
                    modifier = Modifier.padding(start = 40.dp),

                )
                {
                    array3.forEach { city ->
                        DropdownMenuItem(onClick = {
                            close = false
                            mobilename = city
                        }) {
                            Text(city)
                        }
                    }
                }
                Row() {
                    Icon(imageVector =Icons.Filled.ArrowDropDown, contentDescription ="" ,modifier =
                    Modifier.padding(start= 350.dp))
                }
                // Back arrow here
                    Row() {

                        Text(text = mobilename,modifier = Modifier.padding(start = 40.dp))

                    }



                }

                }
    var mobilename1:String by remember {
        mutableStateOf(array3[0])
    }
    var close1 by remember { mutableStateOf(false)}
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 150.dp)
        .height(30.dp),
        backgroundColor = MaterialTheme.colors.surface,
    )
    {
        Box (modifier = Modifier.clickable {

            close1=!close1
        }){
            DropdownMenu(
                expanded = close1,
                onDismissRequest = { close1 = false },
                modifier = Modifier.padding(start = 40.dp),

                )
            {
                array3.forEach { city1 ->
                    DropdownMenuItem(onClick = {
                        close1 = false
                        mobilename1 = city1
                    }) {
                        Text(city1)
                    }
                }
            }
            Row() {
                Icon(imageVector =Icons.Filled.ArrowDropDown, contentDescription ="" ,modifier =
                Modifier.padding(start= 350.dp))
            }
            // Back arrow here
            Row() {

                Text(text = mobilename1,modifier = Modifier.padding(start = 40.dp))


            }


        }

    }
    var mobilename2:String by remember {
        mutableStateOf(array3[0])
    }
    var close2 by remember { mutableStateOf(false)}
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 210.dp)
        .height(30.dp),
        backgroundColor = MaterialTheme.colors.surface,
    ) {
        Box (modifier = Modifier.clickable {
            close2=!close2
        }){

            DropdownMenu(
                expanded = close2,
                onDismissRequest = { close2 = false },
                modifier = Modifier.padding(start = 40.dp),

                )
            {
                array3.forEach { city2 ->
                    DropdownMenuItem(onClick = {
                        close2 = false
                        mobilename2= city2
                    }) {
                        Text(city2)
                    }
                }
            }
            Row() {
                Icon(imageVector =Icons.Filled.ArrowDropDown, contentDescription ="" ,modifier =
                Modifier.padding(start= 350.dp))
            }
            Row() {
                Icon(imageVector =Icons.Filled.ArrowDropDown, contentDescription ="" ,modifier =
                Modifier.padding(start= 350.dp))
            }
            // Back arrow here
            Row() {

                Text(text = mobilename2,modifier = Modifier.padding(start = 40.dp))

            }


        }

    }
    var mobilename3:String by remember {
        mutableStateOf(array3[0])
    }
    var close3 by remember { mutableStateOf(false)}
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 270.dp)
        .height(30.dp),
        backgroundColor = MaterialTheme.colors.surface,
    ) {
        Box (modifier = Modifier.clickable() {
            close3=!close3
        }){

            DropdownMenu(
                expanded = close3,
                onDismissRequest = { close3 = false },
                modifier = Modifier.padding(start = 40.dp),

                )
            {
                array3.forEach { city3 ->
                    DropdownMenuItem(onClick = {
                        close3 = false
                        mobilename3 = city3
                    }) {
                        Text(city3)
                    }
                }
            }
            Row() {
                Icon(imageVector =Icons.Filled.ArrowDropDown, contentDescription ="" ,modifier =
                Modifier.padding(start= 350.dp))
            }
            Row() {
                Icon(imageVector =Icons.Filled.ArrowDropDown, contentDescription ="" ,modifier =
                Modifier.padding(start= 350.dp))
            }
            // Back arrow here
            Row() {

                Text(text = mobilename3,modifier = Modifier.padding(start = 40.dp))

            }


        }

    }
    Column(
        modifier = Modifier.fillMaxWidth().fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {},modifier = Modifier.fillMaxWidth(), )
        { Text("COMPARE") }
    }

            }
