package com.example.parcial_1_am_acn4bv_barreiro_giudice_roldan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

// HERNAN  ------------
public class Enfermedades_Limon extends AppCompatActivity {
    public Button btnAmain;
    public Button btnAtrigo;
    private Button antracnosis, acaros,cancrosis,mancha,clorosis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView (R.layout.activity_enfermedades_limon);

        btnAmain=findViewById (R.id.btnAmain);
        btnAtrigo=findViewById (R.id.btnAtrigo);

// Inicializacion de botones de enfermedades Limon
        antracnosis=findViewById (R.id.btenfantracnosis);
        acaros= findViewById (R.id.btLimonAcaros);
        cancrosis=findViewById (R.id.btnLicancrosis);
        mancha= findViewById (R.id.btnLimancha);
        clorosis=findViewById (R.id.btnLiclorosis);

        // onclick de todas las enfermedades

        antracnosis.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse
                        ("https://herbariofitopatologia.agro.uba.ar/?page_id=280"));
                startActivity (intent);
            }
        });
        acaros.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent (Intent.ACTION_VIEW,Uri.parse
                        ("https://herbariofitopatologia.agro.uba.ar/?page_id=12058"));
                startActivity (intent);
            }
        });

        cancrosis.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent (Intent.ACTION_VIEW,Uri.parse
                        ("https://herbariofitopatologia.agro.uba.ar/?page_id=284"));
                startActivity (intent);
            }
        });

         mancha.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent (Intent.ACTION_VIEW,Uri.parse
                         (" https://herbariofitopatologia.agro.uba.ar/?page_id=302 "));
                 startActivity (intent);
             }
         });
         clorosis.setOnClickListener (new View.OnClickListener () {
             @Override
             public void onClick(View v) {
                 Intent intent =new Intent (Intent.ACTION_VIEW,Uri.parse
                         ("https://herbariofitopatologia.agro.uba.ar/?page_id=2825"));
                 startActivity (intent);
             }
         });

        btnAmain.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext (), MainActivity.class);
                startActivity (intent);
            }
        });

        btnAtrigo.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext (), Enfermedades_Trigo.class);
                startActivity (intent);
            }
        });


    }
}