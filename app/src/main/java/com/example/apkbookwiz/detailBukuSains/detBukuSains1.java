package com.example.apkbookwiz.detailBukuSains;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.apkbookwiz.R;
import com.example.apkbookwiz.detailBukuFiksi1.detBukuFiksi1;
import com.example.apkbookwiz.fiksi.bukufiksi1;
import com.example.apkbookwiz.fiksiPage;
import com.example.apkbookwiz.sains.bukusains1;
import com.example.apkbookwiz.sainsPage;
import com.example.apkbookwiz.wishlistPage;

public class detBukuSains1 extends AppCompatActivity {
    ImageView back_sains, btn_read, btn_wistlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_det_buku_sains1);

        back_sains= findViewById(R.id.back_sains);
        btn_read= findViewById(R.id.btn_read);
        btn_wistlist= findViewById(R.id.btn_wistlist);

        back_sains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(detBukuSains1.this, sainsPage.class);
                startActivity(intent);
            }
        });

        btn_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(detBukuSains1.this, bukusains1.class);
                startActivity(intent);
            }
        });

        btn_wistlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(detBukuSains1.this, wishlistPage.class);
                startActivity(intent);
            }
        });
    }
}