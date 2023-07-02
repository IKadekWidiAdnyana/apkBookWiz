package com.example.apkbookwiz.novel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apkbookwiz.R;
import com.joanzapata.pdfview.PDFView;

public class bukunovel5 extends AppCompatActivity {
    private PDFView bukunovel5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukunovel5);
        bukunovel5 = findViewById(R.id.bukunovel5);

        bukunovel5.fromAsset("novel5.pdf")
                .swipeVertical(true)
                .load();

    }
}