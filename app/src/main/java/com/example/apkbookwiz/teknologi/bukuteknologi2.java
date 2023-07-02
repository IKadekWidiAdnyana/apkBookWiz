package com.example.apkbookwiz.teknologi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apkbookwiz.R;
import com.joanzapata.pdfview.PDFView;

public class bukuteknologi2 extends AppCompatActivity {

    private PDFView bukuteknologi2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukuteknologi2);
        bukuteknologi2= findViewById(R.id.teknologi2);

        bukuteknologi2.fromAsset("teknologi2.pdf")
                .swipeVertical(true)
                .load();
    }
}