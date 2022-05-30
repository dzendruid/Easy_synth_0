package com.example.easy_synth

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Slide
import android.view.View
import android.widget.TextView
import android.widget.ToggleButton
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.slider.Slider

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val recyclerView: RecyclerView = findViewById(R.id.waveform_viewholder)
        recyclerView.layoutManager = GridLayoutManager(this,3)
        recyclerView.setNestedScrollingEnabled(false)

        recyclerView.adapter = CustomRecyclerAdapter()


        val slider:Slider = findViewById(R.id.sliderTone)

    }



    private fun fillList(): List<String> {
        val data = mutableListOf<String>()
        (0..2).forEach { i -> data.add("osc" +" "+ (i+1)) }
        return data
    }



}