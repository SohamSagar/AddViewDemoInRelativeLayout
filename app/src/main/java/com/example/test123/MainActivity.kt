package com.example.test123

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rl=findViewById<RelativeLayout>(R.id.rl)

        for (i in 0..10) {
            val view: View = LayoutInflater.from(this).inflate(R.layout.testl, rl, false)
            val tv=view.findViewById<TextView>(R.id.tv)
            tv.text="TextView"+i
            view.x = (30*i*2).toFloat()
            view.y = (40*i).toFloat()
            view.setOnClickListener {
                Toast.makeText(this, tv.text.toString(), Toast.LENGTH_SHORT).show()
            }
            rl.addView(view)
        }
    }
}