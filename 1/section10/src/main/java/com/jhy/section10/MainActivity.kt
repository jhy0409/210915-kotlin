package com.jhy.section10

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val btn1: Button =findViewById(R.id.btnVisibleTrue)
//        val btn2: Button =findViewById(R.id.btnVisibleFalse)
//        val textView: TextView = findViewById(R.id.textVisibleTarget)
//
//        btn1.setOnClickListener {
//            textView.visibility = View.VISIBLE
//        }
//
//        btn2.setOnClickListener {
//            textView.visibility = View.INVISIBLE
//        }

        btnVisibleTrue.setOnClickListener {
            textVisibleTarget.visibility = View.VISIBLE
        }

        btnVisibleFalse.setOnClickListener {
            textVisibleTarget.visibility = View.INVISIBLE
        }
    }
}