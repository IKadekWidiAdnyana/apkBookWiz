package com.example.apkbookwiz.novel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apkbookwiz.R;
import com.joanzapata.pdfview.PDFView;

public class bukunovel4 extends AppCompatActivity {
    private PDFView bukunovel4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukunovel4);
        bukunovel4 = findViewById(R.id.bukunovel4);

        bukunovel4.fromAsset("novel4.pdf")
                .swipeVertical(true)
                .load();
    }
}