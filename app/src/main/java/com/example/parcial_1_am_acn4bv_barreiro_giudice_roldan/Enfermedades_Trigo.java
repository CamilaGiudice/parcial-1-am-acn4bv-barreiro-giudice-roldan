package com.example.parcial_1_am_acn4bv_barreiro_giudice_roldan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


// CAMI ------
public class Enfermedades_Trigo extends AppCompatActivity {
    public Button btnAmain;
    public Button btnAuva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_enfermedades_trigo);

// Busco los botones para dirigir a las activities correspondientes

        btnAmain= findViewById (R.id.btnAmain);
        btnAuva = findViewById (R.id.btnAuva);

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
