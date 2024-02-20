package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class areaCirculo extends AppCompatActivity {
    EditText etRadio,etResultado;
    Button btCalcular,btVolver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_circulo);

        etRadio=findViewById(R.id.etRadio);
        etResultado=findViewById(R.id.etResultado);
        btCalcular=findViewById(R.id.btCalcular);
        btVolver=findViewById(R.id.btVolver);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularAreaCirculo();
            }
        });

        btVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(areaCirculo.this,area.class);
                startActivity(intent);
            }
        });


    }

    public void calcularAreaCirculo(){
        if (etRadio.getText().toString().isEmpty()){
            Toast.makeText(this, "Por favor ingresar el valor del radio", Toast.LENGTH_SHORT).show();
        }try {
            double radio = Double.parseDouble(etRadio.getText().toString());
            double area = ((radio * radio) * 3.14);
            etResultado.setText(String.valueOf(area));
        }catch (NumberFormatException e){
            Toast.makeText(this,"El valor ingresado no es el correcto",Toast.LENGTH_LONG).show();
        }
    }
}