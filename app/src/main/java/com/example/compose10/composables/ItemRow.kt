package com.example.compose10.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose10.R
import com.example.compose10.data.ItemRowModel

@Composable
fun ItemRow(item: ItemRowModel) {

    var isExpanded by remember {
        mutableStateOf(false)
    }

    Row(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth()
            .background(Color.White, shape = RoundedCornerShape(5.dp))
            .clip(shape = RoundedCornerShape(5.dp))

        ) {

        Box(modifier = Modifier.shadow(elevation = 5.dp, shape = CircleShape)) {
            Image(
                painter = painterResource(item.imageId),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(5.dp)
                    .size(80.dp)
                    .clip(shape = CircleShape)
            )
        }
        Column(modifier = Modifier.padding(start = 10.dp)) {
            Text(
                text = item.title,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 5.dp)
            )

            Text(
                text = item.content,
                modifier = Modifier.padding(end = 5.dp, bottom = 5.dp).clickable {
                    isExpanded = !isExpanded
                }, maxLines = if (isExpanded) 10 else 1
            )
        }

    }
}