package com.example.footballplayer

import MainAdapter
import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var gridView: GridView
    private var playerNames = arrayOf(
        "Cristiano Ronaldo",
        "Joao Felix",
        "Bernado Silva",
        "Andre    Silve",
        "Bruno Fernandez",
        "William Carvalho",
        "Nelson Semedo",
        "Pepe",
        "Rui Patricio"
    )
    private var playerImages = intArrayOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5,
        R.drawable.image6,
        R.drawable.image7,
        R.drawable.image8,
        R.drawable.image9
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"
        gridView = findViewById(R.id.gridView)
        val mainAdapter = MainAdapter(this@MainActivity, playerNames, playerImages)
        gridView.adapter = mainAdapter
        gridView.onItemClickListener = OnItemClickListener { _, _, position, _ ->
            Toast.makeText(
                applicationContext, "You CLicked " + playerNames[+position],
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}