package com.example.apkbookwiz.fiksi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apkbookwiz.R;
import com.joanzapata.pdfview.PDFView;

public class bukufiksi2 extends AppCompatActivity {
    private PDFView bukufiksi2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukufiksi2);
        bukufiksi2 = findViewById(R.id.bukufiksi2);

        bukufiksi2.fromAsset("fiksi2.pdf")
                .swipeVertical(true)
                .load();
    }
}