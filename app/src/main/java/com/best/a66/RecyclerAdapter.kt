package com.best.a66

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(var list :ArrayList<User>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val getData =
            LayoutInflater.from(parent.context).inflate(R.layout.foradapter, parent, false)
        return ViewMade(getData)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val user = list[position]
        if (holder is ViewMade) {
            holder.detail.text = user.name

        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewMade(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var detail: TextView = itemView.findViewById(R.id.item_detail)
    }
}