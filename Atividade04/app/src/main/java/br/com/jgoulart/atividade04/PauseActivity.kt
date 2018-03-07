package br.com.jgoulart.atividade04

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PauseActivity : AppCompatActivity() {

    lateinit var textoPause: TextView
    lateinit var botaoResume: Button
    lateinit var botaoStop: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pause)

        textoPause = findViewById(R.id.texto_pause)

        botaoResume.setOnClickListener({
            val bundle = Bundle()
            val intent = Intent(this, ResumeActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })

        botaoStop.setOnClickListener({
            val bundle = Bundle()
            val intent = Intent(this, StopActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
    }
}
