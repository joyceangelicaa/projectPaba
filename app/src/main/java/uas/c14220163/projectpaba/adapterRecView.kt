package uas.c14220163.projectpaba

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapterRecView (private val listAgency: ArrayList<agencyMarketing>) : RecyclerView
.Adapter<adapterRecView.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var _namaAgency = itemView.findViewById<TextView>(R.id.namaMarketingAgency)
        var _hargaAgency = itemView.findViewById<TextView>(R.id.hargaMarketingAgency)
        var _lokasiAgency = itemView.findViewById<TextView>(R.id.lokasiMarketingAgency)
        var _gambarAgency = itemView.findViewById<ImageView>(R.id.gambarMarketingAgency)
        var _btnBack = itemView.findViewById<ImageButton>(R.id.btnBack)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.recommendation_page, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int{
        return listAgency.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        var agency = listAgency[position]

        holder._namaAgency.setText(agency.nama)
        holder._hargaAgency.setText(agency.harga)
        holder._lokasiAgency.setText(agency.lokasi)
    }
}