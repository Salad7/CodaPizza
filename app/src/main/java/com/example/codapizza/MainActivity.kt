package com.example.codapizza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Checkbox
import androidx.compose.material.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row {
                Checkbox (
                    checked = true,
                    onCheckedChange = {
                        Toast.makeText(this@MainActivity,"Tapped item",Toast.LENGTH_LONG).show()
                    })
                Column {
                    Text(text = "Pineapple")
                    Text(text = "Whole Pizza")
                    }

                
            }
        }
    }
}