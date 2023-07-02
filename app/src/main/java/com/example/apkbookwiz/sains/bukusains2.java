package com.example.apkbookwiz.sains;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apkbookwiz.R;
import com.joanzapata.pdfview.PDFView;

public class bukusains2 extends AppCompatActivity {
    private PDFView bukusains2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukusains2);
        bukusains2 = findViewById(R.id.sains2);

        bukusains2.fromAsset("sains2.pdf")
                .swipeVertical(true)
                .load();
    }
}