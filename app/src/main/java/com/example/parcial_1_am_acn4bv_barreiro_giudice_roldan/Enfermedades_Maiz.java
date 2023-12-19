package com.example.parcial_1_am_acn4bv_barreiro_giudice_roldan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Enfermedades_Maiz extends AppCompatActivity {
    public Button btnAmain;
    public Button btnAuva;

    // Declaro como privados los atributos
    private Button cuarto,carbon,blanca,nitrogeno,roya, panojaloca;


    // Decoradores
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_enfermedades_maiz);

        cuarto= findViewById (R.id.btnRioCuarto);
        carbon= findViewById (R.id.btnCarbon);
        blanca= findViewById (R.id.btnManchaBlanca);
        nitrogeno=findViewById (R.id.btnNitrogeno);
        roya= findViewById (R.id.btnRoya);
        panojaloca=findViewById(R.id.btnpanojaloca);
        cuarto.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse ("https://herbariofitopatologia.agro.uba.ar/?page_id=136"));
                startActivity (intent);
            }
        });

        panojaloca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://herbariofitopatologia.agro.uba.ar/?page_id=5267"));
                startActivity(intent);
            }
        });
        carbon.setOnClickListener (new View.OnClickListener () {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Intent.ACTION_VIEW,
                        Uri.parse("https://herbariofitopatologia.agro.uba.ar/?page_id=119"));
                startActivity(intent);
            }
        });
        blanca.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Intent.ACTION_VIEW,
                        Uri.parse ("https://herbariofitopatologia.agro.uba.ar/?page_id=3877"));
                startActivity (intent);
            }
        });

        nitrogeno.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse ("https://herbariofitopatologia.agro.uba.ar/?page_id=19168"));
                startActivity (intent);
            }
        });

        roya.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Intent.ACTION_VIEW,
                        Uri.parse (" https://herbariofitopatologia.agro.uba.ar/?page_id=162"));
                startActivity (intent);
            }
        });

        btnAmain= findViewById (R.id.btnAmain);
        btnAuva = findViewById(R.id.btnAuva);

        btnAmain.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent (getApplicationContext() ,MainActivity.class);
                startActivity (intent);
            }
        });

        btnAuva.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent (getApplicationContext (), Enfermedades_Uva.class);
                startActivity (intent);

            }
        });
    }
}