package com.example.apkbookwiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.apkbookwiz.detailBukuNovel.detBukuNovel1;
import com.example.apkbookwiz.detailBukuNovel.detBukuNovel2;
import com.example.apkbookwiz.detailBukuNovel.detBukuNovel3;
import com.example.apkbookwiz.detailBukuNovel.detBukuNovel4;
import com.example.apkbookwiz.detailBukuNovel.detBukuNovel5;
import com.example.apkbookwiz.detailBukuNovel.detBukuNovel6;
import com.example.apkbookwiz.novel.bukunovel1;
import com.example.apkbookwiz.novel.bukunovel2;
import com.example.apkbookwiz.novel.bukunovel3;
import com.example.apkbookwiz.novel.bukunovel4;
import com.example.apkbookwiz.novel.bukunovel5;
import com.example.apkbookwiz.novel.bukunovel6;

public class novelPage extends AppCompatActivity {
    CardView novel1, novel2, novel3, novel4, novel5, novel6;
    ImageView back_beranda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novel_page);
        novel1= findViewById(R.id.novel1);
        novel2= findViewById(R.id.novel2);
        novel3= findViewById(R.id.novel3);
        novel4= findViewById(R.id.novel4);
        novel5= findViewById(R.id.novel5);
        novel6= findViewById(R.id.mybook2);
        back_beranda = findViewById(R.id.back_beranda);

        novel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(novelPage.this, detBukuNovel1.class);
                startActivity(intent);
            }
        });

        novel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(novelPage.this, detBukuNovel2.class);
                startActivity(intent);
            }
        });

        novel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(novelPage.this, detBukuNovel3.class);
                startActivity(intent);
            }
        });

        novel4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(novelPage.this, detBukuNovel4.class);
                startActivity(intent);
            }
        });

        novel5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(novelPage.this, detBukuNovel5.class);
                startActivity(intent);
            }
        });

        novel6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(novelPage.this, detBukuNovel6.class);
                startActivity(intent);
            }
        });

        back_beranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(novelPage.this, home.class);
                startActivity(intent);
            }
        });

    }
}