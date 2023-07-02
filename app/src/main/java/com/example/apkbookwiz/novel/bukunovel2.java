package com.example.apkbookwiz.novel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apkbookwiz.R;
import com.joanzapata.pdfview.PDFView;

public class bukunovel2 extends AppCompatActivity {
    private PDFView bukunovel2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukunovel2);
        bukunovel2 = findViewById(R.id.bukunovel2);

        bukunovel2.fromAsset("novel2.pdf")
                .swipeVertical(true)
                .load();

    }
}