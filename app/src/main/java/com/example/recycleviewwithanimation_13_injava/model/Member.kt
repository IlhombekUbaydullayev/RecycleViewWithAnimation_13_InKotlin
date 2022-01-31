package com.example.recycleviewwithanimation_13_injava.model

import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import com.example.recycleviewwithanimation_13_injava.R
import com.example.recycleviewwithanimation_13_injava.adapter.CustomAdapter.CustomViewHolder
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recycleviewwithanimation_13_injava.adapter.CustomAdapter
import androidx.recyclerview.widget.GridLayoutManager
import android.view.animation.LayoutAnimationController

data class Member(var firstName: String?, var lastName: String?)