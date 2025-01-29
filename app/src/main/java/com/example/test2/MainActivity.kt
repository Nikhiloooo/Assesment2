package com.example.test2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.test2.ui.theme.Test2Theme

class MainActivity : AppCompatActivity(){
    private lateinit var  countryText : EditText
    private lateinit var  sourceText : EditText
    private lateinit var  showNewsButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countryText=findViewById(R.id.edit_text_country)
        sourceText=findViewById(R.id.edit_text_source)
        showNewsButton=findViewById(R.id.btn_show_news)

        showNewsButton.setOnClickListener{
            val intent= Intent(this,ActivityTwo::class.java)
            intent.putExtra("country",countryText.text.toString())
            intent.putExtra("source",countryText.text.toString())
            startActivity(intent)

        }
    }


}