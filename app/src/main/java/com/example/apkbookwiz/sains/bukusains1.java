package com.example.apkbookwiz.sains;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apkbookwiz.R;
import com.joanzapata.pdfview.PDFView;

public class bukusains1 extends AppCompatActivity {
    private PDFView bukusains1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukusains1);
        bukusains1 = findViewById(R.id.sains1);

        bukusains1.fromAsset("sains1.pdf")
                .swipeVertical(true)
                .load();

    }
}