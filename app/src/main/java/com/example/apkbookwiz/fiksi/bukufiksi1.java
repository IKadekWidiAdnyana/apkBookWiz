package com.example.apkbookwiz.fiksi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apkbookwiz.R;
import com.joanzapata.pdfview.PDFView;

public class bukufiksi1 extends AppCompatActivity {
    private PDFView bukufiksi1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukufiksi1);
        bukufiksi1 = findViewById(R.id.bukufiksi1);

        bukufiksi1.fromAsset("fiksi1.pdf")
                .swipeVertical(true)
                .load();

    }
}