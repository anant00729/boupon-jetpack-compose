package com.an2t.moviereviewapp.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.an2t.moviereviewapp.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AuthActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_auth)
  }
}