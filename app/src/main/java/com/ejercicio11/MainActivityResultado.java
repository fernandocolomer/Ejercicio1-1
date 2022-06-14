package com.ejercicio11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivityResultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_resultado);


        TextView resultado = (TextView) findViewById(R.id.textViewResultado);
        resultado.setText("");
        resultado.setText(getIntent().getStringExtra("resultado").toString());

    }
}