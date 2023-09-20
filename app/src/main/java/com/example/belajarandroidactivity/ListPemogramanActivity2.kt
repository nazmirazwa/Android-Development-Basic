package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.LanguageAdapter
import com.example.belajarandroidactivity.model.Language

class ListPemogramanActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_pemograman2)
        val rvBahasaPemograman:RecyclerView =
            findViewById(R.id.rvBahasaPemograman)
        val data = arrayListOf<Language>(
            Language("Golang",R.drawable.golang),
            Language("C ++",R.drawable.cplus),
            Language("Python",R.drawable.python),
            Language("Golang",R.drawable.golang),
            Language("C ++",R.drawable.cplus),
            Language("Python",R.drawable.python),
        )

        val adapter = LanguageAdapter(data)
        rvBahasaPemograman.adapter = adapter
        rvBahasaPemograman.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
    }
}