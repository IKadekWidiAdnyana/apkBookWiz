package com.example.apkbookwiz.sains;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apkbookwiz.R;
import com.joanzapata.pdfview.PDFView;

public class bukusains4 extends AppCompatActivity {
    private PDFView bukusains4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukusains4);
        bukusains4 = findViewById(R.id.sains4);

        bukusains4.fromAsset("sains4.pdf")
                .swipeVertical(true)
                .load();

    }
}