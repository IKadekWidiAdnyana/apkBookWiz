package com.example.apkbookwiz.sains;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apkbookwiz.R;
import com.joanzapata.pdfview.PDFView;

public class bukusains5 extends AppCompatActivity {
    private PDFView bukusains5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukusains5);
        bukusains5 = findViewById(R.id.sains5);

        bukusains5.fromAsset("sains5.pdf")
                .swipeVertical(true)
                .load();

    }
}