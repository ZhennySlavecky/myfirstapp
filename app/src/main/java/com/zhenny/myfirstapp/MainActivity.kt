package com.zhenny.myfirstapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

const val TAG="MainActivity"

class MainActivity : AppCompatActivity() {

  //  lateinit var helloTextView: TextView
   // lateinit var newTextButton: Button
    lateinit var nextActivityButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,getString(R.string.str1))

        nextActivityButton = findViewById(R.id.center_button)
        nextActivityButton.setOnClickListener {
        //    val secondActivityIntent: Intent= Intent(this, SecondActivity::class.java)
        //    startActivity(secondActivityIntent)
            val googleLink = Uri.parse("http://google.com")
            val openBrowserIntent = Intent(Intent.ACTION_VIEW, googleLink)
            startActivity(openBrowserIntent)

        }

   //     fun main(): String {
   //        val value: String
   //        value = ""
   //         for (i in 'a'..'z'){
   //             if (i.code % 2 == 0) value.append(i)
   //         }
   //         return value
   //     }

        //helloTextView = findViewById(R.id.hello)
       // newTextButton = findViewById(R.id.center_button)

       // fun newTextButtonClick() {
        //    newTextButton.setOnClickListener {
        //        helloTextView.text = main()
         //   }
       // }

       // newTextButtonClick()
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,getString(R.string.str2))
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,getString(R.string.str3))
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,getString(R.string.str4))
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,getString(R.string.str5))
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,getString(R.string.str6))
    }

}

//private fun String.append(i: Char) {

//}

