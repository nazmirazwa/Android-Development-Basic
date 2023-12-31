package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class HomeActivity2 : AppCompatActivity() {
    var btnShare : MaterialButton? = null
    var btnPindah : MaterialButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)

        btnShare = findViewById(R.id.btnShare)
        btnPindah = findViewById(R.id.btnPindah)

//          action ketik btnPindah di klik
        btnPindah!!.setOnClickListener{
            val intent = Intent(this, DetailActivity2::class.java)
            startActivity(intent)
        }

//          action Share :)
        btnShare!!.setOnClickListener{
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "Saya Pesen Matcha Latte!")
            intent.setType("text/plain")
            startActivity(Intent.createChooser(intent,"Share to :"))
        }
    }
}