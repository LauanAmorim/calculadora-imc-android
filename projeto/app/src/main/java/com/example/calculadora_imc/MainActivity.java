package com.example.calculadora_imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editPeso, editAltura;
    TextView resultado, resultadoEx;
    RadioButton sexoM, sexoF;
    double peso = 0.0;
    double altura = 0.0;
    boolean sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editPeso = findViewById(R.id.txtPeso);
        editAltura = findViewById(R.id.txtAltura);
        resultado = findViewById(R.id.txtViewResult);
        resultadoEx = findViewById(R.id.txtResultEx);
        sexoM = findViewById(R.id.btnMasc);
        sexoF = findViewById(R.id.btnFem);
    }

    public void CalcularIMC(View view) {
        peso = Double.parseDouble(editPeso.getText().toString());
        altura = Double.parseDouble(editAltura.getText().toString());

        double result = peso/(altura*altura);
        resultado.setText(Double.valueOf(result).toString());
        if (sexoM.isChecked()) {
            if(result < 20){
                resultadoEx.setText("Abaixo do normal");
            } else if(result >= 20 && result <= 24.9) {
                resultadoEx.setText("Normal");
            } else if(result >= 25 && result <= 29.9){
                resultadoEx.setText("Obesidade leve");
            } else if(result >= 30 && result <= 39.9) {
                resultadoEx.setText("Obesidade Moderada");
            } else if(result >= 43) {
                resultadoEx.setText("Obesidade Mórbida");
            }
        } else if(sexoM.isChecked() == false && sexoF.isChecked() == true) {
            if(result < 19){
                resultadoEx.setText("Abaixo do normal");
            } else if(result >= 19 && result <= 23.9) {
                resultadoEx.setText("Normal");
            } else if(result >= 24 && result <= 28.9){
                resultadoEx.setText("Obesidade leve");
            } else if(result >= 29 && result <= 38.9) {
                resultadoEx.setText("Obesidade Moderada");
            } else if(result >= 39) {
                resultadoEx.setText("Obesidade Mórbida");
            }

        }
    }
}
