package com.example.apkbookwiz.novel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apkbookwiz.R;
import com.joanzapata.pdfview.PDFView;

public class bukunovel6 extends AppCompatActivity {
    private PDFView bukunovel6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukunovel6);
        bukunovel6 = findViewById(R.id.bukunovel6);

        bukunovel6.fromAsset("novel6.pdf")
                .swipeVertical(true)
                .load();

    }
}