package com.example.apkbookwiz.fiksi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apkbookwiz.R;
import com.joanzapata.pdfview.PDFView;

public class bukufiksi5 extends AppCompatActivity {
    private PDFView bukufiksi5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukufiksi5);
        bukufiksi5 = findViewById(R.id.bukufiksi5);

        bukufiksi5.fromAsset("fiksi5.pdf")
                .swipeVertical(true)
                .load();
    }
}