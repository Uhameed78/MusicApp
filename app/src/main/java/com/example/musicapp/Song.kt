package com.example.musicapp
import android.util.Log
class Song {
    var name : String = ""
    var artist : String = ""
    var duration : String = ""
    var year : Int = 0

    fun play() {
        Log.v("Song", "$name is playing ")

    }

    fun pause() {
        Log.v("Song", "$name is paused")

    }

    fun stop() {
        Log.v("Song", "$name is stopped")

    }

    fun Favourite() : Boolean {
        return true
    }

    }



