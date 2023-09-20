package com.example.belajarandroidactivity.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.R
import com.example.belajarandroidactivity.model.DoaHarian

class DoaHarianAdapter(val data:ArrayList<DoaHarian>)
    :RecyclerView.Adapter
            <DoaHarianAdapter.DoaHarianViewHolder>()
{
    class DoaHarianViewHolder(view:View)
        :RecyclerView.ViewHolder(view)
    {
        val tvJudulDoa: TextView = view.findViewById(R.id.tvJudulDoa)
        val tvDoaArab: TextView = view.findViewById(R.id.tvDoaArab)
        val tvDoaLatin: TextView = view.findViewById(R.id.tvDoaLatin)
        val ibCollapse: ImageButton = view.findViewById(R.id.ibCollapse)
        val rlIsiDoa: RelativeLayout = view.findViewById(R.id.rlIsiDoa)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaHarianViewHolder {
       val view = LayoutInflater.from(parent.context)
           .inflate(R.layout.item_doa_harian,parent,false)
        return DoaHarianViewHolder(view)
    }

    @SuppressLint("ResourceType")
    override fun onBindViewHolder(holder: DoaHarianViewHolder, position: Int) {
        val item = data.get(position)
        holder.tvJudulDoa.text = item.judul
        holder.tvDoaArab.text = item.textArab
        holder.tvDoaLatin.text = item.textLatin
//    Disini kita dibuat collapse sama seperti di latihan visible
        holder.ibCollapse.setOnClickListener {
            if (holder.rlIsiDoa.visibility == View.GONE) {
                holder.rlIsiDoa.visibility = View.VISIBLE
            } else {
                holder.rlIsiDoa.visibility = View.GONE
            }
        }
    }
        override fun getItemCount(): Int = data.size
    }


