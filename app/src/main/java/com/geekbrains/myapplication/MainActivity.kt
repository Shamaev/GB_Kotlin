package com.geekbrains.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val counterTxt = textView.text.toString()
            var counterInt = counterTxt.toInt()
            counterInt++
            textView.text = counterInt.toString()
        }
    }



//    fun myClick(view: View) {
//        val counterTxt : String = textView.text.toString()
//        var counterInt : Int = counterTxt.toInt()
//        counterInt++
//        textView.text = counterInt.toString()
//    }
}
