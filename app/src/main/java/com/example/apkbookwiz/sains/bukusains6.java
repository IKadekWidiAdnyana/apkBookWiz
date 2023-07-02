package com.example.apkbookwiz.sains;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apkbookwiz.R;
import com.joanzapata.pdfview.PDFView;

public class bukusains6 extends AppCompatActivity {
    private PDFView bukusains6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukusains6);
        bukusains6 = findViewById(R.id.sains6);

        bukusains6.fromAsset("sains6.pdf")
                .swipeVertical(true)
                .load();
    }
}