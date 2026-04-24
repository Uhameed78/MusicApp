package com.example.musicapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        
        val songDisplayTxt = findViewById<TextView>(R.id.songDisplayTxt)
        var songDisplay = ""

        //create song objects
        val song1 = Song("Never Gonna Give You Up", "Rick Astley", "3:35")
        val song2 = Song("Chocolate Rain", "Tay Zonday", "4:20")
        val song3 = Song("Not Tha Same", "Yeat", "2:07")
        val song4 = Song("Poppin", "Yeat", "2:54")
        val song5 = Song("Justified", "Emotional Oranges", "2:46")

        //creating array to hold songs
        val songList = arrayOf(song1, song2, song3, song4, song5)

        // Concatenate song info into a display string
        for (song in songList) {
            songDisplay += song.GetDisplayString() + "\n"
        }

        songDisplayTxt.text = songDisplay
    }
}
