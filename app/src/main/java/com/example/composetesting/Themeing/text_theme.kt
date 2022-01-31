package com.example.composetesting.Themeing

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.example.composetesting.R


@Composable
fun textThemeing() {
    val fontFamily = FontFamily(
        Font(R.font.tillana_medium, FontWeight.Medium),
        Font(R.font.tillana_bold, FontWeight.Bold),
        Font(R.font.tillana_extrabold, FontWeight.ExtraBold),
        Font(R.font.tillana_regular, FontWeight.Normal),
        Font(R.font.tillana_semibold, FontWeight.SemiBold)
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF101010))
    ) {
        Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color.Green, fontSize = 20.sp)) {
                    append("J")
                }
                append("etpack ")
                withStyle(style = SpanStyle(color = Color.Green, fontSize = 20.sp)) {
                    append("C")
                }
                append("ompose")
            },
            color = Color.White,
            fontSize = 30.sp,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Bold,
//                    textDecoration = TextDecoration.LineThrough,
        )
    }
}