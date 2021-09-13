package com.example.myjetpack1.filters

import android.app.Application
import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myjetpack1.R

class Filters:ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(topBar = {
                TopAppBar( title = {  Image(painterResource(id = R.drawable.back_button), contentDescription ="" )
                    Text(text = "Filters", fontSize = 18.sp,
                        modifier = Modifier.padding(start = 110.dp),
                    )
                    Text(text = "Clear", fontSize = 18.sp,
                        modifier = Modifier.padding(start = 110.dp),
                    )
                },
                    backgroundColor = colorResource(id = R.color.purple_200),
                    contentColor = Color.White
                )
            }) {

            }

            FiltersButton()
        }
    }
}
@Composable
@Preview
fun FiltersButton()
{
        var selected=remember { mutableStateOf(true)}
    Column() {
             Row( modifier = Modifier.padding(start = 20.dp,top = 190.dp,end = 10.dp)) {
                Button(
                onClick = {
                    selected.value=!selected.value

                },
                border = BorderStroke(1.dp,if(selected.value)
                    Color.Black

                else
                    Color.Red),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(backgroundColor = if(selected.value)
                    Color.White

                else
                    Color.White
                ),

            )   {  Row {

                Text("Prototyping")
            }
            }
                 var selected1=remember { mutableStateOf(true)}
                 Button(
                     onClick = {
                         selected1.value=!selected1.value
                     },
                     border = BorderStroke(1.dp,if(selected1.value)
                         Color.Black

                     else
                         Color.Red),
                     shape = RoundedCornerShape(50),
                     colors = ButtonDefaults.buttonColors(backgroundColor = if(selected1.value)
                         Color.White

                     else
                         Color.White
                     ),
                     modifier = Modifier.padding(start = 10.dp)

                 )
                 {
                     Row ()
                     {

                     Text("Sketch")
                 }
                 }

                 var selected2=remember { mutableStateOf(true)}
                 Button(
                     onClick = {
                         selected2.value=!selected2.value
                     },
                     border = BorderStroke(1.dp,if(selected.value)
                         Color.Black

                     else
                         Color.Red),
                     shape = RoundedCornerShape(50),
                     colors = ButtonDefaults.buttonColors(backgroundColor = if(selected2.value)
                         Color.White

                     else
                         Color.White
                     ),
                     modifier = Modifier.padding(start = 10.dp)

                 )  {  Row {

                     Text("Product")
                 }
                 }







             }
        Row(modifier = Modifier.padding(start = 20.dp,top = 10.dp)) {

            var selected3=remember { mutableStateOf(true)}
            Button(
                onClick = {
                    selected3.value=!selected3.value
                },
                border = BorderStroke(1.dp,if(selected3.value)
                    Color.Black

                else
                    Color.Red),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(backgroundColor = if(selected3.value)
                    Color.White

                else
                    Color.White
                ),
                modifier = Modifier.padding(start = 10.dp)

            )  {  Row {

                Text("Figma")
            }
            }

            var selected4=remember { mutableStateOf(true)}
            Button(
                onClick = {
                    selected4.value=!selected4.value
                },
                border = BorderStroke(1.dp,if(selected4.value)
                    Color.Black

                else
                    Color.Red),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(backgroundColor = if(selected4.value)
                    Color.White

                else
                    Color.White
                ),
                modifier = Modifier.padding(start = 10.dp)

            ) {  Row {

                Text("UI kit")
            }
            }

            var selected5=remember { mutableStateOf(true)}
            Button(
                onClick = {
                    selected5.value=!selected5.value
                },
                border = BorderStroke(1.dp,if(selected5.value)
                    Color.Black

                else
                    Color.Red),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(backgroundColor = if(selected5.value)
                    Color.White

                else
                    Color.White
                ),
                modifier = Modifier.padding(start = 10.dp)

            )   {  Row {

                Text("User Experince")
            }
            }







        }
        Row(modifier = Modifier.padding(start = 20.dp,top = 10.dp)) {

            var selected6=remember { mutableStateOf(true)}
            Button(
                onClick = {
                    selected6.value=!selected6.value
                },
                border = BorderStroke(1.dp,if(selected6.value)
                    Color.Black

                else
                    Color.Red),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(backgroundColor = if(selected6.value)
                    Color.White

                else
                    Color.White
                ),
                modifier = Modifier.padding(start = 10.dp)

            )  {  Row {

                Text("Wireframing")
            }
            }

            var selected7=remember { mutableStateOf(true)}
            Button(
                onClick = {
                    selected7.value=!selected7.value
                },
                border = BorderStroke(1.dp,if(selected7.value)
                    Color.Black

                else
                    Color.Red),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(backgroundColor = if(selected7.value)
                    Color.White

                else
                    Color.White
                ),
                modifier = Modifier.padding(start = 10.dp)

            )   {  Row {

                Text("XD")
            }
            }

            var selected8=remember { mutableStateOf(true)}
            Button(
                onClick = {
                    selected8.value=!selected8.value
                },
                border = BorderStroke(1.dp,if(selected8.value)
                    Color.Black

                else
                    Color.Red),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(backgroundColor = if(selected8.value)
                    Color.White

                else
                    Color.White
                ),
                modifier = Modifier.padding(start = 10.dp)

            )  {  Row {

                Text("Leadership")
            }
            }







        }

        
    }

}