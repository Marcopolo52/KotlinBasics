package com.example.kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/** Kotlin basics
 * https://www.youtube.com/watch?v=HwoxgUPabMk&ab_channel=tutorialsEU
 * https://www.youtube.com/watch?v=wuiT4T_LJQo&list=LL&ab_channel=DonnFelker
 * https://www.youtube.com/watch?v=bo_LP6QOUio&ab_channel=freeCodeCamp.org
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val basics = Basics()
        // basics.test1().jamba.hs

        var car = Car("sf", "sdf")
        car.fill(228.5)

    }
}