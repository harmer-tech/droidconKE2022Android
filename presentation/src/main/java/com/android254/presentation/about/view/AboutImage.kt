package com.android254.presentation.about.view


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.android254.presentation.common.theme.DroidconKE2022Theme


@Composable
fun AboutImage() {
    Column(modifier = Modifier.height(250.dp).padding(4.dp) ) {
        Card(modifier = Modifier.fillMaxSize()) {
            AsyncImage(
                model = AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(com.google.android.material.R.drawable.abc_edit_text_material)
                        .build(),
                    contentScale = ContentScale.Inside,
                    contentDescription = ""
                ),
                contentDescription = "Droicon group Image",
                alignment = Alignment.Center
            )
        }
    }
}

    @Preview
    @Composable
   fun AboutImagePreview(){
        DroidconKE2022Theme {
            AboutImage()
        }
    }

