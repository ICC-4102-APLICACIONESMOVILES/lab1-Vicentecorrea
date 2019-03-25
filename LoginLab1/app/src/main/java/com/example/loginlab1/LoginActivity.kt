package com.example.loginlab1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.util.Patterns
import android.widget.Button

class LoginActivity : AppCompatActivity() {

    lateinit var input_mail : EditText
    lateinit var input_password : EditText
    lateinit var accept_button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        getUIReferences()
    }
    
    private fun getUIReferences(){
        input_mail = findViewById(R.id.id_input_mail)
        input_password = findViewById(R.id.id_input_password)
    }

    private fun validarMail(mail: String): Boolean {
        val pattern = Patterns.EMAIL_ADDRESS
        return pattern.matcher(mail).matches()
    }



}
