package com.example.loginlab1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeActivity()
    }

    private fun changeActivity(){
        var changeActivityIntent = Intent(this, LoginActivity::class.java)
        startActivity(changeActivityIntent)
    }

}
