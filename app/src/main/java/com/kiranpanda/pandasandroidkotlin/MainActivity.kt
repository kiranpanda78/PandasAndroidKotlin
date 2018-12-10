package com.kiranpanda.pandasandroidkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setOnClickListener {
            val i = Intent(this, IntentActivity::class.java)
            startActivity(i)
        }
        button_tts.setOnClickListener {
            val i1 = Intent(this@MainActivity,Texttospeech :: class.java)
            startActivity(i1)
        }
    }
}