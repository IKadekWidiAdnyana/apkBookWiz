package com.example.apkbookwiz.novel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apkbookwiz.R;
import com.joanzapata.pdfview.PDFView;

public class bukunovel1 extends AppCompatActivity {
    private PDFView bukunovel1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukunovel1);
        bukunovel1 = findViewById(R.id.bukunovel1);

        bukunovel1.fromAsset("novel1.pdf")
                .swipeVertical(true)
                .load();
    }
}