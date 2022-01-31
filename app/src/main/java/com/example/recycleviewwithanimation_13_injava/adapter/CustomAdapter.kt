package com.example.recycleviewwithanimation_13_injava.adapter

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import com.example.recycleviewwithanimation_13_injava.R
import android.widget.TextView
import android.view.View
import com.example.recycleviewwithanimation_13_injava.model.Member

class CustomAdapter(private val context: Context, private val members: List<Member>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_custom_layout, viewGroup, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val member = members[position]
        if (holder is CustomViewHolder) {
            val first_name = holder.first_name
            val last_name = holder.last_name
            first_name.setText(member.firstName)
            last_name.setText(member.lastName)
        }
    }

    override fun getItemCount(): Int {
        return members.size
    }

    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view){

        val first_name = view.findViewById<TextView>(R.id.first_name)
        val last_name = view.findViewById<TextView>(R.id.last_name)

    }
}