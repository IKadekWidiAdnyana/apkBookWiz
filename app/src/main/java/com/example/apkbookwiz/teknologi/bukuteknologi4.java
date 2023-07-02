package com.example.apkbookwiz.teknologi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apkbookwiz.R;
import com.joanzapata.pdfview.PDFView;

public class bukuteknologi4 extends AppCompatActivity {
    private PDFView bukuteknologi4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukuteknologi4);
        bukuteknologi4= findViewById(R.id.teknologi4);

        bukuteknologi4.fromAsset("teknologi4.pdf")
                .swipeVertical(true)
                .load();
    }
}