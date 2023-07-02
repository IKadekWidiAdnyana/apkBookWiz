package com.example.apkbookwiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.apkbookwiz.teknologi.bukuteknologi1;
import com.example.apkbookwiz.teknologi.bukuteknologi2;
import com.example.apkbookwiz.teknologi.bukuteknologi3;
import com.example.apkbookwiz.teknologi.bukuteknologi4;
import com.example.apkbookwiz.teknologi.bukuteknologi5;
import com.example.apkbookwiz.teknologi.bukuteknologi6;

public class teknologiPage extends AppCompatActivity {
    ImageView back_beranda;
    CardView teknologi1,teknologi2,teknologi3,teknologi4,teknologi5,teknologi6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teknologi_page);
        back_beranda= findViewById(R.id.back_beranda);
        teknologi1= findViewById(R.id.mybook1);
        teknologi2= findViewById(R.id.teknologi2);
        teknologi3= findViewById(R.id.teknologi3);
        teknologi4= findViewById(R.id.teknologi4);
        teknologi5= findViewById(R.id.teknologi5);
        teknologi6= findViewById(R.id.teknologi6);

        back_beranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(teknologiPage.this, home.class);
                startActivity(intent);
            }
        });

        teknologi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(teknologiPage.this, bukuteknologi1.class);
                startActivity(intent);
            }
        });

        teknologi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(teknologiPage.this, bukuteknologi2.class);
                startActivity(intent);
            }
        });

        teknologi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(teknologiPage.this, bukuteknologi3.class);
                startActivity(intent);
            }
        });

        teknologi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(teknologiPage.this, bukuteknologi4.class);
                startActivity(intent);
            }
        });

        teknologi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(teknologiPage.this, bukuteknologi5.class);
                startActivity(intent);
            }
        });

        teknologi6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(teknologiPage.this, bukuteknologi6.class);
                startActivity(intent);
            }
        });
    }
}