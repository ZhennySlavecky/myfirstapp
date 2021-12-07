package com.zhenny.myfirstapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {


    lateinit var bottomNavigationMenu: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationMenu = findViewById(R.id.bottom_navigation_menu)
        bottomNavigationMenu.setOnItemSelectedListener { item->
            var fragment: Fragment?=null
            when (item.itemId){
                R.id.fragment_1->{
                    fragment=FirstFragment()
                }
                R.id.fragment_2->{
                    fragment=SecondFragment()
                }
            }
            replaceFragment(fragment!!)
            true
        }

        bottomNavigationMenu.selectedItemId = R.id.fragment_1
    }

    fun replaceFragment (fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace (R.id.fragment_container, fragment)
            .addToBackStack(fragment.tag)
            .commit()

    }
}

