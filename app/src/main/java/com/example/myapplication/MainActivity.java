package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity{
        Button btn0,btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8,btn9, btnresultado, btnborrar;
    TextView txt1;
    double res;
    String operacion, mostrar , reserva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = findViewById(R.id.button0);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button8);
        btnresultado = findViewById(R.id.buttonresultado);
        btnborrar = findViewById(R.id.buttonborrar);

        txt1 = findViewById(R.id.textView1);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = txt1.getText().toString();
                mostrar = mostrar + "0";
                txt1.setText(mostrar);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = txt1.getText().toString();
                mostrar = mostrar + "1";
                txt1.setText(mostrar);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = txt1.getText().toString();
                mostrar = mostrar + "2";
                txt1.setText(mostrar);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = txt1.getText().toString();
                mostrar = mostrar + "3";
                txt1.setText(mostrar);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = txt1.getText().toString();
                mostrar = mostrar + "4";
                txt1.setText(mostrar);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = txt1.getText().toString();
                mostrar = mostrar + "5";
                txt1.setText(mostrar);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = txt1.getText().toString();
                mostrar = mostrar + "6";
                txt1.setText(mostrar);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = txt1.getText().toString();
                mostrar = mostrar + "7";
                txt1.setText(mostrar);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = txt1.getText().toString();
                mostrar = mostrar + "8";
                txt1.setText(mostrar);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = txt1.getText().toString();
                mostrar = mostrar + "9";
                txt1.setText(mostrar);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = txt1.getText().toString();
                mostrar = mostrar + "9";
                txt1.setText(mostrar);
            }
        });
        btnresultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mostrar.isEmpty()){
                    Toast.makeText(getApplicationContext(),"No existe texto que borar",Toast.LENGTH_SHORT);
                }
                else{

                mostrar = txt1.getText().toString();
                mostrar = mostrar + "1";
                if(operacion.equals("-")){
                    res = Double.parseDouble(reserva) - Double.parseDouble(txt1.getText().toString());
                    txt1.setText(String.valueOf(res));
                }
                if(operacion.equals("+")){
                    res = Double.parseDouble(reserva) + Double.parseDouble(txt1.getText().toString());
                    txt1.setText(String.valueOf(res));
                }
                if(operacion.equals("/")){
                    res = Double.parseDouble(reserva) / Double.parseDouble(txt1.getText().toString());
                    txt1.setText(String.valueOf(res));
                }
                if(operacion.equals("*")){
                    res = Double.parseDouble(reserva) * Double.parseDouble(txt1.getText().toString());
                    txt1.setText(String.valueOf(res));
                }
            }}
        });
        btnborrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mostrar.isEmpty()){
                    Toast.makeText(getApplicationContext(),"No existe texto que borar",Toast.LENGTH_SHORT);
                }
                else{
                    mostrar = txt1.getText().toString();
                    mostrar = mostrar.substring(0,mostrar.length()-1);
                    txt1.setText(mostrar);
                }
            }
        });

    }


    public void division(View view) {
        reserva = txt1.getText().toString();
        operacion = "/";
        txt1.setText("");
    }

    public void resta(View view) {
        reserva = txt1.getText().toString();
        operacion = "-";
        txt1.setText("");
    }

    public void multiplicar(View view) {
        reserva = txt1.getText().toString();
        operacion = "*";
        txt1.setText("");
    }

    public void suma(View view) {
        reserva = txt1.getText().toString();
        operacion = "+";
        txt1.setText("");
    }


    public void clear(View view) {
        txt1.setText("");
    }


    }




