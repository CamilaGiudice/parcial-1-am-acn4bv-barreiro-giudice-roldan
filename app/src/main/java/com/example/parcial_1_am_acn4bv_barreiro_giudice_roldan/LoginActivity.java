package com.example.parcial_1_am_acn4bv_barreiro_giudice_roldan;

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

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity{

    public void login(String email, String password){
        Log.i ("firebase", email + password);

    }
public void onLoginButtonClick(View view){
        EditText emailInput = findViewById (R.id.editTextTextEmailAddress);
        EditText passInput = findViewById (R.id.editTextTextPassword);

        String email = emailInput.getText ().toString ();

        this.login ("hernan@roldan.com.ar",  "1234");

}
    private EditText editTxtMail;
   private EditText editTextPass;
   private Button btnIniciarSesion;
   private MainActivity mainActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       /* mainActivity = new MainActivity();
        //Linkeo
        editTxtMail=findViewById(R.id.editTextTextEmailAddress);
        editTextPass=findViewById(R.id.editTextTextPassword);
        btnIniciarSesion=findViewById(R.id.btnlogin);

        //Para loguearse : llamo al método de mi clase lógica
        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = editTxtMail.getText().toString();
                String password = editTextPass.getText().toString();

                //Llamar al método de iniciar sesion de mi clase lógica
                mainActivity.login(email,password);

            }
        });
*/
    }


}
