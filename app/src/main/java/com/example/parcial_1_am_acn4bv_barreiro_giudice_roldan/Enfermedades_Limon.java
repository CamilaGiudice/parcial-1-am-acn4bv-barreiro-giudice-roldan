package com.example.parcial_1_am_acn4bv_barreiro_giudice_roldan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

// HERNAN
public class Enfermedades_Limon extends AppCompatActivity {
    public Button btnAmain;
    public Button btnAtrigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_enfermedades_limon);

        btnAmain=findViewById (R.id.btnAmain);
        btnAtrigo=findViewById (R.id.btnAtrigo);



    }
}