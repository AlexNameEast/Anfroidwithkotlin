package com.example.anfroidwithkotlin

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener

class SecondaryActivity : AppCompatActivity(), SomeInterface {

    override val initialDate = 20

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        val textChangeListener = object : TextWatcher {

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                TODO("Not yet implemented")
            }

            override fun afterTextChanged(p0: Editable?) {
                TODO("Not yet implemented")
            }

        }

        val editText = EditText(this)
        editText.addTextChangedListener {
            it.toString()
        }

        editText.addTextChangedListener(textChangeListener)



    }


    companion object {
        val dataKey = "AGE_KEY"
        fun start(age: Int, context: Context) {

            val intent = Intent()

            intent.putExtra(dataKey, age)

            context.startActivity(intent)

        }

    }

    override fun execute() {
        TODO("Not yet implemented")
    }

    override fun calculate(): Int {
        return super.calculate() + 2
    }
}