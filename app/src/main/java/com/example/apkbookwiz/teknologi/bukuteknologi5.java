package com.example.apkbookwiz.teknologi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apkbookwiz.R;
import com.joanzapata.pdfview.PDFView;

public class bukuteknologi5 extends AppCompatActivity {
    private PDFView bukuteknologi5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukuteknologi5);

        bukuteknologi5= findViewById(R.id.teknologi5);

        bukuteknologi5.fromAsset("teknologi5.pdf")
                .swipeVertical(true)
                .load();
    }
}