package com.example.parcial_1_am_acn4bv_barreiro_giudice_roldan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// CAMI ----------
public class Enfermedades_Uva extends AppCompatActivity {

   public Button btnAmain;
    public Button btnAmaiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_enfermedades_uva);

        btnAmain= findViewById (R.id.btnAmain);
        btnAmaiz= findViewById (R.id.btnAmaiz);

        btnAmain.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent (getApplicationContext (), MainActivity.class);
                startActivity (intent);
            }
        });

        btnAmaiz.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext (),Enfermedades_Maiz.class);
                startActivity (intent);

            }
        });


    }
}