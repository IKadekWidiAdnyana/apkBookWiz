package com.example.apkbookwiz.detailBukuFiksi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.apkbookwiz.R;
import com.example.apkbookwiz.fiksi.bukufiksi1;
import com.example.apkbookwiz.fiksi.bukufiksi3;
import com.example.apkbookwiz.fiksiPage;
import com.example.apkbookwiz.wishlistPage;

public class detBukuFiksi3 extends AppCompatActivity {
    ImageView back_fiksi, btn_read, btn_wistlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_det_buku_fiksi3);
        back_fiksi= findViewById(R.id.back_fiksi);
        btn_read= findViewById(R.id.btn_read);
        btn_wistlist= findViewById(R.id.btn_wistlist);

        back_fiksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(detBukuFiksi3.this, fiksiPage.class);
                startActivity(intent);
            }
        });

        btn_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(detBukuFiksi3.this, bukufiksi3.class);
                startActivity(intent);
            }
        });

        btn_wistlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(detBukuFiksi3.this, wishlistPage.class);
                startActivity(intent);
            }
        });
    }
}