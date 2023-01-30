package com.example.learnapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class IntentPage2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_page2)

        val text = intent.getStringExtra("TEXT")
        val textView = findViewById<TextView>(R.id.pgOneValue)
        textView.text = "Your message is : $text"
    }
}