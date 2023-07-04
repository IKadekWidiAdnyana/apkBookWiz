package com.example.apkbookwiz.detailBukuSains;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.apkbookwiz.R;
import com.example.apkbookwiz.sains.bukusains2;
import com.example.apkbookwiz.sains.bukusains4;
import com.example.apkbookwiz.sainsPage;
import com.example.apkbookwiz.wishlistPage;

public class detBukuSains4 extends AppCompatActivity {
    ImageView back_sains, btn_read, btn_wistlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_det_buku_sains4);
        back_sains= findViewById(R.id.back_sains);
        btn_read= findViewById(R.id.btn_read);
        btn_wistlist= findViewById(R.id.btn_wistlist);

        back_sains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(detBukuSains4.this, sainsPage.class);
                startActivity(intent);
            }
        });

        btn_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(detBukuSains4.this, bukusains4.class);
                startActivity(intent);
            }
        });

        btn_wistlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(detBukuSains4.this, wishlistPage.class);
                startActivity(intent);
            }
        });
    }
}