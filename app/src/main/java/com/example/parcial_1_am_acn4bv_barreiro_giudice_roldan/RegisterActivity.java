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
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
private EditText email, password;
private Button register;
private FirebaseAuth mAuth;


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
                            Toast.makeText (getApplicationContext (), "Ha registrado su usuario",
                                    Toast.LENGTH_SHORT).show();
                            Intent intent= new Intent (RegisterActivity.this,LoginActivity.class);
                            startActivity (intent);
                            finish();
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
}