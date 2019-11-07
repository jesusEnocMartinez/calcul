package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            val userDOB :Int = Integer.parseInt(editText1.text.toString())
            val currentYear :Int = Calendar.getInstance().get(Calendar.YEAR)
            val userAgeInYears :Int = currentYear - userDOB
            textView1.text = "Your age is $userAgeInYears Years"
        }

    }
}
