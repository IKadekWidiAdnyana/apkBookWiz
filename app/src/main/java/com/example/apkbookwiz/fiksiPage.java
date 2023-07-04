package com.example.apkbookwiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.apkbookwiz.detailBukuFiksi1.detBukuFiksi1;
import com.example.apkbookwiz.detailBukuFiksi1.detBukuFiksi2;
import com.example.apkbookwiz.detailBukuFiksi1.detBukuFiksi3;
import com.example.apkbookwiz.detailBukuFiksi1.detBukuFiksi4;
import com.example.apkbookwiz.detailBukuFiksi1.detBukuFiksi5;
import com.example.apkbookwiz.detailBukuFiksi1.detBukuFiksi6;

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
                Intent intent = new Intent(fiksiPage.this, detBukuFiksi1.class);
                startActivity(intent);
            }
        });

        fiksi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fiksiPage.this, detBukuFiksi2.class);
                startActivity(intent);
            }
        });

        fiksi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fiksiPage.this, detBukuFiksi3.class);
                startActivity(intent);
            }
        });

        fiksi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fiksiPage.this, detBukuFiksi4.class);
                startActivity(intent);
            }
        });

        fiksi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fiksiPage.this, detBukuFiksi5.class);
                startActivity(intent);
            }
        });

        fiksi6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fiksiPage.this, detBukuFiksi6.class);
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