package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    EditText num1, num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.numero1);
        num2 = (EditText) findViewById(R.id.numero2);

    }
    public void suma(View view){
        int res  =0;
        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();
        if(n1.isEmpty() || n2.isEmpty()) {
            num1.setError("Ingrese datos");
            num2.setError("Ingrese datos");
        }
        else{

            int  ent1 = Integer.valueOf(n1);
            int    ent2 = Integer.valueOf(n2);
            res = ent1+ent2;
            Toast.makeText(this,"La suma es:"+ res,Toast.LENGTH_SHORT).show();
        }
    }
    public void resta(View view){
        int res  =0;
        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();
        if(n1.isEmpty() || n2.isEmpty()) {
            num1.setError("Ingrese datos");
            num2.setError("Ingrese datos");
        }
        else{

            int  ent1 = Integer.valueOf(n1);
            int    ent2 = Integer.valueOf(n2);
            res = ent1-ent2;
            Toast.makeText(this,"La resta es:"+ res,Toast.LENGTH_SHORT).show();
        }
    }
    public void multi(View view){
        int res  =0;
        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();
        if(n1.isEmpty() || n2.isEmpty()) {
            num1.setError("Ingrese datos");
            num2.setError("Ingrese datos");
        }
        else{

            int  ent1 = Integer.valueOf(n1);
            int    ent2 = Integer.valueOf(n2);
            res = ent1*ent2;
            Toast.makeText(this,"La multiplicacion es:"+ res,Toast.LENGTH_SHORT).show();
        }
    }
    public void divicion(View view){
        int res  =0;
        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();
        if(n1.isEmpty() || n2.isEmpty()) {
            num1.setError("Ingrese datos");
            num2.setError("Ingrese datos");
        }
        else{

            int  ent1 = Integer.valueOf(n1);
            int    ent2 = Integer.valueOf(n2);
            res = ent1/ent2;
            Toast.makeText(this,"La divicion es:"+ res,Toast.LENGTH_SHORT).show();
        }
    }
    public void limpiar(View view){
        int res  =0;
        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();
        if(n1.isEmpty() && n2.isEmpty()) {
            Toast.makeText(this,"La casillas estan vacias, ingrese datos",Toast.LENGTH_SHORT).show();

        }
        else{
          num1.setText("");
          num2.setText("");
            Toast.makeText(this,"La casillas estan limpias",Toast.LENGTH_SHORT).show();
        }
    }

}
