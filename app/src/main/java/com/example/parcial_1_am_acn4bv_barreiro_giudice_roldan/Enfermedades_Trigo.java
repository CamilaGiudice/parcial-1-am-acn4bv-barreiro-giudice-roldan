package com.example.parcial_1_am_acn4bv_barreiro_giudice_roldan;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


// CAMI ------
public class Enfermedades_Trigo extends AppCompatActivity {
    public Button btnAmain;
    public Button btnAuva;
    private Button carbon,volador,negra,falsa,amarilla;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_enfermedades_trigo);

// Busco los botones para dirigir a las activities correspondientes

        btnAmain= findViewById (R.id.btnAmain);
        btnAuva = findViewById (R.id.btnAuva);

        // Inicializacion de botones de enfermedades Trigo
       carbon=findViewById (R.id.btncarboncub);
       volador=findViewById (R.id.btnvolador);
       negra=findViewById (R.id.btnesnegra);
       falsa=findViewById (R.id.btnfalsa);
       amarilla=findViewById (R.id.btnamarilla);

        // onclick de todas las enfermedades de Trigo
        carbon.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse
                        ("https://herbariofitopatologia.agro.uba.ar/?page_id=209"));
                startActivity (intent);
            }
        });
        volador.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse
                        ("https://herbariofitopatologia.agro.uba.ar/?page_id=212"));
                startActivity (intent);
            }
        });
        negra.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Intent.ACTION_VIEW,Uri.parse
                        ("https://herbariofitopatologia.agro.uba.ar/?page_id=219"));
                startActivity (intent);
            }
        });

        falsa.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent (Intent.ACTION_VIEW,
                        Uri.parse("https://herbariofitopatologia.agro.uba.ar/?page_id=22117"));
                startActivity (intent);
            }
        });
        amarilla.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (Intent.ACTION_VIEW,
                        Uri.parse("https://herbariofitopatologia.agro.uba.ar/?page_id=227"));
                startActivity (intent);
            }
        });

        btnAmain.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent (getApplicationContext (), MainActivity.class);
                startActivity (intent);
            }
        });
        btnAuva.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext (), Enfermedades_Uva.class);
                startActivity (intent);
            }
        });
    }
}
