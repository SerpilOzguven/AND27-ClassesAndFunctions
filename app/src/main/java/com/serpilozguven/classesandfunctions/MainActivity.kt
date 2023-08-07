package com.serpilozguven.classesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var myTextView: TextView
    private lateinit var myButton: Button
    private lateinit var nameText: EditText
    private lateinit var ageText: EditText
    private lateinit var jobText: EditText
    var name = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTextView = findViewById(R.id.viewText)
        myButton = findViewById(R.id.button)
        nameText = findViewById(R.id.nameText)
        ageText = findViewById(R.id.ageText)
        jobText = findViewById(R.id.jobText)


        }


        fun buttonClicked(view: View) {
            name = nameText.text.toString()
            val age = ageText.text.toString().toIntOrNull()
            val job = jobText.text.toString()
            if (age != null) {
                val simpson = Simpson(name, age, job)
                myButton.setOnClickListener {
                    myTextView.text =
                        "Name : ${simpson.name} Age: ${simpson.age} Job: ${simpson.job}"
                }
            } else {
                myButton.setOnClickListener {
                    myTextView.text = "Enter your age!"
                }

            }


        }
    }












