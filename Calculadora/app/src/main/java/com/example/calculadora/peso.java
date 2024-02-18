package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class peso extends AppCompatActivity {
    private TextView etPeso, etAltura, etResultado;
    private CheckBox cbFemenino, cbMasculino;
    private Button btIMC, btPesoIdeal, btBorrar;
    double pi = 0, piup = 0, pidown = 0, f1 = 2.25, f2 = 45, m1 = 2.7, m2 = 47.75;
    boolean bandera = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso);

        etPeso = (EditText) findViewById(R.id.etPeso);
        etAltura = (EditText) findViewById(R.id.etAltura);
        etResultado = (EditText) findViewById(R.id.etResultado);
        cbFemenino = (CheckBox) findViewById(R.id.cbFemenino);
        cbMasculino = (CheckBox) findViewById(R.id.cbMasculino);
        btIMC = (Button) findViewById(R.id.btIMC);
        btPesoIdeal = (Button) findViewById(R.id.btPesoIdeal);
        btBorrar = (Button) findViewById(R.id.btBorrar);
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

            etResultado.setText(String.valueOf(bmi));

        }
    }
    public void borrar(View view){
        etPeso.setText("");
        etAltura.setText("");
        etResultado.setText("");
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
            etResultado.setText(String.valueOf((pi)));
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
