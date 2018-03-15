package br.com.jgoulart.atividade05calculadoradegorjeta

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import br.com.jgoulart.atividade05calculadoradegorjeta.R.id.*
import org.w3c.dom.Text

class CalculadoraActivity : AppCompatActivity() {

    lateinit var etValorConta: EditText
    lateinit var txtPorcentagem: TextView
    lateinit var sbPorcentagem: SeekBar
    lateinit var txtGorjeta: TextView
    lateinit var txtTotal:TextView
    var gorjeta : Double = 0.0
    var dinheito : Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        sbPorcentagem = findViewById(R.id.sbPorcentagem)
        etValorConta = findViewById(R.id.etValorConta)
        txtPorcentagem = findViewById(R.id.txtPorcentagem)
        txtGorjeta = findViewById(R.id.txtGorjeta)
        txtTotal = findViewById(R.id.txtTotal)

            sbPorcentagem.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

                @Override
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    if(etValorConta.text.isEmpty()){
                        Toast.makeText(this@CalculadoraActivity, "Preencha o campo vazio !!", Toast.LENGTH_SHORT).show()
                    }else {
                        txtPorcentagem.setText("" + p1 + "%")
                        var aux = txtPorcentagem.text.toString()
                        aux = aux.substring(0, aux.length - 1)
                        gorjeta = ((etValorConta.text.toString().toDouble()) * (aux.toDouble() / 100))
                        gorjeta = ((gorjeta * 100) / 100)
                        dinheito = (etValorConta.text.toString().toDouble()) + gorjeta
                        txtGorjeta.setText("" + gorjeta.toString())
                        txtTotal.setText("" + dinheito.toString())
                    }

                }

                override fun onStopTrackingTouch(p0: SeekBar?) {

                }

                override fun onStartTrackingTouch(p0: SeekBar?) {
                }

            })


    }
}



