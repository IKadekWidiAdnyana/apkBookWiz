package com.example.apkbookwiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.apkbookwiz.fiksi.bukufiksi1;
import com.example.apkbookwiz.fiksi.bukufiksi2;
import com.example.apkbookwiz.fiksi.bukufiksi3;
import com.example.apkbookwiz.fiksi.bukufiksi4;

public class wishlistPage extends AppCompatActivity {

    ImageView btnHome1, btnMybook1, btnProfil1, backtowlist;
    CardView wlist1, wlist2, wlist3, wlist4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist_page);
        btnHome1= findViewById(R.id.btnHome1);
        btnMybook1= findViewById(R.id.btnMyBook1);
        btnProfil1= findViewById(R.id.btnProfil1);
        backtowlist= findViewById(R.id.backtowlist);
        wlist1= findViewById(R.id.wlist1);
        wlist2= findViewById(R.id.wlist2);
        wlist3= findViewById(R.id.wlist3);
        wlist4= findViewById(R.id.wlist4);


        btnHome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(wishlistPage.this, home.class);
                startActivity(intent);
            }
        });

        btnMybook1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(wishlistPage.this, myBookPage.class);
                startActivity(intent);
            }
        });

        btnProfil1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(wishlistPage.this, profilPage.class);
                startActivity(intent);
            }
        });

        wlist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(wishlistPage.this, bukufiksi1.class);
                startActivity(intent);
            }
        });

        wlist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(wishlistPage.this, bukufiksi2.class);
                startActivity(intent);
            }
        });

        wlist3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(wishlistPage.this, bukufiksi3.class);
                startActivity(intent);
            }
        });

        wlist4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(wishlistPage.this, bukufiksi4.class);
                startActivity(intent);
            }
        });

        backtowlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(wishlistPage.this, home.class);
                startActivity(intent);
            }
        });
    }
}