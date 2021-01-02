package com.an2t.moviereviewapp.presentation.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.imageFromResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.loadVectorResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import dagger.hilt.android.AndroidEntryPoint
import com.an2t.moviereviewapp.R
import com.an2t.moviereviewapp.presentation.atom.AppTypography

import com.an2t.moviereviewapp.presentation.atom.RighteousTypography
import com.an2t.moviereviewapp.presentation.components.AppButton
import com.an2t.moviereviewapp.presentation.components.AppTextField

@AndroidEntryPoint
class EnterEmailLoginFragment : Fragment(){

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    val view = ComposeView(requireContext())
    view.apply {
      setContent {
        Box(
          modifier = Modifier.fillMaxSize().background(
            color = Color.Transparent
//            VerticalGradient(
//              listOf(Color(0xff212121), Color(0xff0f1218)),
//              0f,
//              2300f,
//            )
          ),
        ) {
//          Image(
//            imageVector = vectorResource(id = R.drawable.ic_bg_splash),
//            modifier = Modifier.fillMaxSize(),
//            contentScale = ContentScale.FillBounds,
//          )
          Column(
            modifier = Modifier.fillMaxSize().padding(
              start = 16.dp,
              end = 16.dp,
              )
          ) {
//            Box{
//              Surface(
//                elevation=20.dp,
//                modifier = Modifier.size(80.dp).padding(12.dp),
//                shape = RoundedCornerShape(percent = 50),
//                color = Color.White
//              ){}
//              Image(
//                imageVector = vectorResource(id = R.drawable.ic_copon_logo),
//                modifier = Modifier.matchParentSize(),
//                contentScale = ContentScale.FillBounds,
//              )
//            }


//            Image(
//              bitmap = imageFromResource(
//                res = resources,
//                resId = R.drawable.logo),
//                modifier = Modifier
////                .height(160.dp)
//                .width(120.dp),
//              contentScale = ContentScale.FillWidth)
//            Spacer(modifier = Modifier.padding(6.dp))
            Text(
              color = Color.White,
              text="Hi There!",
              style = RighteousTypography.h2)
            Spacer(modifier = Modifier.padding(4.dp))
            Text(
              color = Color.White,
              text="to login, you need to enter your email address.",
              style = AppTypography.body1)
            Spacer(modifier = Modifier.padding(12.dp))
            AppTextField(
              modifier = Modifier.fillMaxWidth().background(
                color = Color.Transparent,
                shape = RoundedCornerShape(percent = 10)
              )
            )
            Spacer(modifier = Modifier.padding(8.dp))
            AppButton(
              onClick = { findNavController().navigate(R.id.to_enterPasswordLoginFragment) },
              label = "Next")
          }
        }
      }
    }
    return view
  }

}