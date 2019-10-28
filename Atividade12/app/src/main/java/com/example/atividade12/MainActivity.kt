package com.example.atividade12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Main")
        val texto = findViewById<View>(R.id.editText) as EditText
        val botao = findViewById<View>(R.id.button) as Button
        botao.setOnClickListener {
                val intencao = Intent(this@MainActivity, ChildActivity::class.java)
                intencao.putExtra("msg", texto.getText().toString());
                startActivity(intencao)
            }

    }
}
