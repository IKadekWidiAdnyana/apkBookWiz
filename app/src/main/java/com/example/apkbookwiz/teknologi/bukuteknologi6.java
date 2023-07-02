package com.example.apkbookwiz.teknologi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apkbookwiz.R;
import com.joanzapata.pdfview.PDFView;

public class bukuteknologi6 extends AppCompatActivity {
    private PDFView bukuteknologi6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukuteknologi6);
        bukuteknologi6= findViewById(R.id.teknologi6);

        bukuteknologi6.fromAsset("teknologi6.pdf")
                .swipeVertical(true)
                .load();
    }
}