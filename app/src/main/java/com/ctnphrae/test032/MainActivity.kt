package com.ctnphrae.test032

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.System.exit

class MainActivity : AppCompatActivity() {
    public final var TAG_NAME:String = "NAME"
    public final var TAG_AGE :String = "AGE"
    public final var TAG_NUMBER :String ="NUMBER"
    public final var TAG_EMAIL :String ="EMAIL"
    public final var TAG_DIVISION :String ="DIVISION"
    public final var TAG_NICKNAME :String ="NICKNAME"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_1.setOnClickListener {
            var name = text1.text.toString()
            var age = text2.text.toString()
            var number = text3.text.toString()
            var email = text4.text.toString()
            var division = text5.text.toString()
            var nickname = text6.text.toString()

            sentderFun(name,age,number,email,division,nickname)
        }
        btn_2.setOnClickListener {
            close()
        }
    }
    fun sentderFun (arg1 : String , arg2 : String,arg3 : String,arg4 : String,arg5 : String,arg6 : String){
        var goPageSecoud  = Intent(this,test1::class.java)
        goPageSecoud.putExtra(TAG_NAME,arg1)
        goPageSecoud.putExtra(TAG_AGE,arg2)
        goPageSecoud.putExtra(TAG_NUMBER,arg3)
        goPageSecoud.putExtra(TAG_EMAIL,arg4)
        goPageSecoud.putExtra(TAG_DIVISION,arg5)
        goPageSecoud.putExtra(TAG_NICKNAME,arg6)

        startActivity(goPageSecoud)
        exit(-1)
    }
    fun close(){
        exit(-1)
    }

}
