package com.example.tp_n1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio1Activity extends AppCompatActivity {

    private EditText primerNumero;
    private EditText segundoNumero;
    private TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        
        primerNumero = (EditText) findViewById(R.id.editText_PrimerNumero);
        segundoNumero = (EditText) findViewById(R.id.editText_SegundoNumero);
        Resultado = (TextView) findViewById(R.id.textView_Resultado);
    }

    public void sumar(View view){

        if(primerNumero.getText().length() > 0  && segundoNumero.getText().length() > 0) {
            if (primerNumero.getText().length() < 11 && segundoNumero.getText().length() < 11) {
                int valor1 = Integer.parseInt(primerNumero.getText().toString());
                int valor2 = Integer.parseInt(segundoNumero.getText().toString());


                int suma = valor1 + valor2;

                Resultado.setText(String.valueOf(suma));
            } else {
                Resultado.setText(String.valueOf("El numero debe contener menos de 10 digitos"));
            }
        }
        else
        {
            Resultado.setText(String.valueOf("El numero debe contener al menos 1 digito"));
        }

    }
}
