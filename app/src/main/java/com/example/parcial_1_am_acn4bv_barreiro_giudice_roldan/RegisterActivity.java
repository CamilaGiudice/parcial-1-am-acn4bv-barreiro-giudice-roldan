package com.example.parcial_1_am_acn4bv_barreiro_giudice_roldan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

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


    }
}