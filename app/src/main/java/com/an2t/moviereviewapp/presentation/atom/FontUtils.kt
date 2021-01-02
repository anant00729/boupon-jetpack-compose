package com.an2t.moviereviewapp.presentation.atom

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.font
import androidx.compose.ui.text.font.fontFamily
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.an2t.moviereviewapp.R

val Oxygen = fontFamily(

  font(R.font.oxygen_regular),
  font(R.font.oxygen_light, FontWeight.W500),
  font(R.font.oxygen_bold, FontWeight.Bold),
)

val Righteous = fontFamily(
  font(R.font.righteous_regular)
)

val RighteousTypography = Typography(
  h1 = TextStyle(
    fontFamily = Righteous,
    fontWeight = FontWeight.W100,
    fontSize = 32.sp,
    color = Color.White
  ),
  h2 = TextStyle(
    fontFamily = Righteous,
    fontWeight = FontWeight.W100,
    fontSize = 24.sp
  ),
  body1 = TextStyle(
    fontFamily = Righteous,
    fontWeight = FontWeight.W600,
    fontSize = 18.sp,
    color = Color(0xffFFA685E2),
    letterSpacing = TextUnit(10),
  )
)


val AppTypography = Typography(
  h1 = TextStyle(
    fontFamily = Oxygen,
    fontSize = 32.sp
  ),
  h2 = TextStyle(
    fontFamily = Oxygen,
    fontSize = 24.sp
  ),
  body2 = TextStyle(
    fontFamily = Oxygen,
    fontSize = 20.sp,
    fontWeight = FontWeight.W800,
    color = Color.White
  ),
  body1 = TextStyle(
    fontFamily = Oxygen,
    fontWeight = FontWeight.W600,
    fontSize = 18.sp,
    color = Color(0xffFFA685E2),
    letterSpacing = TextUnit(10),
  )
)

