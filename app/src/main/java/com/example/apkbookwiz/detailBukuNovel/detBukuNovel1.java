package com.example.apkbookwiz.detailBukuNovel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.apkbookwiz.R;
import com.example.apkbookwiz.detailBukuFiksi1.detBukuFiksi1;
import com.example.apkbookwiz.fiksi.bukufiksi1;
import com.example.apkbookwiz.fiksiPage;
import com.example.apkbookwiz.novel.bukunovel1;
import com.example.apkbookwiz.novelPage;
import com.example.apkbookwiz.wishlistPage;

public class detBukuNovel1 extends AppCompatActivity {
    ImageView back_novel, btn_read, btn_wistlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_det_buku_novel1);
        back_novel= findViewById(R.id.back_novel);
        btn_read= findViewById(R.id.btn_read);
        btn_wistlist= findViewById(R.id.btn_wistlist);

        back_novel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(detBukuNovel1.this, novelPage.class);
                startActivity(intent);
            }
        });

        btn_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(detBukuNovel1.this, bukunovel1.class);
                startActivity(intent);
            }
        });

        btn_wistlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(detBukuNovel1.this, wishlistPage.class);
                startActivity(intent);
            }
        });
    }
}