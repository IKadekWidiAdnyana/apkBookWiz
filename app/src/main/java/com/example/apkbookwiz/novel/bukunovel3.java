package com.example.apkbookwiz.novel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apkbookwiz.R;
import com.joanzapata.pdfview.PDFView;

public class bukunovel3 extends AppCompatActivity {
    private PDFView bukunovel3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukunovel3);
        bukunovel3 = findViewById(R.id.bukunovel3);

        bukunovel3.fromAsset("novel3.pdf")
                .swipeVertical(true)
                .load();
    }
}