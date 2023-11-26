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

// atributos botones HERNAN
    private ImageButton btnLimon;
    private ImageButton btnMaiz;
    private ImageButton btnTrigo;
    private ImageButton btnUva;
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
    // Cami
   private Button enfMaiz;



    //Botones Ingresar y cerrar sesion
    private Button btnIngresar;
    private Button btnCerrarSesion;
    private UsuarioActivity logueado;


    //Listas no inicializadas
    private ArrayList<UsuarioActivity> usuarios;
    private ArrayList<EnfermedadActivity> enfermedades;
    private ArrayList<CultivoActivity> cultivos;


    // Botones en el Constructor
    public MainActivity() {
        //Linkeado de los botones
        //Botones Modal


        btnLimon = findViewById(R.id.btnlimon);
        btnMaiz = findViewById(R.id.btnmaiz);
        btnTrigo = findViewById(R.id.btntrigo);
        btnUva = findViewById(R.id.btnuva);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        // Para manipular el backend del Firebase
        mAuth = FirebaseAuth.getInstance ();
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
                Log.i(" firebase ", "Logueese");

            }
        }
        // HERNAN : Metodo para cerrar Sesion
        public void logout(View v){
        mAuth.signOut ();
        Intent intent = new Intent (getApplicationContext (), LoginActivity.class);
                startActivity (intent);
                Log.i("firebase", "volviendo al loguin");
        }





        //Inicializacion de las listas
      /*
        usuarios = new ArrayList<>();

        enfermedades = new ArrayList<>();
        cultivos = new ArrayList<>();

       */

        //Listas Clon
        List<UsuarioActivity> usuariosClon = new ArrayList<>(usuarios);
        List<CultivoActivity> cultivosClon = new ArrayList<>(cultivos);
        List<EnfermedadActivity> enfermedadesClon = new ArrayList<>(enfermedades);
    }

        // Inicializacion de los id
     /*   idUsuarios=1;
        idCultivos=1;
        idEnfermedades=1;

      */

        //Linkeado de los botones
        //Botones Modal Ya declarados
   /*
     public ImageButton btnLimon;
     public ImageButton btnMaiz;
    public ImageButton btnTrigo;
    public ImageButton btnUva;
*/
     /*   btnIngresar= findViewById(R.id.ingresar);
        btnCerrarSesion = findViewById(R.id.cerrarSesion);

      */

/*
       creo que el login INTERFIERE CON FIREBASE //
        Metodo Ir a Login(ingresar)
      */
  /*    btnIngresar.setOnClickListener(new View.OnClickListener(){
         @Override
          public void onClick(View v){
               Intent intent = new Intent(MainActivity.this, LoginActivity.class);
               startActivity(intent);
            }
       });


        //Metodo Cerrar Sesion
        btnCerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cerrarSesion();
            }
        });

   */
// VER TODO DESDE ACA
        //Metodo limon
   /*     btnLimon.setOnClickListener(new View.OnClickListener() {

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

    */

   /* //Login
    public boolean login(String mail, String pass) {
        for (UsuarioActivity usu : usuarios) {

            // Verifico que el usuario no esté bloqueado
            if (!usu.isUsuarioBloqueado()) {

                // Verifico que exista el correo electrónico
                if (usu.getMailUsuario().equals(mail) && mail!=null && mail!="") {

                    // Verifico que la contraseña sea correcta
                    if (usu.getPasswordUsuario().equals(pass) && pass!=null && pass!="") {

                        // Guarda al usuario en logueado
                        logueado = usu;


                        mostrarMensaje("Inicio de sesion exitoso");
                        actualizarVista();

                        return true;

                    } else {
                        // La contraseña es incorrecta, suma los intentos fallidos y bloquea después de 3 intentos
                        int intentosFallidos = usu.getIntentosFallidos() + 1;
                        usu.setIntentosFallidos(intentosFallidos);

                        if (intentosFallidos >= 3) {
                            usu.setUsuarioBloqueado(true);
                        }
                    }
                }
            }

        }
        //Mostrar mensaje de error
        mostrarMensaje("Inicio de sesion fallido");
        return false;
    }

    // Metodo mostrar mensaje
    private void mostrarMensaje(String mensaje){
        Toast.makeText(this,mensaje,Toast.LENGTH_SHORT).show();
    }

    //Metodo actualizar vista
    private void actualizarVista(){
        //Mostrar el nombre
        TextView nombreUsuario = findViewById(R.id.nombreUsuario);
        nombreUsuario.setText("Usuario: "+logueado.getNombreUsuario());
    }

    //Cerrar Sesion

    public void cerrarSesion(){
        logueado = null;
    }




    //ABM Usuario

    public boolean agregarUsuarios(String nombre,String mail,String pass,boolean esAdmin){
        usuarios.add(new UsuarioActivity(idUsuarios,nombre,mail,pass,esAdmin));
        idUsuarios++;
        return true;
    }
    public boolean modificarUsuarios(int id, String nom, String mail
            , String pass, boolean esAdmin){

        for (UsuarioActivity usu : usuarios) {
            if(usu.getIdUsuario() == id){

                usu.setIdUsuario(id);
                usu.setNombreUsuario(nom);//CONSULTAR SI ESTÁ BIEN
                usu.setMailUsuario(mail);
                usu.setPasswordUsuario(pass);
                usu.setEsAdmin(esAdmin);
                return true;

            }

        }
        return false;
    }
    public boolean EliminarUsuarios(int id){

        for (UsuarioActivity usu : usuarios){
            if (usu.getIdUsuario()==id){

                usuarios.remove(usu);
                idUsuarios--;
                return true;

            }
        }
       return false;
    }



    //ABM Cultivo
    public boolean agregarCultivos(String nombre, String descripcion){
        cultivos.add(new CultivoActivity(idCultivos,nombre,descripcion));
        idCultivos++;
        return true;
    }
    public boolean modificarCultivos(int id, String nombre, String descripcion){


        for (CultivoActivity cul : cultivos){
            if (cul.getIdCultivo() == id){

                cul.setIdCultivo(id);
                cul.setNombreCultivo(nombre);
                cul.setDescripcionCultivo(descripcion);
                return true;
            }
        }

        return false;

    }
    public boolean eliminarCultivos(int id){

        for (CultivoActivity cul : cultivos){

            if (cul.getIdCultivo()==id) {

                cultivos.remove(cul);
                idCultivos--;
                return true;
            }
        }
        return false;
    }



    //ABM Enfermedad
    public boolean agregarEnfermedades(String nombre, String descripcion, String solBio, String solQuim){
        enfermedades.add(new EnfermedadActivity(idEnfermedades,nombre,descripcion,solBio,solQuim));
        idEnfermedades++;
        return true;
    }
    public boolean modificarEnfermedades(int id, String nombre, String descripcion, String solBio,

                                         String solQuim){

        for (EnfermedadActivity enf : enfermedades){
            if (enf.getIdEnfermedad()==id){

                enf.setIdEnfermedad(id);
                enf.setNombreEnfermedad(nombre);
                enf.setDescripcionEnfermedad(descripcion);
                enf.setSolucionBiologica(solBio);
                enf.setSolucionQuimica(solQuim);
                return true;
            }
        }
        return false;
    }
    public boolean eliminarEnfermedades(int id){
        for (EnfermedadActivity enf : enfermedades){
            if (enf.getIdEnfermedad()==id){
                enfermedades.remove(enf);
                idEnfermedades--;
                return true;
            }
        }
        return false;
    }

*/
