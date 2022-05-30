package com.example.easy_synth

import android.view.View
import android.widget.TextView
import android.widget.ToggleButton

class ItemsOnView(itemView: View) {



    val thisOscName: TextView = itemView.findViewById(R.id.oscName)
    val sinFormBtn: ToggleButton = itemView.findViewById(R.id.btn_sinForm)
    val triangleFormBtn: ToggleButton = itemView.findViewById(R.id.btn_triangleForm)
    val qauadFormBtn: ToggleButton = itemView.findViewById(R.id.btn_quadForm)

 fun setListenerOnBtnItems()
 {
     sinFormBtn.setOnClickListener(View.OnClickListener {
         LineBtnListener().sinsGeneratorAndDisable(
             triangleFormBtn,
             qauadFormBtn
         )
     })
     triangleFormBtn.setOnClickListener(View.OnClickListener {
         LineBtnListener().formDisableOther(
             sinFormBtn,
             qauadFormBtn
         )
     })
     qauadFormBtn.setOnClickListener(View.OnClickListener {
         LineBtnListener().formDisableOther(
             sinFormBtn,
             triangleFormBtn
         )
     })
 }

}


