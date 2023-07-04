package com.example.apkbookwiz.detailBukuTeknologi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.apkbookwiz.R;
import com.example.apkbookwiz.novel.bukunovel1;
import com.example.apkbookwiz.novel.bukunovel6;
import com.example.apkbookwiz.novelPage;
import com.example.apkbookwiz.teknologi.bukuteknologi6;
import com.example.apkbookwiz.teknologiPage;
import com.example.apkbookwiz.wishlistPage;

public class detBukuTeknologi6 extends AppCompatActivity {
    ImageView back_teknologi, btn_read, btn_wistlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_det_buku_teknologi6);
        back_teknologi= findViewById(R.id.back_teknologi);
        btn_read= findViewById(R.id.btn_read);
        btn_wistlist= findViewById(R.id.btn_wistlist);

        back_teknologi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(detBukuTeknologi6.this, teknologiPage.class);
                startActivity(intent);
            }
        });

        btn_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(detBukuTeknologi6.this, bukuteknologi6.class);
                startActivity(intent);
            }
        });

        btn_wistlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(detBukuTeknologi6.this, wishlistPage.class);
                startActivity(intent);
            }
        });
    }
}