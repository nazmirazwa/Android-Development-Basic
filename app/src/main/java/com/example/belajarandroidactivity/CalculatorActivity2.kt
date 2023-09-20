
package com.example.belajarandroidactivity

import android.app.Dialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class CalculatorActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator2)

        val Angka1 : TextView = findViewById(R.id.Angka1)
        val inputAngka1 : EditText = findViewById(R.id.inputAngka1)

        val Angka2 : TextView = findViewById(R.id.Angka2)
        val inputAngka2 : EditText = findViewById(R.id.inputAngka2)

        val btnTambah : Button = findViewById(R.id.btnTambah)
        val btnMinus : Button = findViewById(R.id.btnMinus)
        val btnPersen : Button = findViewById(R.id.btnPersen)
        val btnKali : Button = findViewById(R.id.btnKali)
        val btnPer : Button = findViewById(R.id.btnPer)
        val btnClear : Button = findViewById(R.id.btnClear)

        val hasil : TextView = findViewById(R.id.Hasil)

        val builder : AlertDialog.Builder =
            AlertDialog.Builder(this@CalculatorActivity2)

        btnTambah.setOnClickListener {
            var rumus1 : Int = inputAngka1.text.toString().toInt()
            var rumus2 : Int = inputAngka2.text.toString().toInt()
            var rumus : Int
            rumus = rumus1 + rumus2
            hasil.text = rumus.toString()
        }
        btnMinus.setOnClickListener {
            var rumus1 : Int = inputAngka1.text.toString().toInt()
            var rumus2 : Int = inputAngka2.text.toString().toInt()
            var rumus : Int
            rumus = rumus1 - rumus2
            hasil.text = rumus.toString()
        }
        btnPersen.setOnClickListener {
            var rumus1 : Int = inputAngka1.text.toString().toInt()
            var rumus2 : Int = inputAngka2.text.toString().toInt()
            var rumus : Int
            rumus = rumus1 % rumus2
            hasil.text = rumus.toString()
        }
        btnKali.setOnClickListener {
            var rumus1 : Int = inputAngka1.text.toString().toInt()
            var rumus2 : Int = inputAngka2.text.toString().toInt()
            var rumus : Int
            rumus = rumus1 * rumus2
            hasil.text = rumus.toString()
        }
        btnPer.setOnClickListener {
            var rumus1 : Float = inputAngka1.text.toString().toFloat()
            var rumus2 : Float = inputAngka2.text.toString().toFloat()
            var rumus : Float
            rumus = rumus1 / rumus2
            hasil.text = rumus.toString()
        }
        btnClear.setOnClickListener {
            builder.setTitle("Perhatian")
            builder.setMessage("Kamu yakin mau menghapus datanya")
            builder.setCancelable(false)

            builder.setIcon(R.drawable.baseline_info_24)

            builder.setPositiveButton("Yes",
                DialogInterface.OnClickListener { dialog, which ->
                    hasil.text = "0"
                    inputAngka1.setText("")
                    inputAngka2.setText("")
                })
            builder.setNegativeButton("No",
            DialogInterface.OnClickListener { dialog, which ->  })

//          agar builder kita dibuat harus panggil fungsi builder create()
            val alertDialog : AlertDialog = builder.create()

//          untuk menampilkan popup gunakan fungsi show()
            alertDialog.show()

            var rumus1 : Float = inputAngka1.text.toString().toFloat()
            var rumus2 : Float = inputAngka2.text.toString().toFloat()
            var rumus : Float
        }
    }
}