package com.example.comercioemrede.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

import com.example.comercioemrede.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthActionCodeException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class TelaInicial extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);


    }


    public void telaLogin(View view) {

        Switch swtLOJ = findViewById(R.id.swtLOJ);
        if(swtLOJ.isChecked()){
            Intent it = new Intent(TelaInicial.this, TelaLoginLOJ.class);
            startActivity(it);
        }else {
            Intent it = new Intent(TelaInicial.this, TelaLoginCLI.class);
            startActivity(it);
        }


    }
    public void telaCadastro(View view) {

        Switch swtLOJ = findViewById(R.id.swtLOJ);
        if(swtLOJ.isChecked()){
            Intent it = new Intent(TelaInicial.this, TelaCadastroLOJ.class);
            startActivity(it);
        }else {
            Intent it = new Intent(TelaInicial.this, TelaCadastroCLI.class);
            startActivity(it);
        }

    }




}
