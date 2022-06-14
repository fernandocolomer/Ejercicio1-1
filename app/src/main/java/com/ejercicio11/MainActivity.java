package com.ejercicio11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextuno, editTextdos;
    Button botonSumar, botonRestar,botonMultiplicar, botonDividir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextuno = (EditText) findViewById(R.id.txtnumerouno);
        editTextdos = (EditText) findViewById(R.id.txtnumerodos);

        botonSumar = (Button) findViewById(R.id.btnsuma);
        botonRestar = (Button) findViewById(R.id.btnresta);
        botonMultiplicar = (Button) findViewById(R.id.btnmultiplicacion);
        botonDividir = (Button) findViewById(R.id.btndivision);

        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1,numero2,resultado;
                numero1=Double.valueOf(editTextuno.getText().toString());
                numero2=Double.valueOf(editTextdos.getText().toString());
                resultado=numero1+numero2;
                Intent intent = new Intent(getApplicationContext(),MainActivityResultado.class);
                intent.putExtra("resultado","Total de la suma: "+resultado);

            }
        });

        botonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1,numero2,resultado;
                numero1=Double.valueOf(editTextuno.getText().toString());
                numero2=Double.valueOf(editTextdos.getText().toString());
                resultado=numero1-numero2;
                Intent intent = new Intent(getApplicationContext(),MainActivityResultado.class);
                intent.putExtra("resultado","Total de la resta: "+resultado);

            }
        });

        botonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1,numero2,resultado;
                numero1=Double.valueOf(editTextuno.getText().toString());
                numero2=Double.valueOf(editTextdos.getText().toString());
                resultado=numero1/numero2;
                Intent intent = new Intent(getApplicationContext(),MainActivityResultado.class);
                intent.putExtra("resultado","Total de la division: "+resultado);
            }
        });

        botonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1,numero2,resultado;
                numero1=Double.valueOf(editTextuno.getText().toString());
                numero2=Double.valueOf(editTextdos.getText().toString());
                resultado=numero1*numero2;
                Intent intent = new Intent(getApplicationContext(),MainActivityResultado.class);
                intent.putExtra("resultado","Total de la multiplicacion: "+resultado);
            }

        });
    }
}