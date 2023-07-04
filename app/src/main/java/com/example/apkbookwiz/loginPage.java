package com.example.apkbookwiz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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

public class loginPage extends AppCompatActivity {
    EditText editTextUsername, editTextPassword;
    Button login;
    TextView regis;

    FirebaseAuth firebaseAuth= FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        editTextUsername = findViewById(R.id.inputUsername);
        editTextPassword = findViewById(R.id.inputPassword);
        login = findViewById(R.id.btn_login);
        regis = findViewById(R.id.logout);

        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(loginPage.this, regisPage.class);
                startActivity(intent);
                finish();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputUsername, inputPassword;
                inputUsername = String.valueOf(editTextUsername.getText());
                inputPassword = String.valueOf(editTextPassword.getText());

                if (TextUtils.isEmpty(inputUsername)){
                    Toast.makeText(loginPage.this, "Masukkan Username", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(inputPassword)){
                    Toast.makeText(loginPage.this, "Masukkan Password", Toast.LENGTH_SHORT).show();
                    return;
                }

                firebaseAuth.signInWithEmailAndPassword(inputUsername, inputPassword)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()){
                                    Toast.makeText(loginPage.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                                    SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
                                    SharedPreferences.Editor editor = sharedPreferences.edit();
                                    editor.putString("email", inputUsername);
                                    editor.putString("password", inputPassword);
                                    editor.apply();
                                    Intent intent = new Intent(loginPage.this, home.class);
                                    startActivity(intent);
                                    finish();
                                }
                                else{
                                    Toast.makeText(loginPage.this, "Login Gagal", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });
    }
}