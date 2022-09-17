package com.example.noticias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkEconomia, checkEsporte, checkLazer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkEconomia = findViewById(R.id.checkEconomia);
        checkEsporte = findViewById(R.id.checkEsporte);
        checkLazer = findViewById(R.id.checkLazer);



    }

    public void checkbox(){

        
    }
    public void enviar(View view){
        checkbox();
    }
}
