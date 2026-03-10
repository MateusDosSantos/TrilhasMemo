package com.example.projetotrilhas;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Tela03 extends AppCompatActivity {
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela03);

        texto = findViewById(R.id.textView3);
        Intent i = new Intent();
        i = getIntent();
        if(i != null){
            //significa que não veio corrompido
            Bundle caixa = new Bundle();
            caixa = i.getExtras();
            if(caixa != null){
                //significa que a caixa não veio corrompida
                String x = caixa.getString("nome");
                texto.setText(x);
            }
        }

    }
}