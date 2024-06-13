package com.dicoding.resaipku

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.resaipku.ui.MainActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Intent(this, MainActivity::class.java).also {
            runBlocking {
                delay(3000L)
                startActivity(it)
                finish()
            }
        }
    }
}