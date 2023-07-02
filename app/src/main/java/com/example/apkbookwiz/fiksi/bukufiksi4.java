package com.example.apkbookwiz.fiksi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apkbookwiz.R;
import com.joanzapata.pdfview.PDFView;

public class bukufiksi4 extends AppCompatActivity {
    private PDFView bukufiksi4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukufiksi4);
        bukufiksi4 = findViewById(R.id.bukufiksi4);

        bukufiksi4.fromAsset("fiksi4.pdf")
                .swipeVertical(true)
                .load();
    }
}