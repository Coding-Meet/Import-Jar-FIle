package com.coding.meet.importjarfile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.coding.meet.toast.SomeResponse
import com.coding.meet.toast.longToastShow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edName = findViewById<EditText>(R.id.edName)
        val showNameBtn = findViewById<Button>(R.id.showNameBtn)
        showNameBtn.setOnClickListener {
            if (edName.text.toString().trim().isNotEmpty()){
                longToastShow(this,edName.text.toString().trim())
            }else{
                longToastShow(this,"Required")
            }
        }



        val showStaticToastBtn = findViewById<Button>(R.id.showStaticToastBtn)
        showStaticToastBtn.setOnClickListener {
            val someResponse = SomeResponse(this)
            someResponse.getChannelName()
        }
    }
}