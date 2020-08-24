package com.example.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*


class ResultActiviy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        if (intent.hasExtra("result")) {
            when (intent.getIntExtra("result", 0)) {
                1 -> {
                    result_text.text = "1"
                }
                2 -> {
                    result_text.text = "2"
                }
                3 -> {
                    result_text.text = "3"
                }
                4 -> {
                    result_text.text = "4"
                }
                5 -> {
                    result_text.text = "5"
                }
                6 -> {
                    result_text.text = "6"
                }
                7 -> {
                    result_text.text = "7"
                }
                8 -> {
                    result_text.text = "8"
                }
            }
        }
    }
}