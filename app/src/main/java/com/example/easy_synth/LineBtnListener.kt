package com.example.easy_synth

import android.widget.ToggleButton

class LineBtnListener() {

    val vaweformgenerator = WaveGenerator()

    fun formDisableOther (myButtonElement1:ToggleButton, myButtonElement2:ToggleButton ) {
        myButtonElement1.isChecked = false
        myButtonElement2.isChecked = false
        vaweformgenerator.stopPlaying()
    }


    fun sinsGeneratorAndDisable(myButtonElement1:ToggleButton, myButtonElement2:ToggleButton)
    {
        vaweformgenerator.initTrack()
        vaweformgenerator.startPlaying()
        vaweformgenerator.playback()
        myButtonElement1.isChecked = false
        myButtonElement2.isChecked = false
    }

    fun sliderChangeFrequency(){}
}