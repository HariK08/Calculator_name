package com.example.calculator_name

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var num1: EditText? = null
    private var num2: EditText? = null
    private var add: Button? = null
    private var sub: Button? = null

    private var sum: TextView? = null
    private var diff: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        num1 = findViewById(R.id.num1)
        num2 = findViewById(R.id.num2)

        add = findViewById(R.id.add)
        sum = findViewById(R.id.sum)

        sub = findViewById(R.id.sub)
        diff = findViewById(R.id.diff)


        add?.setOnClickListener {
            val number1=num1?.text.toString().toDouble()
            val number2=num2?.text.toString().toDouble()

            sum?.text = (number1+number2).toString()

        }

        sub?.setOnClickListener {
            val number1=num1?.text.toString().toDouble()
            val number2=num2?.text.toString().toDouble()

            diff?.text = (number1-number2).toString()

        }




    }


}