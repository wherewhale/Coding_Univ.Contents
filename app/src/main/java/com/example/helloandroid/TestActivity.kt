package com.example.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_test.*


class TestActivity : AppCompatActivity() {

    private var n = 1 //when제어문에서 비교할 변수 선언

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)


        btn_yes.setOnClickListener {
            when (n) {
                1 -> { //n이 1인 경우, 어디에도 거치지 않은 상황
                    textView2.text = "Yes"
                    n = 2
                }
                2 -> { //n이 2인 경우, Yes가 눌린 이후, Yes버튼이 또 눌린 상황
                    textView2.text = "Yes눌리고 Yes"
                    n = 4
                }
                3 -> { //n이 3인 경우, No가 눌린 이후, Yes버튼이 눌린 상황
                    textView2.text = "No눌리고 Yes"
                    n = 6
                }
                else -> {
                    textView2.text = "여기부턴 나중에 구현"
                }
            }
        }


        btn_no.setOnClickListener {
            when (n) {
                1 -> { //n이 1인 경우, 어디에도 거치지 않은 상황
                    textView2.text = "No"
                    n = 3
                }
                2 -> { //n이 2인 경우, Yes가 눌린 이후, No버튼이 눌린 상황
                    textView2.text = "Yes눌리고 No"
                    n = 5
                }
                3 -> { //n이 3인 경우, No가 눌린 이후, No버튼이 또 눌린 상황
                    textView2.text = "No눌리고 No"
                    n = 7
                }
                else -> {
                    textView2.text = "여기부턴 나중에 구현"
                }
            }

        }
    }
}