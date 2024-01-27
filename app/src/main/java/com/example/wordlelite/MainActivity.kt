package com.example.wordlelite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val g1Label = findViewById<TextView>(R.id.guess1Label)
        val g1txt = findViewById<TextView>(R.id.guess1Txt)
        val g1CLabel = findViewById<TextView>(R.id.guess1CheckLabel)
        val g1CTxt = findViewById<TextView>(R.id.guess1TxtC)

        val g2Label = findViewById<TextView>(R.id.guess2Label)
        val g2txt = findViewById<TextView>(R.id.guess2Txt)
        val g2CLabel = findViewById<TextView>(R.id.guess2CheckLabel)
        val g2CTxt = findViewById<TextView>(R.id.guess2TxtC)

        val g3Label = findViewById<TextView>(R.id.guess3Label)
        val g3txt = findViewById<TextView>(R.id.guess3Txt)
        val g3CLabel = findViewById<TextView>(R.id.guess3CheckLabel)
        val g3CTxt = findViewById<TextView>(R.id.guess3TxtC)
    }
}