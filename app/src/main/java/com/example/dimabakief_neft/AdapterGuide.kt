package com.example.dimabakief_neft

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterGuide (private var GuideList: List<Guide>):
    RecyclerView.Adapter<AdapterGuide.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvFullName = itemView.findViewById<TextView>(R.id.tvFullName)
        val tvPost = itemView.findViewById<TextView>(R.id.tvPost)
        val tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
        val tvPhones = itemView.findViewById<TextView>(R.id.tvPhones)

            fun bind(guide: Guide) {
                tvFullName.text = guide.fullName
                tvPost.text = guide.post
                tvEmail.text = guide.email
                tvPhones.text = guide.phones
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterGuide.ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_guide, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: AdapterGuide.ViewHolder, position: Int) = holder.bind(GuideList[position])

        override fun getItemCount(): Int = GuideList.size

    }