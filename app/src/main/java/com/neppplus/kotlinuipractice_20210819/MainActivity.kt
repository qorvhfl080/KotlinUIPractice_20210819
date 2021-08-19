package com.neppplus.kotlinuipractice_20210819

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toastBtn.setOnClickListener {

//            입력한 메세지가 뭔지 변수에 저장
//            messageEdt의 text 속성에 담겨있는 값을 inputMessage 변수에 담기
            val inputMessage = messageEdt.text.toString()

//            토스트로 inputMessage를 띄워주기
            Toast.makeText(this, inputMessage, Toast.LENGTH_SHORT).show()
        }

    }
}