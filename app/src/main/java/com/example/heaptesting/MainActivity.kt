package com.example.heaptesting

import android.app.ActivityManager
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.getSystemService


class MainActivity : AppCompatActivity() {
    lateinit var text : TextView
    lateinit var textLarge : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val am: ActivityManager = getSystemService(ACTIVITY_SERVICE) as ActivityManager

        text = findViewById(R.id.single_text)
        textLarge = findViewById(R.id.single_large_text)

        text.setText(am.memoryClass.toString())
        textLarge.setText(am.largeMemoryClass.toString())

    }
}