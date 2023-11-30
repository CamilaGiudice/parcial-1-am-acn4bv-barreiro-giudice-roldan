package com.example.parcial_1_am_acn4bv_barreiro_giudice_roldan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// CAMI ----------
public class Enfermedades_Uva extends AppCompatActivity {

   public Button btnAmain;
    public Button btnAmaiz;
    private Button acaros,hierro,rollo,tronco,filoxera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_enfermedades_uva);

        btnAmain= findViewById (R.id.btnAmain);
        btnAmaiz= findViewById (R.id.btnAmaiz);

        // Inicializacion de botones UVA
        acaros=findViewById (R.id.btnacarosvid);
        hierro=findViewById (R.id.btnhierro);
        rollo= findViewById (R.id.btnrollo);
        tronco=findViewById (R.id.btntronco);
        filoxera=findViewById (R.id.btnfiloxera);

        acaros.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent (Intent.ACTION_VIEW,
                        Uri.parse("https://herbariofitopatologia.agro.uba.ar/?page_id=23319"));
                startActivity (intent);
            }
        });
        hierro.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Intent.ACTION_VIEW,Uri.parse
                        ("https://herbariofitopatologia.agro.uba.ar/?page_id=21410"));
                startActivity (intent);
            }
        });
        rollo.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent (Intent.ACTION_VIEW,
                        Uri.parse("https://herbariofitopatologia.agro.uba.ar/?page_id=10934"));
                startActivity (intent);
            }
        });

        tronco.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://herbariofitopatologia.agro.uba.ar/?page_id=16199"));
                startActivity (intent);
            }
        });
        filoxera.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent (Intent.ACTION_VIEW,Uri.parse
                        ("https://herbariofitopatologia.agro.uba.ar/?page_id=23679"));
                startActivity(intent);
            }
        });
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