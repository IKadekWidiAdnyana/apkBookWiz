package com.example.apkbookwiz.fiksi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apkbookwiz.R;
import com.joanzapata.pdfview.PDFView;

public class bukufiksi3 extends AppCompatActivity {

    private PDFView bukufiksi3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukufiksi3);
        bukufiksi3 = findViewById(R.id.bukufiksi3);

        bukufiksi3.fromAsset("fiksi3.pdf")
                .swipeVertical(true)
                .load();
    }
}