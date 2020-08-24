package com.example.helloandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_test.*


class TestActivity : AppCompatActivity() {

    private var n = 1 //when제어문에서 비교할 변수 선언

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val intent = Intent(this, ResultActiviy::class.java)

        val ani = AnimationUtils.loadAnimation(this, R.anim.fade_in)

        btn_yes.setOnClickListener {
            when (n) {
                1 -> { //n이 1인 경우, 어디에도 거치지 않은 상황
                    textView2.text = "Yes"
                    textView2.clearAnimation()
                    textView2.startAnimation(ani)
                    n = 2
                }
                2 -> { //n이 2인 경우, Yes가 눌린 이후, Yes버튼이 또 눌린 상황
                    textView2.text = "Yes눌리고 Yes"
                    textView2.clearAnimation()
                    textView2.startAnimation(ani)
                    n = 4
                }
                3 -> { //n이 3인 경우, No가 눌린 이후, Yes버튼이 눌린 상황
                    textView2.text = "No눌리고 Yes"
                    textView2.clearAnimation()
                    textView2.startAnimation(ani)
                    n = 6
                }

                //여기부터는 결과로 이어지는 과정
                4 -> { //질문4에서 Yes 선택 = 결과 1
                    intent.apply{
                        putExtra("result", 1)
                    }
                    startActivity(intent)
                }
                5 -> { //질문5에서 Yes 선택 = 결과 3
                    intent.apply{
                        putExtra("result", 3)
                    }
                    startActivity(intent)
                }
                6 -> { //질문6에서 Yes 선택 = 결과 5
                    intent.apply{
                        putExtra("result", 5)
                    }
                    startActivity(intent)
                }
                7 -> { //질문7에서 Yes 선택 = 결과 7
                    intent.apply{
                        putExtra("result", 7)
                    }
                    startActivity(intent)
                }

            }
        }


        btn_no.setOnClickListener {
            when (n) {
                1 -> { //n이 1인 경우, 어디에도 거치지 않은 상황
                    textView2.text = "No"
                    textView2.clearAnimation()
                    textView2.startAnimation(ani)
                    n = 3
                }
                2 -> { //n이 2인 경우, Yes가 눌린 이후, No버튼이 눌린 상황
                    textView2.text = "Yes눌리고 No"
                    textView2.clearAnimation()
                    textView2.startAnimation(ani)
                    n = 5
                }
                3 -> { //n이 3인 경우, No가 눌린 이후, No버튼이 또 눌린 상황
                    textView2.text = "No눌리고 No"
                    textView2.clearAnimation()
                    textView2.startAnimation(ani)
                    n = 7
                }
                //여기부터는 결과로 이어지는 과정
                4 -> { //질문4에서 No 선택 = 결과 2
                    intent.apply{
                        putExtra("result", 2)
                    }
                    startActivity(intent)
                }
                5 -> { //질문5에서 No 선택 = 결과 4
                    intent.apply{
                        putExtra("result", 4)
                    }
                    startActivity(intent)
                }
                6 -> { //질문6에서 No 선택 = 결과 6
                    intent.apply{
                        putExtra("result", 6)
                    }
                    startActivity(intent)
                }
                7 -> { //질문7에서 No 선택 = 결과 8
                    intent.apply{
                        putExtra("result", 8)
                    }
                    startActivity(intent)
                }
            }

        }
    }
}