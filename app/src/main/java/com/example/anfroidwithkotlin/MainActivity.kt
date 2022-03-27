package com.example.anfroidwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val persons = listOf(
            Person("Vasia", "Sherb", 25),
            Person("Masha", "Voznik")
        )


        val textview01 = findViewById<TextView>(R.id.text)

        textview01.text = persons[0].lastName

        textview01.setOnClickListener {
            Toast.makeText(this, (it as TextView).text, Toast.LENGTH_LONG).show()
        }

        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            SecondaryActivity.start(55, this) }


        KotlinSingleton.someField



    }


}