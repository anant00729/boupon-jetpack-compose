package com.an2t.moviereviewapp.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.savedinstancestate.savedInstanceState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun AppTextField(
  modifier: Modifier = Modifier,
) {
  val state = savedInstanceState(saver = TextFieldValue.Saver) { TextFieldValue() }
  Row(
    modifier = modifier,
    verticalAlignment = Alignment.CenterVertically
  ) {
    Box {
      TextField(
        singleLine = true,
        modifier = Modifier.fillMaxWidth(),
        value = state.value,
        onValueChange = { state.value = it },
        activeColor = Color.Transparent,
        inactiveColor = Color.Transparent,
        textStyle = TextStyle(color = Color.White, fontSize = 16.sp),
        shape = RoundedCornerShape(
          topLeft = 12.dp,
          topRight = 0.dp,
          bottomRight = 12.dp,
          bottomLeft = 0.dp
        ),
//        backgroundColor = Color(0xff191919),
        backgroundColor = Color.White,
        keyboardOptions = KeyboardOptions(
          keyboardType = KeyboardType.Email,
          imeAction = ImeAction.Done,
        ),
      )
    }
  }
}