package com.example.guessthephrse2

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class RecyclerAdapter (val messges:ArrayList<String>): RecyclerView.Adapter<RecyclerAdapter.ItemViewHolder>(){
    class ItemViewHolder (itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
            R.layout.item,parent,false)
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val msg=messges[position]
        holder.itemView.apply {
            tvMsg.text=msg
            if(msg.startsWith("Found")){
                tvMsg.setTextColor(Color.GREEN)
            } else if (msg.startsWith("No",true)|| msg.startsWith("Wrong",true)){
                tvMsg.setTextColor(Color.RED)
            } else
                tvMsg.setTextColor(Color.BLACK)
        }
    }

    override fun getItemCount(): Int =messges.size

}