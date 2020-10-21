package com.example.learningkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val TAG : String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        feedTheFish()
    }

    fun feedTheFish(){
        val day = randomDay()
        val food : String? = fishFood(day)
        Log.d(TAG,"Today is $day. The fish eat $food")
    }

    fun randomDay() : String{
        val days = arrayOf("Mon","Tue","Wed","Thu","Fri","Sat","Sun")
        return days[Random.nextInt(days.size)]
    }

    fun fishFood(day : String) : String?{
        return when(day){
            "Mon" -> "flakes"
            "Tue" -> "pellets"
            "Wed" -> "redworms"
            "Thu" -> "granules"
            "Fri" -> "mosquitoes"
            "Sat" -> "lettuce"
            "Sun" -> "plankton"
            else -> null
        }
    }

    fun intiArray(){
        val array = Array(5){}
    }
}
