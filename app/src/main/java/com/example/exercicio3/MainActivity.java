package com.example.exercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText editTextValor1;
    private EditText editTextValor2;
    private TextView textViewResultadoFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextValor1 = findViewById(R.id.editTextValor1);
        editTextValor2 = findViewById(R.id.editTextValor2);
        textViewResultadoFinal = findViewById(R.id.textViewResultadoFinal);
    }

    public void calcularSoma(View view){
        Double valor1 = Double.parseDouble(editTextValor1.getText().toString());
        Double valor2 = Double.parseDouble(editTextValor2.getText().toString());

        Double soma = valor1 + valor2;
        textViewResultadoFinal.setText(soma.toString());
    }

    public void calcularSubtracao(View view){
        Double valor1 = Double.parseDouble(editTextValor1.getText().toString());
        Double valor2 = Double.parseDouble(editTextValor2.getText().toString());

        Double subtracao = valor1 - valor2;
        textViewResultadoFinal.setText(subtracao.toString());
    }

}