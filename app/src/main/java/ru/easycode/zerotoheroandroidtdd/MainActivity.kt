package ru.easycode.zerotoheroandroidtdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        private lateinit var textView : TextView
        private lateinit var button : Button
        var step : Int = 2
        var number : Int = 0
        var increment : Int = number + step


        button.setOnClickListener {
            textView.text == increment.toString()
        }


    }
}