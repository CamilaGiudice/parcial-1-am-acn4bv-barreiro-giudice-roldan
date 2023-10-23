package com.example.parcial_1_am_acn4bv_barreiro_giudice_roldan;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    //Atributos
    private int idUsuarios;
    private int idCultivos;
    private int idEnfermedades;

    private ImageButton btnLimon;
    private ImageButton btnMaiz;
    private ImageButton btnTrigo;
    private ImageButton btnUva;

    private ArrayList<UsuarioActivity> usuarios;
    private ArrayList<EnfermedadActivity> enfermedades;
    private ArrayList<CultivoActivity> cultivos;

    private UsuarioActivity logueado;


    //Constructor
    public MainActivity(){

        usuarios = new ArrayList<>();
        enfermedades = new ArrayList<>();
        cultivos = new ArrayList<>();

        idUsuarios=1;
        idCultivos=1;
        idEnfermedades=1;

    }


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

    //Login
    public void login(){}



    //Cerrar Sesion

    public void cerrarSesion(){}



    //Logueado



    //Obtener Listas Clon
    List<UsuarioActivity> usuariosClon = new ArrayList<>(usuarios);
    List<CultivoActivity> cultivosClon = new ArrayList<>(cultivos);
    List<EnfermedadActivity> enfermedadesClon = new ArrayList<>(enfermedades);


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
    public boolean modificarEnfermedades(int id, String nombre, String descripcion, String solBio, String solQuim){

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


}