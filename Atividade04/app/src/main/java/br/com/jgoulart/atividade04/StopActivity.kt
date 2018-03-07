package br.com.jgoulart.atividade04

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class StopActivity : AppCompatActivity() {

    lateinit var textoStop: TextView
    lateinit var botaoStart: Button
    lateinit var botaoDestroy: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stop)

        textoStop = findViewById(R.id.texto_stop)

        botaoStart.setOnClickListener({
            val bundle = Bundle()
            val intent = Intent(this, StartActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })

        botaoDestroy.setOnClickListener({
            val bundle = Bundle()
            val intent = Intent(this, DestroyActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
    }
}
