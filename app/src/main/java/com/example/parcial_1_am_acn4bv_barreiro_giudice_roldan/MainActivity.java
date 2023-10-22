package com.example.parcial_1_am_acn4bv_barreiro_giudice_roldan;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    private ImageButton btnLimon;
    private ImageButton btnMaiz;
    private ImageButton btnTrigo;
    private ImageButton btnUva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLimon = findViewById(R.id.btnlimon);
        btnMaiz = findViewById(R.id.btnmaiz);
        btnTrigo = findViewById(R.id.btntrigo);
        btnUva = findViewById(R.id.btnuva);

        //Metodo limon
        btnLimon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Crear el cuadro de dialogo personalizado
                Dialog cuadroDialogoLimon = new Dialog(MainActivity.this);
                cuadroDialogoLimon.setContentView(R.layout.cuadro_dialogo_limon);

                //Configuro el cuadro de dialogo para que sea modal
                cuadroDialogoLimon.setCancelable(true);

                //Muestro el cuadro de dialogo
                cuadroDialogoLimon.show();
            }
        });

       //Metodo Maiz

       btnMaiz.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Dialog cuadroDialogoMaiz = new Dialog(MainActivity.this);
               cuadroDialogoMaiz.setContentView(R.layout.cuadro_dialogo_maiz);

               cuadroDialogoMaiz.setCancelable(true);

               cuadroDialogoMaiz.show();

           }
       });

       //Metodo Uva
        btnUva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog cuadroDialogoUva = new Dialog(MainActivity.this);
                cuadroDialogoUva.setContentView(R.layout.cuadro_dialogo_uva);

                cuadroDialogoUva.setCancelable(true);

                cuadroDialogoUva.show();
            }
        });


       //Metodo Trigo

        btnTrigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog cuadroDialogoTrigo = new Dialog(MainActivity.this);
                cuadroDialogoTrigo.setContentView(R.layout.cuadro_dialogo_trigo);

                cuadroDialogoTrigo.setCancelable(true);

                cuadroDialogoTrigo.show();
            }
        });


    }
}