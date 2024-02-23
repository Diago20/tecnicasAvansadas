package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class peso extends AppCompatActivity {
    public TextView etPeso, etAltura, tvResultado;
    public CheckBox cbFemenino, cbMasculino;
    public Button btIMC, btPesoIdeal, btBorrar,btCalculadora,btCalcularArea;
    double pi = 0, piup = 0, pidown = 0, f1 = 2.25, f2 = 45, m1 = 2.7, m2 = 47.75;
    boolean bandera = true;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso);

        etPeso =findViewById(R.id.etPeso);
        etAltura =findViewById(R.id.etBase);
        tvResultado =findViewById(R.id.tvResultado);
        cbFemenino =findViewById(R.id.cbFemenino);
        cbMasculino =findViewById(R.id.cbMasculino);
        btIMC =findViewById(R.id.btIMC);
        btPesoIdeal =findViewById(R.id.btPesoIdeal);
        btBorrar =findViewById(R.id.btBorrar);
        btCalculadora =findViewById(R.id.btCalculadora);
        btCalcularArea =findViewById(R.id.btCalcularIMC);

        btCalcularArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(peso.this, area.class);
                startActivity(intent);
            }
        });
        btCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(peso.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void imc(View view) {
        if (etPeso.getText().toString().trim().length() == 0) {
            Toast.makeText(this, "Favor Ingresar el peso. ", Toast.LENGTH_LONG).show();
            etPeso.requestFocus();
        } else if (etAltura.getText().toString().trim().length() == 0) {
            Toast.makeText(this, "Favor ingresar la estatura. ", Toast.LENGTH_LONG).show();
            etAltura.requestFocus();
        } else {
            float kg = Float.parseFloat(etPeso.getText().toString());
            float m = Float.parseFloat(etAltura.getText().toString());
            float bmi = (kg / (m * m));

            if (bmi < 18.0 && bmi > 0) {
                Toast.makeText(this, "Tu IMC es: " + bmi + "\nBajo peso", Toast.LENGTH_LONG).show();
            } else if (bmi < 24.9) {
                Toast.makeText(this, "Tu IMC es: " + bmi + "\nPeso normal", Toast.LENGTH_LONG).show();
            } else if (bmi < 29.9) {
                Toast.makeText(this, "Tu IMC es: " + bmi + "\nSobrepeso", Toast.LENGTH_LONG).show();
            } else if (bmi < 34.9) {
                Toast.makeText(this, "Tu IMC es: " + bmi + "\nObesidad", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Tu IMC es: " + bmi + "\nMuy obeso", Toast.LENGTH_LONG).show();
            }

            tvResultado.setText(String.valueOf(bmi));

        }
    }
    public void borrar(View view){
        etPeso.setText("");
        etAltura.setText("");
        tvResultado.setText("");
        pi=0;
        piup=0;
        pidown=0;
        cbFemenino.setEnabled(true);
        cbMasculino.setEnabled(true);
        cbFemenino.setChecked(false);
        cbMasculino.setChecked(false);
        bandera=true;
    }


    public void setBtPesoIdeal(View view){
        float kg= Float.parseFloat(etPeso.getText().toString());
        float m = Float.parseFloat(etAltura.getText().toString());

        if(etPeso.getText().toString().trim().length()==0){
            etPeso.requestFocus();
            Toast.makeText(this,"Favor ingresar el peso.",Toast.LENGTH_LONG).show();
            bandera=false;
        } else if (etAltura.getText().toString().trim().length()==0) {
            etAltura.requestFocus();
            Toast.makeText(this,"Favor ingresar la altura.",Toast.LENGTH_LONG).show();
            bandera=false;
        } else if(cbMasculino.isChecked()==false && cbFemenino.isChecked()==false){
            Toast.makeText(this,"Favor de seleccionar un genero.",Toast.LENGTH_LONG).show();
            bandera=false;
        }
        if (cbFemenino.isChecked()==true){
            cbMasculino.setEnabled(false);
            pi=((((100*m)-152.4)/2.54)*f1)+f2;
        }else if (cbMasculino.isChecked()==true){
            cbFemenino.setEnabled(false);
            pi=((((100*m)-152.4)/2.54)*m1)+m2;
        }
        if (bandera){
            piup=(pi*0.10)+pi;
            Toast.makeText(this,"Resultado del peso ideal"+pi+"\n",Toast.LENGTH_LONG).show();
            tvResultado.setText(String.valueOf((pi)));
            pidown=(pi-(pi*0.10));

            if(kg>piup){
                Toast.makeText(this,"Estas arriba de tu peso Ideal",Toast.LENGTH_LONG).show();
            } else if (kg<=piup && kg>= pidown) {
                Toast.makeText(this,"Estas en tu peso Ideal",Toast.LENGTH_LONG).show();
            } else if (kg<pidown) {
                Toast.makeText(this,"Estas abajo de tu peso Ideal",Toast.LENGTH_LONG).show();
            }
        }

    }
    public void onCheckboxClickedfem(View view){
        cbFemenino.setChecked(true);
        cbMasculino.setChecked(false);
        Toast.makeText(this,"Femenino",Toast.LENGTH_LONG).show();
    }
    public void onCheckboxClickedmas(View view){
        cbFemenino.setChecked(false);
        cbMasculino.setChecked(true);
        Toast.makeText(this,"Masculino",Toast.LENGTH_LONG).show();
    }
}
