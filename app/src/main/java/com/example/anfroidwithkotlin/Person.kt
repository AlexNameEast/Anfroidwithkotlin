package com.example.anfroidwithkotlin

import kotlin.math.abs

data class Person(private val firstName: String, val lastName: String, var age: Int? = null) {

    init {
        someMethod()
    }


    private val arrayList01 = ArrayList<String>()
    val arrayList02 = arrayListOf<String>()

    var someVal: Int = 0
        set(value) {
            field = value + 1
        }

    val someField = 10
    private var someField2 = ""


    lateinit var someField3: Person


    private fun someMethod(): Unit {
        print(firstName)
        someField2 = "Hi!"
        arrayList01.add("Str")

        someField3 = Person("Igor", "Lastick", 55)
        val value01 = someField3.age

        if (data01 == data02) {
            val data03 = data02.copy(b = 7.0)

        }

        arrayList01.forEach { str -> print(str) }



    }

    val data01 = SomeDataClass(3, 5.0)
    val data02 = SomeDataClass(3, 6.0)


    fun getSomeInt(): Int {
        return abs(50)
    }

    fun getSomeDouble() = 20.5

    fun doSomething(en: WeatherType = WeatherType.RAINY) {

        when (en) {
            WeatherType.SUNNY -> print("Sun")
            WeatherType.RAINY -> TODO()
            WeatherType.CLOUDY -> TODO()
            WeatherType.MISTY -> TODO()
            else -> {
                print("Un")
            }
        }

    }
}