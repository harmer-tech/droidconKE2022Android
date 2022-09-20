package com.android254.presentation.common.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.android254.presentation.common.theme.DroidconKE2022Theme



@Composable
fun HeaderText(text: String) {
    Row(horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
        Text(text = text,
            color = Color.Blue,
            fontWeight = FontWeight.Bold
             )
    }
}

@Preview
@Composable
fun HeaderTextPreview(){
    DroidconKE2022Theme() {
        HeaderText(text = "About")
    }
}