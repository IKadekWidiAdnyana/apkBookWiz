package com.example.apkbookwiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class profilPage extends AppCompatActivity {
    ImageView btnHome3, btnWishlist3, btnMyBook3, backtoprofil;
    String email;
    String password;
    TextView emailTextView, passwordTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_page);


        btnHome3 = findViewById(R.id.btnHome3);
        btnWishlist3 = findViewById(R.id.btnWishlist3);
        btnMyBook3 = findViewById(R.id.btnMyBook3);
        backtoprofil = findViewById(R.id.backtoprofil);
        emailTextView = findViewById(R.id.emailTextView);
        passwordTextView = findViewById(R.id.passwordTextView);

        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        email = sharedPreferences.getString("email", "default_value1");
        password = sharedPreferences.getString("password", "default_value2");

        emailTextView.setText(email);
        passwordTextView.setText(password);
        btnHome3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profilPage.this, home.class);
                startActivity(intent);
            }
        });

        btnWishlist3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profilPage.this, wishlistPage.class);
                startActivity(intent);
            }
        });

        btnMyBook3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profilPage.this, myBookPage.class);
                startActivity(intent);
            }
        });

        backtoprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profilPage.this, home.class);
                startActivity(intent);
            }
        });


    }
}