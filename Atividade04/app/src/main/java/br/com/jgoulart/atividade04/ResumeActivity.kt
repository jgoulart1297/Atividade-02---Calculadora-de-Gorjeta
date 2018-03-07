package br.com.jgoulart.atividade04

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResumeActivity : AppCompatActivity() {

    lateinit var textoResume: TextView
    lateinit var botaoPause: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resume)

        textoResume = findViewById(R.id.texto_resume)

        botaoPause.setOnClickListener({
            val bundle = Bundle()
            val intent = Intent(this, PauseActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
    }
}
