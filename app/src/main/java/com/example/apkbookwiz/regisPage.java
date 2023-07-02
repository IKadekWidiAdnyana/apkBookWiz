package com.example.apkbookwiz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class regisPage extends AppCompatActivity {
    EditText editTextUsername, editTextPassword;
    Button regis;
    TextView login;

    FirebaseAuth firebaseAuth= FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis_page);

        editTextUsername = findViewById(R.id.inputUsername);
        editTextPassword = findViewById(R.id.inputPassword);
        regis = findViewById(R.id.logout);
        login = findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(regisPage.this, com.example.apkbookwiz.loginPage.class);
                startActivity(intent);
                finish();
            }
        });

        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputUsername, inputPassword;
                inputUsername = String.valueOf(editTextUsername.getText());
                inputPassword = String.valueOf(editTextPassword.getText());

                if (TextUtils.isEmpty(inputUsername)){
                    Toast.makeText(regisPage.this, "Masukkan Username", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(inputPassword)){
                    Toast.makeText(regisPage.this, "Masukkan Password", Toast.LENGTH_SHORT).show();
                    return;
                }

                firebaseAuth.createUserWithEmailAndPassword(inputUsername, inputPassword)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()){
                                    Toast.makeText(regisPage.this, "Registrasi Berhasil", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(regisPage.this, com.example.apkbookwiz.loginPage.class);
                                    startActivity(intent);
                                    finish();
                                }
                                else {
                                    Toast.makeText(regisPage.this, "Registrasi Gagal", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });
    }
}