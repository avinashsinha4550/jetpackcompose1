package com.example.myjetpack1


import android.content.Context
import android.os.Bundle

import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

import com.example.myjetpack1.ui.theme.Myjetpack1Theme

import com.example.myjetpack1.PuppyUI.PuppyUII
import com.example.myjetpack1.Puppyholder.PuppyyHol
import com.example.myjetpack1.Viewmodel.Viewmodel
import com.example.myjetpack1.Puppyholder.example as example1

class MainActivity : ComponentActivity() {
    private val puppyviewmodel:Viewmodel by viewModels ()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var obk= example1()

        setContent {
            Text(text = obk.avinash)

            Myjetpack1Theme {
                val puppylist=puppyviewmodel.puppysList.value
                setpuppydata(puppyList = puppylist!!,context = this)
            }
        }
    }

@Composable
fun setpuppydata(puppyList:List<PuppyyHol>,context:Context)
{
LazyColumn{
    itemsIndexed(items = puppyList){
        index,PuppyyHol ->
        PuppyUII(PuppyyHol  ,onClick = {
        Toast.makeText(this@MainActivity,PuppyyHol.puppyname,Toast.LENGTH_SHORT).show()
            Toast.makeText(this@MainActivity,index.toString(),Toast.LENGTH_SHORT).show()
        })
    }
}
}


}


