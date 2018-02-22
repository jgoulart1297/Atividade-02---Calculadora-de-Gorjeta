package br.com.jgoulart.atividade02_calculadoradegorjeta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    EditText etValorConta;
    TextView txtPorcentagem;
    SeekBar sbPorcentagem;
    TextView txtGorjeta;
    TextView txtTotal;
    Double dinheiro;
    Double gorjeta;
    String aux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etValorConta = findViewById(R.id.etValorConta);
        txtPorcentagem = findViewById(R.id.txtPorcentagem);
        sbPorcentagem = findViewById(R.id.sbPorcentagem);
        txtGorjeta = findViewById(R.id.txtGorjeta);
        txtTotal = findViewById(R.id.txtTotal);

        sbPorcentagem.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                if(etValorConta.getText().toString().isEmpty()) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Preencha o campo vazio!!", Toast.LENGTH_SHORT);
                    toast.show();
                }else{
                    txtPorcentagem.setText(+i + "%");
                    aux = txtPorcentagem.getText().toString();
                    aux = aux.substring(0, aux.length() - 1);//remove "%" ou ultimo caractere
                    gorjeta = (Double.parseDouble(etValorConta.getText().toString()) * (Double.parseDouble(aux) / 100));
                    gorjeta = ((gorjeta * 100) / 100);
                    dinheiro = (Double.parseDouble(etValorConta.getText().toString()) + gorjeta);
                    txtGorjeta.setText(" " + gorjeta.toString());
                    txtTotal.setText(" " + dinheiro.toString());
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
}
