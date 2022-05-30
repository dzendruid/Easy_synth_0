package com.example.easy_synth

import android.view.View
import android.widget.TextView
import android.widget.ToggleButton
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
{
    val itemsOnView = ItemsOnView(itemView)

}