package com.example.apkbookwiz.fiksi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apkbookwiz.R;
import com.joanzapata.pdfview.PDFView;

public class bukufiksi6 extends AppCompatActivity {
    private PDFView bukufiksi6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukufiksi6);
        bukufiksi6 = findViewById(R.id.bukufiksi6);

        bukufiksi6.fromAsset("fiksi6.pdf")
                .swipeVertical(true)
                .load();
    }
}