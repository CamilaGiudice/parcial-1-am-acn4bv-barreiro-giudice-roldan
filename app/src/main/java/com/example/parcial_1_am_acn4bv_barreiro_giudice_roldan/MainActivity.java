package com.example.parcial_1_am_acn4bv_barreiro_giudice_roldan;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;

    //Atributos
    private int idUsuarios;
    private int idCultivos;
    private int idEnfermedades;

    //Botones Enfermedades
    // Hernan
   private Button enfLimon;
    // Cami
   private Button enfTrigo;
    // Hernan
   private Button enfUva;
    private Button enfMaiz;

    // Cami IMAGEN DE BOTONES

    public ImageButton btnLimon;
    public ImageButton btnMaiz;
    public ImageButton btnTrigo;
    public ImageButton btnUva;

    //Botones Ingresar y cerrar sesion
    // HERNAN BOTONES
    private Button btnIngresar;
    private Button btnCerrarSesion;
    private UsuarioActivity logueado;


    //Listas no inicializadas
    private ArrayList<UsuarioActivity> usuarios;
    private ArrayList<EnfermedadActivity> enfermedades;
    private ArrayList<CultivoActivity> cultivos;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        // Para manipular el backend del Firebase
        mAuth = FirebaseAuth.getInstance ();

        btnLimon = findViewById(R.id.btnlimon);
        btnMaiz = findViewById(R.id.btnmaiz);
        btnTrigo = findViewById(R.id.btntrigo);
        btnUva = findViewById(R.id.btnuva);

// HERNAN  - enfLimon y enfTrigo
        enfLimon= findViewById (R.id.btnELimon);
        enfTrigo= findViewById (R.id.btnETrigo);
 // CAMI  - enfUva y enfMaiz
        enfUva = findViewById (R.id.btnEUva);
        enfMaiz = findViewById (R.id.btnEMaiz);

// Ingresar y logout de pantalla main
        btnIngresar =findViewById (R.id.ingresar);
        btnCerrarSesion = findViewById (R.id.cerrarSesion);


        // Recuperar los datos del Intent
        Intent intent = getIntent ();
        String nombre = intent.getStringExtra ("Nombre");

        Toast.makeText (getApplicationContext (), "Bienvenido " + nombre, Toast.LENGTH_LONG).show ();


        // pasaje del boton enfLimon a la activity Enfermedades Limon
        enfLimon.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext (),Enfermedades_Limon.class);
                startActivity (intent);
            }
        });
        // HERNAN ---- pasaje del botón enfTrigo a la Activity Enfermedades del Trigo
        enfTrigo.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext (), Enfermedades_Trigo.class);
                startActivity (intent);
            }
        });


        // HERNAN   --- pasaje del botón enfUva a la Activity Enfermedades de Uva
        enfUva.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext (), Enfermedades_Uva.class);
                startActivity (intent);
            }
        });

        // HERNAN  -------pasaje del botón enfMaiz a la Activity Enfermedades de Maíz

        enfMaiz.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext (), Enfermedades_Maiz.class);
                startActivity (intent);
            }
        });

        btnLimon.setOnClickListener(new View.OnClickListener() {
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

        // Metodo Ingresar ( Login) Cami
        btnIngresar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        //Metodo Cerrar Sesion  ( Cami)
        btnCerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cerrarSesion();
            }
        });

    }
    // Firebase on Star para ver si hay usuarios
        @Override
        public void onStart() {
            super.onStart();
            // Check if user is signed in (non-null) and update UI accordingly.
        // este metodo esta asociado a algún usuario?
            FirebaseUser currentUser = mAuth.getCurrentUser();
            if (currentUser != null) {
                Log.i (" firebase", "ya hay un usuario con esos datos");
            }
            else{
                Intent intent = new Intent(getApplicationContext (),
                        LoginActivity.class);
                startActivity (intent);
                finish ();
                Log.i(" firebase ", "Logueese");

            }
        }

    // metodo cerrar sesion con mAuth (Firebase)
        public void cerrarSesion(){

       mAuth.signOut ();
       Toast.makeText(getApplicationContext (),"Se ha cerrado sesión correctamente",
               Toast.LENGTH_LONG).show ();
       Intent intent = new Intent(getApplicationContext (),LoginActivity.class);
       startActivity (intent);
       finish ();

    }

}