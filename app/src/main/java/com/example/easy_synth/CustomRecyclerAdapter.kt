package com.example.easy_synth

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CustomRecyclerAdapter() : RecyclerView.Adapter<MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.osc_1, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.itemsOnView.thisOscName.text = "osc " + (position + 1)
        holder.itemsOnView.setListenerOnBtnItems()




/*        holder.sinFormBtn.id = position
        holder.triangleFormBtn.id = position
        holder.qauadFormBtn.id =  position*/

    }

    override fun getItemCount(): Int {
        //return names.size
        val myint: Int = 3
        return myint
    }


}
