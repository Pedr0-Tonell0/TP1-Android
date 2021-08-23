package com.example.tp_n1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void redirectEjercicio1 (View view){
        Intent siguiente = new Intent(this , Ejercicio1Activity.class);
        startActivity(siguiente);
    }
    public void redirectEjercicio2 (View view){
        Intent siguiente = new Intent(this , Ejercicio2Activity.class);
        startActivity(siguiente);

    }
}