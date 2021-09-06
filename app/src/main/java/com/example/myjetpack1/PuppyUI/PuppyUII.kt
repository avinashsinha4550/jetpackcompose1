package com.example.myjetpack1.PuppyUI

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myjetpack1.Puppyholder.PuppyyHol

@Composable
fun PuppyUII(puppuholder:PuppyyHol,onClick:()->Unit)
{
    Card(modifier = Modifier
        .padding(bottom = 4.dp, start = 4.dp, end = 4.dp, top = 4.dp)
        .fillMaxWidth()
        .clickable(onClick = onClick),shape = RoundedCornerShape(19.dp),elevation = 25.dp) {
        Row(modifier = Modifier.clip(RoundedCornerShape(4.dp)).background(MaterialTheme.colors.surface)) {
            
            
        }

    }

}
