package com.example.exercice_calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nb1,nb2,resultat;
    Button res,reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nb1=findViewById(R.id.nb1);
        nb2=findViewById(R.id.nb2);
        resultat=findViewById(R.id.result);
        reset=findViewById(R.id.reset);
        res=findViewById(R.id.somme);
        reset.setOnClickListener(view -> {
            nb1.setText("");
            nb2.setText("");
            resultat.setText("");
        });
        res.setOnClickListener(view -> {
            int op1= Integer.parseInt(nb1.getText().toString());
            int op2=Integer.parseInt(nb2.getText().toString());
            resultat.setText(String.valueOf(op1+op2));
        });
    }
}