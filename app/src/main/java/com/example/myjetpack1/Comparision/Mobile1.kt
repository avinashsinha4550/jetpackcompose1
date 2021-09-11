package com.example.myjetpack1.Comparision

import androidx.compose.material.icons.filled.ArrowDropDown
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myjetpack1.R

class Mobile1: ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(topBar = { MobileComparision() }) {
                
            }

        }
    }
}
@Composable
@Preview
fun MobileComparision()
{
    TopAppBar(
        title = {  Icon(imageVector = Icons.Filled.ArrowDropDown, contentDescription = "")
            Text(text = "Comparision", fontSize = 18.sp,
                modifier = Modifier.padding(start = 110.dp))
                },
        backgroundColor = colorResource(id = R.color.purple_200),
        contentColor = Color.Black,

    )
        Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .padding(top = 80.dp,start = 20.dp).width(100.dp),
        backgroundColor = MaterialTheme.colors.surface,
    ) {
            Box(modifier = Modifier.height(60.dp)) {
                Column() {
                    Text(
                        text = "MOBILE 1", modifier = Modifier.padding(
                            top = 20.dp, start = 8.dp
                        )
                    )
                }
            }
        }
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .padding(top = 500.dp,start = 20.dp).width(170.dp)
            ,
        backgroundColor = MaterialTheme.colors.surface,
    ) {
        Box(modifier = Modifier.height(300.dp)) {
            Column() {
                Text(
                    text = "Samsung M31 12GB", modifier = Modifier.padding(
                        top = 24.dp, start = 22.dp
                    )
                )
            }
        }
    }
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .padding(top = 280.dp,start = 20.dp).width(170.dp)
        ,
        backgroundColor = MaterialTheme.colors.surface,
    ) {
        Box(modifier = Modifier.height(120.dp)) {
            Column() {
                Text(
                    text = "Samsung M31 12GB", modifier = Modifier.padding(
                        top = 24.dp, start = 22.dp
                    )
                )
            }
        }
    }
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .padding(top = 150.dp,start = 20.dp).width(170.dp)
            ,
        backgroundColor = MaterialTheme.colors.surface,
    ) {
        Box(modifier = Modifier.height(300.dp)) {
            Column() {
                Text(
                    text = "Samsung M31 12GB", modifier = Modifier.padding(
                        top = 24.dp, start = 22.dp
                    )
                )
            }
        }
    }
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .padding(top = 80.dp,start = 220.dp).width(100.dp)
            ,
        backgroundColor = MaterialTheme.colors.surface,
    ) {
        Box(modifier = Modifier.height(60.dp)) {
            Column() {
                Text(
                    text = "MOBILE 2", modifier = Modifier.padding(
                        top = 24.dp, start = 22.dp
                    )
                )
            }
        }
    }
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .padding(top = 150.dp,start = 220.dp).width(170.dp)
        ,
        backgroundColor = MaterialTheme.colors.surface,
    ) {
        Box(modifier = Modifier.height(300.dp)) {
            Column() {
                Text(
                    text = "Samsung M31 12GB", modifier = Modifier.padding(
                        top = 24.dp, start = 22.dp
                    )
                )
            }
        }
    }
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .padding(top = 500.dp,start = 220.dp).width(170.dp)
        ,
        backgroundColor = MaterialTheme.colors.surface,
    ) {
        Box(modifier = Modifier.height(300.dp)) {
            Column() {
                Text(
                    text = "Samsung M31 12GB", modifier = Modifier.padding(
                        top = 24.dp, start = 22.dp
                    )
                )
            }
        }
    }
}