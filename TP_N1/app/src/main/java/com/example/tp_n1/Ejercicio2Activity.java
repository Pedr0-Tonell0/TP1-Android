package com.example.tp_n1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ejercicio2Activity extends AppCompatActivity {

    TextView pantalla;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacion = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        pantalla = (TextView) findViewById(R.id.textView_Pantalla);

    }

    public void escribirUno (View view){
        Float valor = Float.parseFloat(pantalla.getText().toString());

        if(pantalla.getText().length() <11 )
        {
            if( valor == 0.0f )
            {
                pantalla.setText("1");
            }
            else
            {
                pantalla.setText(pantalla.getText() + "1");
            }
        }
    }

    public void escribirDos (View view){
        Float valor = Float.parseFloat(pantalla.getText().toString());
        if(pantalla.getText().length() <11 ) {
            if (valor == 0.0f) {
                pantalla.setText("2");
            } else {
                pantalla.setText(pantalla.getText() + "2");
            }
        }
    }

    public void escribirTres (View view){
        Float valor = Float.parseFloat(pantalla.getText().toString());
        if(pantalla.getText().length() <11 ) {

            if (valor == 0.0f) {
                pantalla.setText("3");
            } else {
                pantalla.setText(pantalla.getText() + "3");
            }
        }
    }

    public void escribirCuatro (View view){
        Float valor = Float.parseFloat(pantalla.getText().toString());
        if(pantalla.getText().length() <11 ) {

            if (valor == 0.0f) {
                pantalla.setText("4");
            } else {
                pantalla.setText(pantalla.getText() + "4");
            }
        }
    }

    public void escribirCinco (View view){
        Float valor = Float.parseFloat(pantalla.getText().toString());
        if(pantalla.getText().length() <11 ) {

            if (valor == 0.0f) {
                pantalla.setText("5");
            } else {
                pantalla.setText(pantalla.getText() + "6");
            }
        }
    }

    public void escribirSeis (View view){
        Float valor = Float.parseFloat(pantalla.getText().toString());
        if(pantalla.getText().length() <11 ) {

            if (valor == 0.0f) {
                pantalla.setText("6");
            } else {
                pantalla.setText(pantalla.getText() + "6");
            }
        }
    }

    public void escribirSiete (View view){
        Float valor = Float.parseFloat(pantalla.getText().toString());
        if(pantalla.getText().length() <11 ) {

            if (valor == 0.0f) {
                pantalla.setText("7");
            } else {
                pantalla.setText(pantalla.getText() + "7");
            }
        }
    }

    public void escribirOcho (View view){
        Float valor = Float.parseFloat(pantalla.getText().toString());
        if(pantalla.getText().length() <11 ) {

            if (valor == 0.0f) {
                pantalla.setText("8");
            } else {
                pantalla.setText(pantalla.getText() + "8");
            }
        }
    }

    public void escribirNueve (View view){
        Float valor = Float.parseFloat(pantalla.getText().toString());
        if(pantalla.getText().length() <11 ) {

            if (valor == 0.0f) {
                pantalla.setText("9");
            } else {
                pantalla.setText(pantalla.getText() + "9");
            }
        }
    }

    public void escribirCero (View view){
        Float valor = Float.parseFloat(pantalla.getText().toString());
        if(pantalla.getText().length() <11 ) {

            if (valor == 0.0f) {
                pantalla.setText("0");
            } else {
                pantalla.setText(pantalla.getText() + "0");
            }
        }
    }

    public void borrarPantalla (View view){
      pantalla.setText("0");
      numero1 = 0.0f;
      numero2 = 0.0f;
      operacion = "";
    }

    public void sumar(View view){
        numero1 = Float.parseFloat(pantalla.getText().toString());
        pantalla.setText("0");
        operacion = "+";
    }
    public void restar(View view){
        numero1 = Float.parseFloat(pantalla.getText().toString());
        pantalla.setText("0");
        operacion = "-";

    }
    public void dividir(View view){
        numero1 = Float.parseFloat(pantalla.getText().toString());
        pantalla.setText("0");
        operacion = "/";
    }
    public void multiplicar(View view){
        numero1 = Float.parseFloat(pantalla.getText().toString());
        pantalla.setText("0");
        operacion = "*";
    }
    public void realizarOperacion(View view){
        float ResultadoFinal=0.0f;
        numero2 = Float.parseFloat(pantalla.getText().toString());
        float num1 = numero1;
        if(operacion.equals("+")){
            ResultadoFinal = num1 + numero2;
            pantalla.setText(ResultadoFinal+"");
        }
        if(operacion.equals("-")){
            ResultadoFinal = num1 - numero2;
            pantalla.setText(ResultadoFinal+"");
        }
        if(operacion.equals("*")){
            ResultadoFinal = num1 * numero2;
            pantalla.setText(ResultadoFinal+"");
        }
        if(operacion.equals("/")){
            ResultadoFinal = num1 / numero2;
            pantalla.setText(ResultadoFinal+"");
        }

    }
}