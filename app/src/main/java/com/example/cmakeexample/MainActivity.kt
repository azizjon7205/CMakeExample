package com.example.cmakeexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    init {
        System.loadLibrary("native-lib")
    }

    external fun getPublicKey(): String?

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("@@@", "Public key : ${getPublicKey().toString()}")
    }
}