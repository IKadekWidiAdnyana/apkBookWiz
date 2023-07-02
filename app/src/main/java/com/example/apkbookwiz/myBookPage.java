package com.example.apkbookwiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.apkbookwiz.novel.bukunovel6;
import com.example.apkbookwiz.teknologi.bukuteknologi1;

public class myBookPage extends AppCompatActivity {
    ImageView btnHome2, btnWishlist2, btnProfil2, backtowlist;
    CardView mybook1, mybook2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_book_page);
        btnHome2 = findViewById(R.id.btnHome2);
        btnWishlist2 = findViewById(R.id.btnWishlist2);
        btnProfil2 = findViewById(R.id.btnProfil2);
        mybook1 = findViewById(R.id.mybook1);
        mybook2 = findViewById(R.id.mybook2);
        backtowlist = findViewById(R.id.backtowlist);

        btnHome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(myBookPage.this, home.class);
                startActivity(intent);
            }
        });

        btnWishlist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(myBookPage.this, wishlistPage.class);
                startActivity(intent);
            }
        });

        btnProfil2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(myBookPage.this, profilPage.class);
                startActivity(intent);
            }
        });

        mybook1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(myBookPage.this, bukuteknologi1.class);
                startActivity(intent);
            }
        });

        mybook2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(myBookPage.this, bukunovel6.class);
                startActivity(intent);
            }
        });

        backtowlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(myBookPage.this, home.class);
                startActivity(intent);
            }
        });
    }
}