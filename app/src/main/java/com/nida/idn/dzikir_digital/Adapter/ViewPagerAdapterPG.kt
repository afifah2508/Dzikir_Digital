package com.nida.idn.dzikir_digital.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nida.idn.dzikir_digital.Data.DataPagi
import com.nida.idn.dzikir_digital.R

class ViewPagerAdapterPG(private val dataSlides : List<DataPagi>) :
        RecyclerView.Adapter<ViewPagerAdapterPG.SlideViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SlideViewHolder {
        return SlideViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.itempagi, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return dataSlides.size
    }

    override fun onBindViewHolder(holder: SlideViewHolder, position: Int) {
        holder.bind(dataSlides[position])
    }

    inner class SlideViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val txtjudul = view.findViewById<TextView>(R.id.txt_dzikirpagi)
        private val keterangan = view.findViewById<TextView>(R.id.txt_judul)
        private val txtarab = view.findViewById<TextView>(R.id.txt_arab)
        private val txtindo = view.findViewById<TextView>(R.id.txt_ido)
        private val txtarti = view.findViewById<TextView>(R.id.txt_arti)
        private val txtmakna = view.findViewById<TextView>(R.id.txt_makna)

        fun bind(dataSlide: DataPagi) {
            txtjudul.text = dataSlide.DzikirPagi
            keterangan.text = dataSlide.Judul
            txtarab.text = dataSlide.Arab
            txtindo.text = dataSlide.Indo
            txtarti.text = dataSlide.Arti
            txtmakna.text = dataSlide.Makna
        }
    }
}