package com.faniillahi.uts_fani_illahi.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.faniillahi.uts_fani_illahi.R
import com.faniillahi.uts_fani_illahi.detailList
import com.faniillahi.uts_fani_illahi.model.listModel


class listAdapter(
    val itemList: List<listModel>, private val context: Context
) :
    RecyclerView.Adapter<listAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgMkn: ImageView = itemView.findViewById(R.id.imgMkn)
        val namaMkn: TextView = itemView.findViewById(R.id.nameMkn)
        val tglMkn: TextView = itemView.findViewById(R.id.tglMkn)
        val hargaMkn: TextView = itemView.findViewById(R.id.hargaMkn)
        val totalMkn: TextView = itemView.findViewById(R.id.totalMKn)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int
    {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.imgMkn.setImageResource(currentItem.ImageMkn)
        holder.namaMkn.setText(currentItem.NamaMkn)
        holder.tglMkn.setText(currentItem.tglMkn)
        holder.hargaMkn.setText(currentItem.hargaMkn)
        holder.totalMkn.setText(currentItem.totalMkn)


        holder.itemView.setOnClickListener {
            // Intent untuk membuka DetailWisataActivity
            val intent = Intent(context, detailList::class.java)
            intent.putExtra("NamaMkan",currentItem.NamaMkn)
            intent.putExtra("ImageMkn", currentItem.ImageMkn)




            context.startActivity(intent)


        }

    }




}
