package com.an2t.moviereviewapp.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.findNavController
import com.an2t.moviereviewapp.R
import com.an2t.moviereviewapp.presentation.atom.AppTypography
import com.an2t.moviereviewapp.presentation.atom.RighteousTypography
import com.google.android.material.elevation.ElevationOverlayProvider

@Composable
fun AppButton(
  onClick: () -> Unit,
  label: String
) {
  OutlinedButton(
    elevation = ButtonDefaults.elevation(2.dp),
//    shape = RoundedCornerShape(percent = 50),
    shape = RoundedCornerShape(
      topLeft = 12.dp,
      topRight = 0.dp,
      bottomRight = 12.dp,
      bottomLeft = 0.dp
    ),
    border = BorderStroke(0.dp, Color.Transparent),
//    colors = ButtonConstants.defaultButtonColors(backgroundColor = Color(0xff212121)),
    colors = ButtonConstants.defaultButtonColors(backgroundColor = Color.White),
    onClick = onClick,
  ) {
    Text(
      modifier = Modifier.padding(horizontal = 20.dp),
      text = label,
      style = AppTypography.body1
    )
  }
}