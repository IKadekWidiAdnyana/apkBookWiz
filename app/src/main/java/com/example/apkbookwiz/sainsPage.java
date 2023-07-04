package com.example.apkbookwiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.apkbookwiz.detailBukuSains.detBukuSains1;
import com.example.apkbookwiz.detailBukuSains.detBukuSains2;
import com.example.apkbookwiz.detailBukuSains.detBukuSains3;
import com.example.apkbookwiz.detailBukuSains.detBukuSains4;
import com.example.apkbookwiz.detailBukuSains.detBukuSains5;
import com.example.apkbookwiz.detailBukuSains.detBukuSains6;
import com.example.apkbookwiz.sains.bukusains1;
import com.example.apkbookwiz.sains.bukusains2;
import com.example.apkbookwiz.sains.bukusains3;
import com.example.apkbookwiz.sains.bukusains4;
import com.example.apkbookwiz.sains.bukusains5;
import com.example.apkbookwiz.sains.bukusains6;

public class sainsPage extends AppCompatActivity {
    ImageView back_beranda;
    CardView sains1, sains2, sains3, sains4, sains5, sains6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sains_page);
        back_beranda = findViewById(R.id.back_beranda);
        sains1 = findViewById(R.id.sains1);
        sains2 = findViewById(R.id.sains2);
        sains3 = findViewById(R.id.sains3);
        sains4 = findViewById(R.id.sains4);
        sains5 = findViewById(R.id.sains5);
        sains6 = findViewById(R.id.sains6);

        back_beranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sainsPage.this, home.class);
                startActivity(intent);
            }
        });

        sains1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sainsPage.this, detBukuSains1.class);
                startActivity(intent);
            }
        });

        sains2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sainsPage.this, detBukuSains2.class);
                startActivity(intent);
            }
        });

        sains3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sainsPage.this, detBukuSains3.class);
                startActivity(intent);
            }
        });

        sains4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sainsPage.this, detBukuSains4.class);
                startActivity(intent);
            }
        });

        sains5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sainsPage.this, detBukuSains5.class);
                startActivity(intent);
            }
        });

        sains6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sainsPage.this, detBukuSains6.class);
                startActivity(intent);
            }
        });
    }
}