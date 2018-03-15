package br.com.jgoulart.atividade05calculadoradegorjeta

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etLogin = findViewById<EditText>(R.id.etLogin)
        var etPassword = findViewById<EditText>(R.id.etPassword)
        var btnLogar = findViewById<Button>(R.id.btnLogar)

        btnLogar.setOnClickListener({
            val login = etLogin.text
            val password = etPassword.text

            if (login.toString() == "João" && password.toString() == "joao123"){
                Toast.makeText(this, "Logado com sucesso!!", Toast.LENGTH_SHORT).show()
                etLogin.setText("")
                etPassword.setText("")
                val bundle = Bundle()
                val intent = Intent(this, CalculadoraActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }else if(login.isEmpty() || password.isEmpty()){
                Toast.makeText(this, "Preencha todos os campos!!", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Usuário e/ou senha incorretos!!", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
