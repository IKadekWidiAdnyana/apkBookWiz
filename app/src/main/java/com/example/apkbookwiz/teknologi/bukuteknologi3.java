package com.example.apkbookwiz.teknologi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apkbookwiz.R;
import com.joanzapata.pdfview.PDFView;

public class bukuteknologi3 extends AppCompatActivity {
    private PDFView bukuteknologi3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukuteknologi3);
        bukuteknologi3= findViewById(R.id.teknologi3);

        bukuteknologi3.fromAsset("teknologi3.pdf")
                .swipeVertical(true)
                .load();
    }
}