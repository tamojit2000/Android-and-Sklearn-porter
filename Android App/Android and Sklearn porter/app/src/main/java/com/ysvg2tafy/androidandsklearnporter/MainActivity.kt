package com.ysvg2tafy.androidandsklearnporter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val x=editText.text.toString()
            val y=editText2.text.toString()
            val args= arrayOf<String>(x,y)
            val ans=MLPClassifier.main(args)+1
            textView.text=ans.toString()
        }




    }
}
