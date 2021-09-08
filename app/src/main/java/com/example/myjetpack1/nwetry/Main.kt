package com.example.myjetpack1.nwetry

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.lang.reflect.Modifier

class Main: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContent {
          val usss=setdata()
           LazyColumn{
              items(usss){usss->
                  setlayout(user = usss)
                  
              }
           }

       }
    }
    fun setdata():MutableList<User>
    {
        val list= mutableListOf<User>()
        list.add(User(RAM = "12GB"))
        list.add(User(Proccesor = "snapdragon 888 procesor"))
        list.add(User(Main_camera = "40 MP Main Camera"))
        list.add(User(Front_camera = "20 MP front camera"))
        list.add(User(Water_proff = "Water Prooof"))
        list.add(User(SSD_space = "256GB SSd"))
        list.add(User(Price = "RS 10000"))


        return list
    }
}
@Composable

fun setlayout( user: User)
{
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = androidx.compose.ui.Modifier.padding(10.dp).fillMaxWidth(),
        backgroundColor = MaterialTheme.colors.surface,
    ) {
        Box(modifier = androidx.compose.ui.Modifier.height(360.dp)) {
            Column() {
                Text(
                    text = "Samsung M31 12GB", modifier = androidx.compose.ui.Modifier.padding(
                        top = 24.dp, start = 22.dp
                    )
                )
                Text(text = "----------------------------------------------------------------------")
                Row() {

                    Column {
                        Text(
                            text = user.RAM!!,
                            modifier = androidx.compose.ui.Modifier.padding(top = 4.dp),
                            fontSize = 15.sp
                        )
                        Text(
                            text = user.Proccesor!!,
                            modifier = androidx.compose.ui.Modifier.padding(top = 4.dp),
                            fontSize = 15.sp
                        )
                        Text(
                            text = user.Main_camera!!,
                            modifier = androidx.compose.ui.Modifier.padding(top = 4.dp),
                            fontSize = 15.sp
                        )
                        Text(
                            text = user.Front_camera!!,
                            modifier = androidx.compose.ui.Modifier.padding(top = 4.dp),
                            fontSize = 15.sp
                        )
                        Text(
                            text = user.Water_proff!!,
                            modifier = androidx.compose.ui.Modifier.padding(top = 4.dp),
                            fontSize = 15.sp
                        )
                        Text(
                            text = user.SSD_space!!,
                            modifier = androidx.compose.ui.Modifier.padding(top = 4.dp),
                            fontSize = 15.sp
                        )
                        Text(
                            text = user.Price!!,
                            modifier = androidx.compose.ui.Modifier.padding(top = 4.dp),
                            fontSize = 15.sp
                        )


                    }


                }
                Column() {

                    Text(text = "-----------------------------------------------------------------------")

                    Row() {
                        Text(
                            text = "ADD to Compare", modifier = androidx.compose.ui.Modifier.padding(
                                top = 24.dp, start = 22.dp
                            )
                        )
                        val mRememberObserver = remember { mutableStateOf("") }

                        RadioButton(modifier = androidx.compose.ui.Modifier.padding(
                            top = 24.dp, start = 150.dp
                        ),
                            selected = mRememberObserver.value == "mText",
                            onClick = { mRememberObserver.value = "mText" })

                    }

                }
            }

        }

    }

}

