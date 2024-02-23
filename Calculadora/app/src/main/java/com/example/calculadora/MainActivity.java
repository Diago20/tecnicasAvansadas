package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    double firstNum;
    String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button num0 = findViewById(R.id.num0);
        Button num1 = findViewById(R.id.num1);
        Button num2 = findViewById(R.id.num2);
        Button num3 = findViewById(R.id.num3);
        Button num4 = findViewById(R.id.num4);
        Button num5 = findViewById(R.id.num5);
        Button num6 = findViewById(R.id.num6);
        Button num7 = findViewById(R.id.num7);
        Button num8 = findViewById(R.id.num8);
        Button num9 = findViewById(R.id.num9);

        Button ser = findViewById(R.id.ser);
        Button F = findViewById(R.id.F);
        Button ac = findViewById(R.id.ac);
        Button del = findViewById(R.id.del);
        Button div = findViewById(R.id.div);
        Button times = findViewById(R.id.times);
        Button min = findViewById(R.id.min);
        Button equal = findViewById(R.id.equal);
        Button plus = findViewById(R.id.plus);
        Button point = findViewById(R.id.point);
        Button siguiente = findViewById(R.id.siguiente);
        Button anterior = findViewById(R.id.anterior);
        Button btimc = findViewById(R.id.btimc);
        Button btarea = findViewById(R.id.btarea);

        TextView screen = findViewById(R.id.screen);

        ac.setOnClickListener(view -> {
            firstNum = 0;
            screen.setText("0");
        });

        /*off.setOnClickListener(view -> screen.setVisibility(View.GONE));
        on.setOnClickListener(view -> {
            screen.setVisibility(View.VISIBLE);
            screen.setText("0");
        });*/

        ArrayList<Button> nums = new ArrayList<>();
        nums.add(num0);
        nums.add(num1);
        nums.add(num2);
        nums.add(num3);
        nums.add(num4);
        nums.add(num5);
        nums.add(num6);
        nums.add(num7);
        nums.add(num8);
        nums.add(num9);

        for (Button b : nums){
            b.setOnClickListener(view ->{
                if (!screen.getText().toString().equals("0")) {
                    screen.setText(screen.getText().toString() + b.getText().toString());
                }else{
                    screen.setText(b.getText().toString());
                }
            });
        }

        ArrayList<Button> opers = new ArrayList<>();
        opers.add(div);
        opers.add(times);
        opers.add(plus);
        opers.add(min);
        opers.add(ser);
        opers.add(siguiente);
        opers.add(anterior);
        opers.add(btimc);
        opers.add(btarea);
        opers.add(F);
        for (Button b : opers){
            b.setOnClickListener(view -> {
                firstNum = Double.parseDouble(screen.getText().toString());
                operation = b.getText().toString();
                screen.setText("0");
            });
        }

        del.setOnClickListener(view->{
            String num = screen.getText().toString();
            if(num.length()>1){
                screen.setText(num.substring(0, num.length()-1));
            }else if (num.length() == 1 && !num.equals("0")){
            screen.setText("0");
            }
        });

        point.setOnClickListener(view -> {
            if(!screen.getText().toString().contains(".")){
                screen.setText(screen.getText().toString()+".");
            }
        });

        equal.setOnClickListener(view -> {
            double secondNum = Double.parseDouble(screen.getText().toString());
            double result;
            switch (operation) {

                    case"F":
                        StringBuilder sequence = new StringBuilder();
                        int prev = 0;
                        int current = 1;
                        int num = (int) firstNum;
                        for(int i=0; i < num; i ++){
                            int next = prev + current;
                            prev = current;
                            current = next;

                        }
                        result = prev;
                    break;
                    case "!":
                        double serial = 1;
                        for (int i = 1; i <= firstNum; i++) {
                            serial = serial * i;
                        }
                        result = serial;
                        break;
                    case "/":
                        result = firstNum / secondNum;
                        break;
                    case "X":
                        result = firstNum * secondNum;
                        break;
                    case "-":
                        result = firstNum - secondNum;
                        break;
                    default:
                        result = firstNum + secondNum;
                }
                screen.setText(String.valueOf(result));
                firstNum = result;
        });
        anterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, area.class);
                startActivity(intent);
            }
        });

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, peso.class); // Reemplaza OtraActivity con la actividad que deseas abrir
                startActivity(intent);
            }
        });

        btimc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, peso.class);
                startActivity(intent);
            }
        });

        btarea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, area.class);
                startActivity(intent);
            }
        });

    }
}