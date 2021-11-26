package com.example.lifecycle_kotion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    private var app = "MainActivity"


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            Log.i(app, "onCreate: executed")  //called when activity is first created.

        }
        override fun onStart() {
            super.onStart()
            Log.i(app, "onStart: executed") //called when activity is becoming visible to the user.


        }
        override fun onRestart() {
            super.onRestart()
            Log.i(app, "onRestart: executed")//called when activity will start interacting with the user.

        }
        override fun onPause() {
            super.onPause()
            Log.i(app, "onPause: executed")//called when activity will start interacting with the user.


        }
        override fun onStop() {
            super.onStop()
            Log.i(app, "onStop: executed")//called when activity is no longer visible to the user.


        }

        override fun onResume() {
            super.onResume()
            Log.i(app, "onResume: executed")//called after your activity is stopped, prior to start.


        }

        override fun onDestroy() {
            super.onDestroy()
            Log.i(app, "onDestroy: executed")//called before the activity is destroyed.

        }
    }

