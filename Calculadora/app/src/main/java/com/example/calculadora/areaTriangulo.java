package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class areaTriangulo extends AppCompatActivity {
    EditText etBase,etAltura,etResultado;
    Button btCalcular,btVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_triangulo);
        etBase=findViewById(R.id.etBase);
        etAltura=findViewById(R.id.etAltura);
        etResultado=findViewById(R.id.etResultado);
        btCalcular=findViewById(R.id.btCalcular);
        btVolver=findViewById(R.id.btVolver);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularAreaTriangulo();
            }
        });
        btVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(areaTriangulo.this,area.class);
                startActivity(intent);
            }
        });
    }
    public void calcularAreaTriangulo(){
        if (etBase.getText().toString().isEmpty() || etAltura.getText().toString().isEmpty()){
            Toast.makeText(this, "Por favor ingresar el valor adecuado.", Toast.LENGTH_SHORT).show();
        }try {
            double base = Double.parseDouble(etBase.getText().toString());
            double altura = Double.parseDouble(etAltura.getText().toString());
            double resultado= base*altura;
            etResultado.setText(String.valueOf(resultado));
        }catch (NumberFormatException e){
            Toast.makeText(this, "El valor ingresado no es el correcto.", Toast.LENGTH_SHORT).show();
        }
    }
}