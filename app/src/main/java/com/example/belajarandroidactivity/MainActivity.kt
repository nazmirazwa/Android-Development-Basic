package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val judulForm : TextView = findViewById(R.id.judulForm)
        val labelNama : TextView = findViewById(R.id.labelNama)
        val labelKelas : TextView = findViewById(R.id.labelKelas)
        val labelKodeBuku : TextView = findViewById(R.id.labelKodeBuku)
        val tampilkanNama : TextView = findViewById(R.id.tampilkanNama)
        val tampilkanKelas : TextView = findViewById(R.id.tampilkanKelas)
        val tampilkanBuku : TextView = findViewById(R.id.tampilkanBuku)

        val inputNama : EditText = findViewById(R.id.inputNama)
        val inputKelas : EditText = findViewById(R.id.inputKelas)
        val inputKodeBuku : EditText = findViewById(R.id.inputKodeBuku)

        val btnSubmit : Button = findViewById(R.id.btnSubmit)

        btnSubmit.setOnClickListener{
            Toast.makeText(this, "Hello {$inputNama}", Toast.LENGTH_SHORT).show()
            tampilkanNama.text = inputNama.text
            tampilkanKelas.text = inputKelas.text
            val kode:Int = inputKodeBuku.text.toString().toInt()
            when(kode){
                123 -> tampilkanBuku.text = "Harry Potter"
                456 -> tampilkanBuku.text = "Alice"
                else -> tampilkanBuku.text = "Tidak Ada"
            }
            tampilkanBuku.text
        }

    }
}