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
import com.example.apkbookwiz.fiksi.bukufiksi5;
import com.example.apkbookwiz.fiksi.bukufiksi6;

public class fiksiPage extends AppCompatActivity {

    CardView fiksi1, fiksi2, fiksi3, fiksi4, fiksi5, fiksi6;
    ImageView back_beranda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiksi_page);
        fiksi1= findViewById(R.id.fiksi1);
        fiksi2= findViewById(R.id.fiksi2);
        fiksi3= findViewById(R.id.fiksi3);
        fiksi4= findViewById(R.id.fiksi4);
        fiksi5= findViewById(R.id.fiksi5);
        fiksi6= findViewById(R.id.fiksi6);
        back_beranda= findViewById(R.id.back_beranda);

        fiksi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fiksiPage.this, bukufiksi1.class);
                startActivity(intent);
            }
        });

        fiksi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fiksiPage.this, bukufiksi2.class);
                startActivity(intent);
            }
        });

        fiksi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fiksiPage.this, bukufiksi3.class);
                startActivity(intent);
            }
        });

        fiksi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fiksiPage.this, bukufiksi4.class);
                startActivity(intent);
            }
        });

        fiksi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fiksiPage.this, bukufiksi5.class);
                startActivity(intent);
            }
        });

        fiksi6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fiksiPage.this, bukufiksi6.class);
                startActivity(intent);
            }
        });

        back_beranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fiksiPage.this, home.class);
                startActivity(intent);
            }
        });


    }
}