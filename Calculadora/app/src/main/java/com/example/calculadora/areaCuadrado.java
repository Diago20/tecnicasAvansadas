package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class areaCuadrado extends AppCompatActivity {

    EditText etAltura,etResultado;
    Button btCalcular, btVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_cuadrado);

        etAltura = findViewById(R.id.etAltura);
        etResultado = findViewById(R.id.etResultado);
        btCalcular = findViewById(R.id.btCalcular);
        btVolver = findViewById(R.id.btVolver);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularAreaCuadrado();
            }
        });
        btVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(areaCuadrado.this,area.class);
                startActivity(intent);
            }
        });
    }

        public void calcularAreaCuadrado(){
            if (etAltura.getText().toString().isEmpty()){
                Toast.makeText(this,"Por favor ingresal valor del lado.",Toast.LENGTH_LONG).show();
            }
            try {
                double lado = Double.parseDouble(etAltura.getText().toString());
                double area = lado * lado;
                etResultado.setText(String.valueOf(area));
            }catch (NumberFormatException e) {
                Toast.makeText(this, "El valor ingresado no es válido", Toast.LENGTH_SHORT).show();
            }
        }
}