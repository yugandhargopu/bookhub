package com.example.bookhub.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.bookhub.R

class login : AppCompatActivity() {

    lateinit var phonenumber : EditText
    lateinit var password:EditText
    lateinit var loginbtn:Button
    val validphone = "1234567890"
    val validpassword = "android"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        phonenumber=findViewById(R.id.phonenumber)
        password=findViewById(R.id.pasword)
        loginbtn=findViewById(R.id.loginbtn)



        loginbtn.setOnClickListener{
        val mobilenumber = phonenumber.text.toString()
        val password = password.text.toString()

            if ((mobilenumber == validphone) && (password == validpassword)) {

                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            else{Toast.makeText(this, "wrong credentials", Toast.LENGTH_SHORT).show()}
        }
    }

}