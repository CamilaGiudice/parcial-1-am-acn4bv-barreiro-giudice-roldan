package com.example.parcial_1_am_acn4bv_barreiro_giudice_roldan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {
private EditText email, password,nombre;

private Button register;
private FirebaseAuth mAuth;
private FirebaseFirestore firestore;  // Es la que se encarga de conectarse y manipular la base de datos
private DocumentReference ref;  // Es para ubicarnos en que lugar de la base de datos me estoy posicionando




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_register);

        // Inicialización de Firebase
        mAuth= FirebaseAuth.getInstance ();
        // Inicialización de los elementos gráficos
        email= findViewById (R.id.etRegemail);
        // Inicialización de password
        password= findViewById (R.id.etRegpassword);
        // Inicialización de botón de registro
        register= findViewById (R.id.btRegistrar);

        // inicializacion de nombre para agregar en la base de datos

        nombre= findViewById (R.id.etRegNomApellido);
        // inicialización de la base de datos (de documentos o coleccion)
        ref= firestore.collection ("usuarios").document (); // Inicializando nuestra tabla usuarios o
        // coleccion de usuarios - aqui vamos a guardar todos los usuarios cada vez que registremos uno nuevo.





        // Evento onClick de Boton Registro
        register.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String mail, pass;
                mail=email.getText ().toString ();
                pass=password.getText ().toString ();
                // Validacion de entrada vacía de email / password
                if (TextUtils.isEmpty (mail)||TextUtils.isEmpty(pass)){
                    Toast.makeText (getApplicationContext (), "Ingrese email y/o password ",
                            Toast.LENGTH_SHORT).show();
                    return;

                }
                mAuth.createUserWithEmailAndPassword (mail,pass).addOnCompleteListener
                        (new OnCompleteListener<AuthResult> () {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            guardarInfo();
                        }
                        else{
                            Toast.makeText (getApplicationContext (), "No se pudo registrar su usuario" + task.toString (),

                                    Toast.LENGTH_LONG).show();

                        }
                    }
                });
            }
        });

    }

    private void guardarInfo() {
        ref.get ().addOnSuccessListener (new OnSuccessListener<DocumentSnapshot> () {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists ()){
                    Toast.makeText (getApplicationContext (), "Lo sentimos, el usuario ya existe",
                            Toast.LENGTH_SHORT).show();
                }
                else{
                    Map<String,Object> regUser = new HashMap<> (); // Objeto intermedio que me prepara los datos
                    // de manera correcta para poderlos subir en el formato adecuado a Firestore

                    regUser.put ("Nombre y Apellido", nombre.getText ().toString ()); // cargamos los nombres y apellidos
                    regUser.put ("Email", email.getText ().toString ());
                    regUser.put ("Contraseña", password.getText ().toString ());


                    Toast.makeText (getApplicationContext (), "Ha registrado su usuario",
                            Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent (RegisterActivity.this,LoginActivity.class);
                    startActivity (intent);
                    finish();
                }
            }
        });


    }
}


