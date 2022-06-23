package com.example.calculadora_imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editPeso, editAltura;
    TextView resultado;
    double peso = 0.0;
    double altura = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editPeso = findViewById(R.id.txtPeso);
        editAltura = findViewById(R.id.txtAltura);
        resultado = findViewById(R.id.txtViewResult);
    }

    public void CalcularIMC(View view) {
        peso = Double.parseDouble(editPeso.getText().toString());
        altura = Double.parseDouble(editAltura.getText().toString());

        double result = peso/(altura*altura);

        resultado.setText(Double.valueOf(result).toString());
    }
}