package com.example.parcial_1_am_acn4bv_barreiro_giudice_roldan;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;


// CAMI ------
public class Enfermedades_Trigo extends Activity {
    public Button btnAmain;
    public Button btnAuva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_enfermedades_trigo);


        btnAmain= findViewById (R.id.btnAmain);
        btnAuva = findViewById (R.id.btnAuva);

    }
}
