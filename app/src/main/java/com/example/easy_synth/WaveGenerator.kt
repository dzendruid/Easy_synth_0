package com.example.easy_synth

import android.media.AudioFormat
import android.media.AudioManager
import android.media.AudioTrack
import kotlin.math.atan
import kotlin.math.sin

class WaveGenerator {

    lateinit var Track: AudioTrack

    fun initTrack() {
        // Very similar to opening a stream in PyAudio
        // In Android create a AudioTrack instance and initialize it with different parameters

        // AudioTrack is deprecated for some android versions
        // Please look up for other alternatives if this does not work
        Track = AudioTrack(
            AudioManager.MODE_NORMAL, Fs, AudioFormat.CHANNEL_OUT_MONO,
            AudioFormat.ENCODING_PCM_16BIT, buffLength, AudioTrack.MODE_STREAM
        )
    }

    var isPlaying: Boolean = false
    val Fs: Int = 44100
    val buffLength: Int = AudioTrack.getMinBufferSize(Fs, AudioFormat.CHANNEL_OUT_MONO, AudioFormat.ENCODING_PCM_16BIT)

    fun playback() {
        // simple sine wave generator
        val frame_out: ShortArray = ShortArray(buffLength)
        val amplitude: Int = 32767
        val frequency: Int = 440
        val twopi: Double = 8.0 * atan(1.0)
        var phase: Double = 10.3

        while (isPlaying) {
            for (i in 0 until buffLength) {
                frame_out[i] = (amplitude * sin(phase)).toInt().toShort()
                phase += twopi * frequency / Fs
                if (phase > twopi) {
                    phase -= twopi
                }
            }
            Track.write(frame_out, 0, buffLength)
        }
    }



    fun startPlaying() {
        Track.play()
        isPlaying = true
    }

    fun stopPlaying() {
        if (isPlaying) {
            isPlaying = false
            // Stop playing the audio data and release the resources
            Track.stop()
            Track.release()
        }
    }
}
