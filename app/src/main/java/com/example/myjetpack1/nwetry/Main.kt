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
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.myjetpack1.R

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
        list.add(User(puppyimage1=R.drawable.image4,RAM = "12GB",Proccesor = "snapdragon 888 procesor",
            Main_camera = "40 MP Main Camera",Front_camera = "20 MP front camera",Water_proff = "Water Prooof",
            SSD_space = "256GB SSd",Price = "RS 10000"))
        list.add(User(puppyimage1=R.drawable.immage,RAM = "12GB",Proccesor = "snapdragon 888 procesor",
            Main_camera = "40 MP Main Camera",Front_camera = "20 MP front camera",Water_proff = "Water Prooof",
            SSD_space = "256GB SSd",Price = "RS 10000"))
        list.add(User(puppyimage1=R.drawable.immage2,RAM = "12GB",Proccesor = "snapdragon 888 procesor",
            Main_camera = "40 MP Main Camera",Front_camera = "20 MP front camera",Water_proff = "Water Prooof",
            SSD_space = "256GB SSd",Price = "RS 10000"))
        list.add(User(puppyimage1=R.drawable.image10,RAM = "12GB",Proccesor = "snapdragon 888 procesor",
            Main_camera = "40 MP Main Camera",Front_camera = "20 MP front camera",Water_proff = "Water Prooof",
            SSD_space = "256GB SSd",Price = "RS 10000"))
        list.add(User(puppyimage1=R.drawable.image11,RAM = "12GB",Proccesor = "snapdragon 888 procesor",
            Main_camera = "40 MP Main Camera",Front_camera = "20 MP front camera",Water_proff = "Water Prooof",
            SSD_space = "256GB SSd",Price = "RS 10000"))
        list.add(User(puppyimage1=R.drawable.image12,RAM = "12GB",Proccesor = "snapdragon 888 procesor",
            Main_camera = "40 MP Main Camera",Front_camera = "20 MP front camera",Water_proff = "Water Prooof",
            SSD_space = "256GB SSd",Price = "RS 10000"))
        list.add(User(puppyimage1=R.drawable.image13,RAM = "12GB",Proccesor = "snapdragon 888 procesor",
            Main_camera = "40 MP Main Camera",Front_camera = "20 MP front camera",Water_proff = "Water Prooof",
            SSD_space = "256GB SSd",Price = "RS 10000"))
        return list
    }
}
@Composable
fun setlayout( user: User)
{
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(),
        backgroundColor = MaterialTheme.colors.surface,
    ) {
        Box(modifier = Modifier.height(320.dp)) {
            Column() {
                Text(
                    text = "Samsung M31 12GB", modifier =Modifier.padding(
                        top = 24.dp, start = 22.dp
                    )
                )
                Text(text = "------------------------------------------------------------------------------------")
                Row() {
      Image(painter = painterResource(id = user.puppyimage1!!), contentDescription = "false",modifier =
      Modifier.size(150.dp))
                    Column {
                        Text(
                            text = user.RAM!!,
                            modifier = Modifier.padding(
                                top = 4.dp,
                                start = 22.dp
                            ),
                            fontSize = 15.sp
                        )
                        Text(
                            text = user.Proccesor!!,
                            modifier = Modifier.padding(
                                top = 4.dp,
                                start = 22.dp
                            ),
                            fontSize = 15.sp
                        )
                        Text(
                            text = user.Main_camera!!,
                            modifier = Modifier.padding(
                                top = 4.dp,
                                start = 22.dp
                            ),
                            fontSize = 15.sp
                        )
                        Text(
                            text = user.Front_camera!!,
                            modifier = Modifier.padding(
                                top = 4.dp,
                                start = 22.dp
                            ),
                            fontSize = 15.sp
                        )
                        Text(
                            text = user.Water_proff!!,
                            modifier = Modifier.padding(
                                top = 4.dp,
                                start = 22.dp
                            ),
                            fontSize = 15.sp
                        )
                        Text(
                            text = user.SSD_space!!,
                            modifier = Modifier.padding(
                                top = 4.dp,
                                start = 22.dp
                            ),
                            fontSize = 15.sp
                        )
                        Text(
                            text = user.Price!!,
                            modifier = Modifier.padding(
                                top = 4.dp,
                                start = 22.dp
                            ),
                            fontSize = 15.sp
                        )


                    }


                }
                Column() {

                    Text(text = "-------------------------------------------------------------------------------------")

                    Row() {
                        Text(
                            text = "ADD to Compare", modifier = androidx.compose.ui.Modifier.padding(
                                top = 4.dp, start = 22.dp
                            )
                        )
                        val mRememberObserver = remember { mutableStateOf("") }

                        RadioButton(modifier = androidx.compose.ui.Modifier.padding(
                            top = 4.dp, start = 150.dp
                        ),
                            selected = mRememberObserver.value == "mText",
                            onClick = { mRememberObserver.value = "mText" })

                    }

                }
            }

        }

    }

}

