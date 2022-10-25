package com.example.tugas3_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class soeharto extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soeharto);
    }
    public void jokowi(View view) {
        Intent a = new Intent(soeharto.this, jokowi.class);
        startActivity(a);
    }

    public void MainActivity (View view) {
        Intent a = new Intent(soeharto.this, MainActivity.class);
        startActivity(a);
    }
}