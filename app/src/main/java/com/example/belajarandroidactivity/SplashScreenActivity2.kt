package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen2)

//      panggilan object handle dari package os
//      pastDelayed untuk menjalankan action ketika
//      waktu yang ditentukan telah selesai
        Handler().postDelayed({
            val intent = Intent(this,
                DashboardDoaActivity2::class.java)
            startActivity(intent)
        },5000)
    }
    }
