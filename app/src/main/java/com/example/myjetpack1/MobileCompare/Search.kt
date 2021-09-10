package com.example.myjetpack1.MobileCompare

import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myjetpack1.R
import com.example.myjetpack1.nwetry.User


class Search: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(topBar = {

            }) {
                SearchViewPreview()
            }

        }
    }
    }
@Composable

fun Searchhere()
{
    TopAppBar(
        title = { Text(text = stringResource(R.string.Seearch), fontSize = 18.sp) },
        backgroundColor = colorResource(id = R.color.purple_200),
        contentColor = androidx.compose.ui.graphics.Color.Black
    )
    CountryListItemPreview()

}

@Composable
fun SearchView(state: MutableState<TextFieldValue>) {
    Searchhere()
    TextField(
        value = state.value,
        onValueChange = { value ->
            state.value = value
        },
        modifier = Modifier
            .fillMaxWidth(),
        textStyle = TextStyle(color = White, fontSize = 18.sp),
        leadingIcon = {
            Icon(
                Icons.Default.Search,
                contentDescription = "",
                modifier = Modifier
                    .padding(15.dp)
                    .size(24.dp)
            )
        },
        trailingIcon = {
            if (state.value != TextFieldValue("")) {
                IconButton(
                    onClick = {
                        state.value =
                            TextFieldValue("") // Remove text from TextField when you press the 'X' icon
                    }
                ) {
                    Icon(
                        Icons.Default.Close,
                        contentDescription = "",
                        modifier = Modifier
                            .padding(15.dp)
                            .size(24.dp)
                    )
                }
            }
        },
        singleLine = true,
        shape = RectangleShape, // The TextFiled has rounded corners top left and right by default
        colors = TextFieldDefaults.textFieldColors(
            textColor = White,
            cursorColor = White,
            leadingIconColor = White,
            trailingIconColor = White,
            backgroundColor = colorResource(id = R.color.purple_200),
            focusedIndicatorColor = Transparent,
            unfocusedIndicatorColor = Transparent,
            disabledIndicatorColor = Transparent
        )
    )
}


@Composable
fun SearchViewPreview() {
    val textState = remember { mutableStateOf(TextFieldValue("")) }
    SearchView(textState)

}
@Composable
fun CountryListItem(countryText:String , onItemClick: (String) -> Unit) {
    Row(
        modifier = Modifier
            .clickable(onClick = { onItemClick(countryText) })

            .height(57.dp)
            .fillMaxWidth()
            .padding(PaddingValues(8.dp, 16.dp))
    ) {
        Text(text = countryText, fontSize = 18.sp, color = Black)
    }
}

@Composable
fun CountryListItemPreview() {
    var i:Int=0
    var list= dataSearchiteam()
    val arrrarrr=ArrayList<String>()
    for (listitem in list)
    {


            CountryListItem(countryText = arrrarrr.toString() , onItemClick = { })



    }

}

@Composable
fun dataSearchiteam():MutableList<Searchitem>
{
    val list= mutableListOf<Searchitem>()
    list.add(Searchitem("Samsung Galaxy S21 Ultra 5G"))
    list.add(Searchitem("Samsung Galaxy Note 20 Ultra 5G"))
    list.add(Searchitem("Samsung Galaxy S21 5G"))
    list.add(Searchitem("Samsung Galaxy M31s"))
    return list
}