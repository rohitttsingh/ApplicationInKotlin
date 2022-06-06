package com.example.applicationinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttons = findViewById(R.id.button) as Button
        var textv = findViewById(R.id.textv) as TextView
        var names = findViewById(R.id.namee) as EditText
        var phones = findViewById(R.id.namep) as EditText

        buttons.setOnClickListener{
            var tv = names;
                Toast.makeText(this,""+tv.text,Toast.LENGTH_LONG).show();
        }


    }
}