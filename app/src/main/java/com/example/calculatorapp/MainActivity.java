package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView display;

    Button zero_btn;
    Button one_btn;
    Button two_btn;
    Button three_btn;
    Button four_btn;
    Button five_btn;
    Button six_btn;
    Button seven_btn;
    Button eight_btn;
    Button nine_btn;

    Button plus_btn;
    Button minus_btn;
    Button multiply_btn;
    Button divide_btn;
    Button equals_btn;
    Button clear_btn;


    CalculatorBrain calculatorBrain = new CalculatorBrain();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);

        zero_btn = findViewById(R.id.zero_btn);


        one_btn = findViewById(R.id.one_btn);
        two_btn = findViewById(R.id.two_btn);
        three_btn = findViewById(R.id.three_btn);
        four_btn = findViewById(R.id.four_btn);
        five_btn = findViewById(R.id.five_btn);
        six_btn = findViewById(R.id.six_btn);
        seven_btn = findViewById(R.id.seven_btn);
        eight_btn = findViewById(R.id.eight_btn);
        nine_btn = findViewById(R.id.nine_btn);
        plus_btn = findViewById(R.id.plus_btn);
        minus_btn = findViewById(R.id.minus_btn);
        multiply_btn = findViewById(R.id.multiply_btn);
        divide_btn = findViewById(R.id.divide_btn);
        equals_btn = findViewById(R.id.equals_btn);
        clear_btn = findViewById(R.id.clear_btn);

        zero_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorBrain.push("0");
                display.setText(calculatorBrain.toString());
            }
        });

        one_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorBrain.push("1");
                display.setText(calculatorBrain.toString());
            }
        });

        two_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorBrain.push("2");
                display.setText(calculatorBrain.toString());
            }
        });

        three_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorBrain.push("3");
                display.setText(calculatorBrain.toString());
            }
        });

        four_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorBrain.push("4");
                display.setText(calculatorBrain.toString());
            }
        });

        five_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorBrain.push("5");
                display.setText(calculatorBrain.toString());
            }
        });

        six_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorBrain.push("6");
                display.setText(calculatorBrain.toString());
            }
        });

        seven_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorBrain.push("7");
                display.setText(calculatorBrain.toString());
            }
        });

        eight_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorBrain.push("8");
                display.setText(calculatorBrain.toString());
            }
        });

        nine_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorBrain.push("9");
                display.setText(calculatorBrain.toString());
            }
        });

        plus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorBrain.push("+");
                display.setText(calculatorBrain.toString());
            }
        });

        minus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorBrain.push("-");
                display.setText(calculatorBrain.toString());
            }
        });

        multiply_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorBrain.push("*");
                display.setText(calculatorBrain.toString());
            }
        });

        divide_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorBrain.push("/");
                display.setText(calculatorBrain.toString());
            }
        });

        clear_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorBrain.reset();
                display.setText(calculatorBrain.toString());
            }
        });

        equals_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculatorBrain.validate()) {
                    calculatorBrain.calculate();
                    display.setText(calculatorBrain.totalnum());
                } else {
                    display.setText("Error");
                }
            }
        });
    }

}