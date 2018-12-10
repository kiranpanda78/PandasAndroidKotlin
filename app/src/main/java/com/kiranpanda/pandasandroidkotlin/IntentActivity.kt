package com.kiranpanda.pandasandroidkotlin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_intent.*

class IntentActivity : AppCompatActivity(){
    override fun onCreate(b : Bundle?){
        super.onCreate(b)
        setContentView(R.layout.activity_intent)
        btn.setOnClickListener {
            val i = Intent()
            i.action = Intent.ACTION_DIAL
            i.data = Uri.parse("tel:${et1.text.toString()}")
            startActivity(i)
        }
        browser_btn.setOnClickListener {
            val i = Intent()
            i.action = Intent.ACTION_GET_CONTENT
            i.type = "Image/*"
            startActivity(i)
        }
        whatsapp_btn.setOnClickListener {
            val i = packageManager.getLaunchIntentForPackage("com.whatsapp")
            if(i == null){
                val i1 = Intent()
                i1.action = Intent.ACTION_VIEW
                i1.data = Uri.parse("http://www.google.com")
                startActivity(i1)
            }
            else {
                startActivity(i)
            }
        }
        activity2_btn.setOnClickListener {
            val i2 = Intent(this@IntentActivity,activity2 :: class.java)
            startActivity(i2)
        }
    }
}