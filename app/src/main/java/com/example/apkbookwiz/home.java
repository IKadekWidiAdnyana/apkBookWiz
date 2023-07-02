package com.example.apkbookwiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.apkbookwiz.fiksi.bukufiksi1;
import com.example.apkbookwiz.fiksi.bukufiksi2;
import com.example.apkbookwiz.fiksi.bukufiksi3;
import com.example.apkbookwiz.fiksi.bukufiksi4;
import com.example.apkbookwiz.novel.bukunovel1;
import com.example.apkbookwiz.novel.bukunovel2;
import com.example.apkbookwiz.novel.bukunovel3;
import com.example.apkbookwiz.novel.bukunovel4;
import com.example.apkbookwiz.sains.bukusains1;
import com.example.apkbookwiz.sains.bukusains6;
import com.example.apkbookwiz.teknologi.bukuteknologi1;
import com.example.apkbookwiz.teknologi.bukuteknologi6;

public class home extends AppCompatActivity {

    CardView fiksiCardView;
    CardView teknologiCardView;
    CardView sainsCardView;
    CardView novelCardView;
    ImageView btn_info;
    ImageView btnWishlistPage;
    ImageView btnMyBook;
    ImageView btnProfil;
    CardView rekomendasi1, rekomendasi2, rekomendasi3,
            rekomendasi4, rekomendasi5, rekomendasi6;
    CardView bukupopuler1, bukupopuler2, bukupopuler3,
            bukupopuler4, bukupopuler5, bukupopuler6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        fiksiCardView= findViewById(R.id.fiksiCardView);
        teknologiCardView= findViewById(R.id.teknologiCardView);
        sainsCardView= findViewById(R.id.sainsCardView);
        novelCardView= findViewById(R.id.novelCardView);
        btn_info= findViewById(R.id.btn_info);
        btnWishlistPage= findViewById(R.id.btnWishlistPage);
        btnMyBook= findViewById(R.id.btnMyBook);
        btnProfil= findViewById(R.id.btnProfil);

        rekomendasi1= findViewById(R.id.rekomendasi1);
        rekomendasi2= findViewById(R.id.rekomendasi2);
        rekomendasi3= findViewById(R.id.rekomendasi3);
        rekomendasi4= findViewById(R.id.rekomendasi4);
        rekomendasi5= findViewById(R.id.rekomendasi5);
        rekomendasi6= findViewById(R.id.rekomendasi6);

        bukupopuler1= findViewById(R.id.bukupopuler1);
        bukupopuler2= findViewById(R.id.bukupopuler2);
        bukupopuler3= findViewById(R.id.bukupopuler3);
        bukupopuler4= findViewById(R.id.bukupopuler4);
        bukupopuler5= findViewById(R.id.bukupopuler5);
        bukupopuler6= findViewById(R.id.bukupopuler6);

        fiksiCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, fiksiPage.class);
                startActivity(intent);
            }
        });

        teknologiCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, teknologiPage.class);
                startActivity(intent);
            }
        });

        sainsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, sainsPage.class);
                startActivity(intent);
            }
        });

        novelCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, novelPage.class);
                startActivity(intent);
            }
        });

        btn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, aboutPage.class);
                startActivity(intent);
            }
        });

        btnWishlistPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, wishlistPage.class);
                startActivity(intent);
            }
        });

        btnMyBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, myBookPage.class);
                startActivity(intent);
            }
        });

        btnProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, profilPage.class);
                startActivity(intent);
            }
        });

        rekomendasi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, bukunovel3.class);
                startActivity(intent);
            }
        });

        rekomendasi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, bukufiksi1.class);
                startActivity(intent);
            }
        });

        rekomendasi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, bukufiksi4.class);
                startActivity(intent);
            }
        });

        rekomendasi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, bukufiksi3.class);
                startActivity(intent);
            }
        });

        rekomendasi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, bukuteknologi6.class);
                startActivity(intent);
            }
        });

        rekomendasi6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, bukusains6.class);
                startActivity(intent);
            }
        });

        bukupopuler1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, bukunovel1.class);
                startActivity(intent);
            }
        });

        bukupopuler2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, bukunovel2.class);
                startActivity(intent);
            }
        });

        bukupopuler3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, bukunovel4.class);
                startActivity(intent);
            }
        });

        bukupopuler4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, bukuteknologi1.class);
                startActivity(intent);
            }
        });

        bukupopuler5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, bukufiksi2.class);
                startActivity(intent);
            }
        });

        bukupopuler6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, bukusains1.class);
                startActivity(intent);
            }
        });

    }
}