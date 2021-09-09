package com.example.myjetpack1.Spinner1

import android.graphics.drawable.Drawable
import android.graphics.drawable.PaintDrawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
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
import com.example.myjetpack1.R

class Spinner1: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            spinner()
        }
    }
}
@Composable

fun spinner()
{
    var array3: Array<String> = arrayOf("Samsung Galaxy M30s 6GB","Suraj","suraj")
    var expanded by remember { mutableStateOf(false)}
    val mobilename:String by remember{
        mutableStateOf(array3[0])
    }
    Row( DropdownMenu(
        expanded = expanded,
        onDismissRequest = {})) {
        Card(

            modifier = Modifier

                .fillMaxWidth()
                .padding(all = 30.dp)
                .height(30.dp),


            backgroundColor = MaterialTheme.colors.surface,
        ) {
            Box (){
                // Back arrow here

                Row { // Anchor view
                    // City name label
                    Text(text = mobilename,modifier = Modifier.padding(start = 40.dp))
                   Icon(imageVector =Icons.Filled.ArrowDropDown, contentDescription ="" ,modifier =
                   Modifier.padding(start = 60
                       .dp
                   ))
                }
            }
        }


    }

}
