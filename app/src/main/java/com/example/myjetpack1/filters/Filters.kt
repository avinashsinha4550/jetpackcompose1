package com.example.myjetpack1.filters

import android.app.Application
import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class Filters:ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FiltersButton()
        }
    }
}
@Composable
fun FiltersButton()
{
    Column() {
             Row( modifier = Modifier.padding(start = 20.dp,top = 100.dp,end = 10.dp)) {
                Button(
                onClick = {},
                border = BorderStroke(1.dp, Color.Black),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),

            )   {  Row {

                Text("Prototyping")
            }
            }
                 Button(
                     onClick = {},
                     border = BorderStroke(1.dp, Color.Black),
                     shape = RoundedCornerShape(50),
                     colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                     modifier = Modifier.padding(start = 10.dp)

                 )   {  Row {

                     Text("Sketch")
                 }
                 }
                 Button(
                     onClick = {},
                     border = BorderStroke(1.dp, Color.Black),
                     shape = RoundedCornerShape(50),
                     colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                     modifier = Modifier.padding(start = 10.dp)

                 )   {  Row {

                     Text("Product")
                 }
                 }







             }
        Row(modifier = Modifier.padding(start = 20.dp,top = 10.dp)) {
            Button(
                onClick = {

                },
                border = BorderStroke(1.dp, Color.Black),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                modifier = Modifier.padding(start = 10.dp)
            )   {  Row {

                Text("Figma")
            }
            }
            Button(
                onClick = {},
                border = BorderStroke(1.dp, Color.Black),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                modifier = Modifier.padding(start = 10.dp)

            )   {  Row {

                Text("UI kit")
            }
            }
            Button(
                onClick = {},
                border = BorderStroke(1.dp, Color.Black),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                modifier = Modifier.padding(start = 10.dp)

            )   {  Row {

                Text("User Experince")
            }
            }







        }
        Row(modifier = Modifier.padding(start = 20.dp,top = 10.dp)) {
            Button(
                onClick = {},
                border = BorderStroke(1.dp, Color.Black),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),

            )   {  Row {

                Text("Wireframing")
            }
            }
            Button(
                onClick = {},
                border = BorderStroke(1.dp, Color.Black),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                modifier = Modifier.padding(start = 10.dp)

            )   {  Row {

                Text("XD")
            }
            }
            Button(
                onClick = {},
                border = BorderStroke(1.dp, Color.Black),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                modifier = Modifier.padding(start = 10.dp)

            )   {  Row {

                Text("Leadership")
            }
            }







        }

        
    }

}