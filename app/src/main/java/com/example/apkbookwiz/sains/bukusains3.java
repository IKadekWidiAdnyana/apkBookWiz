package com.example.apkbookwiz.sains;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apkbookwiz.R;
import com.joanzapata.pdfview.PDFView;

public class bukusains3 extends AppCompatActivity {
    private PDFView bukusains3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukusains3);
        bukusains3 = findViewById(R.id.sains3);

        bukusains3.fromAsset("sains3.pdf")
                .swipeVertical(true)
                .load();

    }
}