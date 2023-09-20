package com.example.belajarandroidactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TravelActivity2 : AppCompatActivity() {
    var ibCall : ImageButton? = null
    var ibNavigate : ImageButton? = null
    var ibShare : ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel2)

        ibCall = findViewById(R.id.ibCall)
        ibNavigate = findViewById(R.id.ibNavigate)
        ibShare = findViewById(R.id.ibShare)

        ibCall!!.setOnClickListener{
            val phoneNumber = "025123122"
            val phoneIntent = Intent(Intent.ACTION_DIAL,
                Uri.parse("tel: $phoneNumber"))

            startActivity(phoneIntent)
        }
        ibNavigate!!.setOnClickListener{
            val mapIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse("geo: 46.47018892050569, 7.69061359427613"))

            mapIntent.setPackage("com.google.android.app.maps")
            startActivity(mapIntent)
        }
    }
}