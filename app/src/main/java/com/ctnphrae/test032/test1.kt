package com.ctnphrae.test032

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.test11.*
import kotlin.system.exitProcess

class test1 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test11)
        var name = intent.extras?.getString(MainActivity().TAG_NAME)
        var age = intent.extras?.getString(MainActivity().TAG_AGE)
        var number = intent.extras?.getString(MainActivity().TAG_NUMBER)
        var email = intent.extras?.getString(MainActivity().TAG_EMAIL)
        var division = intent.extras?.getString(MainActivity().TAG_DIVISION)
        var nickname = intent.extras?.getString(MainActivity().TAG_NICKNAME)

        tv_21.setText(name)
        tv_22.setText(age)
        tv_23.setText(number)
        tv_24.setText(email)
        tv_25.setText(division)
        tv_26.setText(nickname)

        btn_21.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            System.exit(-1)
       }
        btn_22.setOnClickListener {
            exitProcess(-1)
        }
    }
}