package com.example.composetesting.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlin.random.Random

@Composable
fun TestColor(){
    Column(Modifier.fillMaxSize()) {

        val rememberedColor = remember { mutableStateOf(Color.Yellow) }

        ColorBox(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
        ) {
            rememberedColor.value = it
        }
        Box(
            modifier = Modifier
                .background(rememberedColor.value)
                .weight(1f)
                .fillMaxSize()
        )
    }
}

@Composable
fun ColorBox(modifier: Modifier = Modifier, updateColor: (Color) -> Unit) {
    Box(modifier = modifier
        .background(Color.Red)
        .clickable {
            updateColor(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            )
        })
}
