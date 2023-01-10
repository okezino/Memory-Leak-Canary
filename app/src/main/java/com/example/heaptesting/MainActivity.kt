package com.example.heaptesting

import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.getSystemService


class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    companion object{
        lateinit var context : Context
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.next)
        activateClickListener()
    }


    private fun navigateToSecondScreen(){
        Intent(this, SecondActivity::class.java).also {
            startActivity(it)
        }
    }


    private fun activateClickListener(){
        button.setOnClickListener {
            navigateToSecondScreen()
        }
    }



}