package com.example.anfroidwithkotlin;

import android.content.Context;

public class SomeJavaClass {

    private Context context;

    public SomeJavaClass(Context context) {
        this.context = context;
    }

    void someMethod() {
        Person person = new Person("Igor", "Antonjak", 29);

        SecondaryActivity.Companion.start(55, context);

        KotlinSingleton.INSTANCE.getSomeField();

    }
}
