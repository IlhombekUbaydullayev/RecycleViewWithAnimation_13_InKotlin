package com.example.recycleviewwithanimation_13_injava.activity

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewwithanimation_13_injava.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.example.recycleviewwithanimation_13_injava.adapter.CustomAdapter
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recycleviewwithanimation_13_injava.model.Member
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private var context: Context? = null
    private var recyclerView: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        val members = prepareMemerList()
        refreshAdapter(members)
    }

    private fun prepareMemerList(): List<Member> {
        val members = ArrayList<Member>()
        for (i in 0..29) {
            members.add(Member("Ilhombek$i", "Ubaydullayev$i"))
        }
        return members
    }

    private fun refreshAdapter(members: List<Member>) {
        val adapter = CustomAdapter(this, members)
        recyclerView!!.adapter = adapter
    }

    private fun initView() {
        context = this
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView!!.layoutManager = GridLayoutManager(context, 1)
        val animation =
            AnimationUtils.loadLayoutAnimation(context, R.anim.layout_animation_fall_down)
        recyclerView!!.layoutAnimation = animation
    }
}