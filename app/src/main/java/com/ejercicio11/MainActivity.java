package com.ejercicio11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextN1, editTextN2;
    Button botonSumar, botonRestar,botonMultiplicar, botonDividir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inicializamos las variables
        editTextN1 = (EditText) findViewById(R.id.txtnumerouno);
        editTextN2 = (EditText) findViewById(R.id.txtnumerodos);

        botonSumar = (Button) findViewById(R.id.btnsuma);
        botonRestar = (Button) findViewById(R.id.btnresta);
        botonMultiplicar = (Button) findViewById(R.id.btnmultiplicacion);
        botonDividir = (Button) findViewById(R.id.btndivision);

        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1,numero2,resultado;
                numero1=Double.valueOf(editTextN1.getText().toString());
                numero2=Double.valueOf(editTextN2.getText().toString());
                resultado=numero1+numero2;
                Intent intent = new Intent(getApplicationContext(),MainActivityResultado.class);
                intent.putExtra("resultado","Total de la suma: "+resultado);

            }
        });

        botonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1,numero2,resultado;
                numero1=Double.valueOf(editTextN1.getText().toString());
                numero2=Double.valueOf(editTextN2.getText().toString());
                resultado=numero1-numero2;
                Intent intent = new Intent(getApplicationContext(),MainActivityResultado.class);
                intent.putExtra("resultado","Total de la resta: "+resultado);

            }
        });

        botonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1,numero2,resultado;
                numero1=Double.valueOf(editTextN1.getText().toString());
                numero2=Double.valueOf(editTextN2.getText().toString());
                resultado=numero1/numero2;
                Intent intent = new Intent(getApplicationContext(),MainActivityResultado.class);
                intent.putExtra("resultado","Total de la division: "+resultado);
            }
        });

        botonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1,numero2,resultado;
                numero1=Double.valueOf(editTextN1.getText().toString());
                numero2=Double.valueOf(editTextN2.getText().toString());
                resultado=numero1*numero2;
                Intent intent = new Intent(getApplicationContext(),MainActivityResultado.class);
                intent.putExtra("resultado","Total de la multiplicacion: "+resultado);
            }

        });
    }
}