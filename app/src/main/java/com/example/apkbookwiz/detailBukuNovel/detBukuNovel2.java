package com.example.apkbookwiz.detailBukuNovel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.apkbookwiz.R;
import com.example.apkbookwiz.novel.bukunovel1;
import com.example.apkbookwiz.novel.bukunovel2;
import com.example.apkbookwiz.novelPage;
import com.example.apkbookwiz.wishlistPage;

public class detBukuNovel2 extends AppCompatActivity {
    ImageView back_novel, btn_read, btn_wistlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_det_buku_novel2);
        back_novel= findViewById(R.id.back_novel);
        btn_read= findViewById(R.id.btn_read);
        btn_wistlist= findViewById(R.id.btn_wistlist);

        back_novel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(detBukuNovel2.this, novelPage.class);
                startActivity(intent);
            }
        });

        btn_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(detBukuNovel2.this, bukunovel2.class);
                startActivity(intent);
            }
        });

        btn_wistlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(detBukuNovel2.this, wishlistPage.class);
                startActivity(intent);
            }
        });
    }
}