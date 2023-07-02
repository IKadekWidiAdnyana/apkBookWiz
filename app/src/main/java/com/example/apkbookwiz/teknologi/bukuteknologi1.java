package com.example.apkbookwiz.teknologi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apkbookwiz.R;
import com.joanzapata.pdfview.PDFView;

public class bukuteknologi1 extends AppCompatActivity {
    private PDFView bukuteknologi1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukuteknologi1);
        bukuteknologi1= findViewById(R.id.mybook1);

        bukuteknologi1.fromAsset("teknologi1.pdf")
                .swipeVertical(true)
                .load();

    }
}