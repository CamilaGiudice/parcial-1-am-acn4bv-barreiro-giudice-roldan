package com.example.parcial_1_am_acn4bv_barreiro_giudice_roldan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity {
    // Agrego una instancia del Firebase para loguearse
    private FirebaseAuth mAuth;
    private FirebaseFirestore firestore;
    private DocumentReference ref;




    public void login(String email, String password){
        Log.i ("firebase", "email"+ email);
        Log.i ("firebase", "password"+ password);
        mAuth.signInWithEmailAndPassword (email,password).addOnCompleteListener  // vamos a loguearnos con Firebase
                (new OnCompleteListener<AuthResult> () {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
               if(task.isSuccessful ()) {
                   Toast.makeText(getApplicationContext (),
                           "Login exitoso",Toast.LENGTH_SHORT).show ();  // entro con usuario y contraseña

                   // Verificación de email en base de datos Firestore //

                    firestore.collection ("usuarios").get ().addOnCompleteListener
                            (new OnCompleteListener<QuerySnapshot> () {
                                @Override
                                public void onComplete(@NonNull Task<QuerySnapshot> task) {
                                    if(task.isSuccessful ()){
                                        for(QueryDocumentSnapshot doc: task.getResult ()){
                                            String mail=doc.getString ("Email") ; // email de Firestore
                                            String pass=doc.getString ("Contraseña");

                                            if(mail.equalsIgnoreCase (email) && pass.equalsIgnoreCase (password)){
                                                Intent intent = new Intent(getApplicationContext (),
                                                        MainActivity.class);
                                                startActivity (intent);
                                                Toast.makeText(getApplicationContext (),
                                                        " Login exitoso ",Toast.LENGTH_SHORT).show ();
                                                finish();

                                            }

                                            else{
                                                Toast.makeText(getApplicationContext (),
                                                        "Email o contraseña inválidos  ",Toast.LENGTH_SHORT).show ();
                                            }
                                        }
                                    }
                                }
                            });


               }else {
                   Toast.makeText(getApplicationContext (),
                           "No pudo loguearse ",Toast.LENGTH_SHORT).show ();
               }
            }
        });
    }
  // Metodo para ejecutar el boton del login
    public void onLoginButtonClick(View view) {
        EditText emailInput = findViewById (R.id.editTextTextEmailAddress);
        EditText passInput = findViewById (R.id.editTextTextPassword);

        String email = emailInput.getText ().toString ();
        String password = passInput.getText ().toString ();

        // Login con Firebase
        this.login (email, password);
    }

  TextView reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth= FirebaseAuth.getInstance ();  // conectandonos con Firebase (inicializando el objeto)
        reg= findViewById (R.id.txtRegister);

        // inicializacion de la variables de la base de datos

        firestore = FirebaseFirestore.getInstance ();
        ref = firestore.collection ("usuarios").document ();

        reg.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext (),RegisterActivity.class);
                startActivity (intent);
                finish ();
            }
        });


    }
}











