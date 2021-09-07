package com.example.myjetpack1.PuppyUI

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myjetpack1.Puppyholder.PuppyyHol


@Composable
fun PuppyUII(puppuholder:PuppyyHol,onClick:()->Unit)
{
    Card(modifier = Modifier
        .padding(bottom = 4.dp, start = 4.dp, end = 4.dp, top = 4.dp)
        .fillMaxWidth()
        .clickable(onClick = onClick),shape = RoundedCornerShape(19.dp),elevation = 25.dp) {
        Row(modifier = Modifier
            .clip(RoundedCornerShape(4.dp))
            .background(MaterialTheme.colors.surface)) {
            Surface(modifier =Modifier.size(130.dp),shape = RoundedCornerShape(16.dp),
                color=MaterialTheme.colors.onSurface.copy(alpha = 0.2f) ){
                Image(painter = painterResource(id = puppuholder.puppyimage),
                    contentDescription = null,modifier = Modifier
                        .height(130.dp)
                        .clip(shape = RoundedCornerShape(15.dp)),contentScale = ContentScale.Crop)
            }
            Column(modifier = Modifier
                .padding(12.dp)
                .align(Alignment.CenterVertically)) {
                Text(text = puppuholder.puppyname, fontWeight = FontWeight.Bold,
                style = androidx.compose.ui.text.TextStyle(fontSize = 14.sp)
                ,color = Color.Red)
                CompositionLocalProvider( LocalContentAlpha provides ContentAlpha.medium)
                {
                    Text(
                        text = puppuholder.puppydescription,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.padding(end = 25.dp)
                    )

                }
                
            }

            
        }

    }

}
@Preview
@Composable
fun setpuppydata()
{

}


