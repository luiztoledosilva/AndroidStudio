package com.example.javavariaveis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String nome="Luiz";
        int x=10;
        double y=1.5;
        int idade=18;
        System.out.println("Idade do aluno: " +idade);
        System.out.println("Troco: " +y);
        System.out.println("Meu nome é: "+nome);
        
    }

}