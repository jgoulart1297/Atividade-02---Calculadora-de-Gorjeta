package br.com.jgoulart.atividade04

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class StartActivity : AppCompatActivity() {

    lateinit var textoStart: TextView
    lateinit var botaoResume: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        textoStart = findViewById(R.id.texto_start)

        botaoResume.setOnClickListener({
            val bundle = Bundle()
            val intent = Intent(this, ResumeActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
    }
}
