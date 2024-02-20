package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class area extends AppCompatActivity {

    RadioGroup rgContenedor;
    RadioButton rbCirculo,rbTriangulo,rbCuadrado,rbRectangulo;
    Button btSeleccionar,btCalculadora,btCalcularIMC;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        rgContenedor = findViewById(R.id.rgContenedor);
        rbCuadrado = findViewById(R.id.rbCuadrado);
        rbRectangulo = findViewById(R.id.rbRectangulo);
        rbTriangulo = findViewById(R.id.rbTriangulo);
        rbCirculo = findViewById(R.id.rbCirculo);
        btSeleccionar = findViewById(R.id.btSeleccionar);
        btCalculadora = findViewById(R.id.btCalculadora);
        btCalcularIMC = findViewById(R.id.btCalcularIMC);

        btCalcularIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(area.this, peso.class);
                startActivity(intent);
            }
        });
        btCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(area.this, MainActivity.class);
                startActivity(intent);
            }
        });

       btSeleccionar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int buttonID = rgContenedor.getCheckedRadioButtonId();
               if (buttonID == R.id.rbCuadrado) {
                   Intent cuadrado = new Intent(area.this, areaCuadrado.class);
                   startActivity(cuadrado);
               } else if (buttonID == R.id.rbRectangulo) {
                   Intent rectangulo = new Intent(area.this, areaRectangulo.class);
                   startActivity(rectangulo);
               } else if (buttonID == R.id.rbTriangulo) {
                   Intent triangulo = new Intent(area.this, areaTriangulo.class);
                   startActivity(triangulo);
               } else if (buttonID == R.id.rbCirculo) {
                       Intent ciruclo = new Intent(area.this, areaCirculo.class);
                       startActivity(ciruclo);
               }
           }
       });
    }
    public void onRadioButtonClickedCirculo(View view){
        rbCirculo.setChecked(true);
        rbTriangulo.setChecked(false);
        rbCuadrado.setChecked(false);
        rbRectangulo.setChecked(false);
        Toast.makeText(this,"Circulo",Toast.LENGTH_LONG).show();
    }
    public void onRadioButtonClickedCuadrado(View view){
        rbCirculo.setChecked(false);
        rbTriangulo.setChecked(false);
        rbCuadrado.setChecked(true);
        rbRectangulo.setChecked(false);
        Toast.makeText(this,"Circulo",Toast.LENGTH_LONG).show();
    }
    public void onRadioButtonClickedTriangulo(View view){
        rbCirculo.setChecked(false);
        rbTriangulo.setChecked(true);
        rbCuadrado.setChecked(false);
        rbRectangulo.setChecked(false);
        Toast.makeText(this,"Circulo",Toast.LENGTH_LONG).show();
    }
    public void onRadioButtonClickedRectangulo(View view){
        rbCirculo.setChecked(false);
        rbTriangulo.setChecked(false);
        rbCuadrado.setChecked(false);
        rbRectangulo.setChecked(true);
        Toast.makeText(this,"Circulo",Toast.LENGTH_LONG).show();
    }
}