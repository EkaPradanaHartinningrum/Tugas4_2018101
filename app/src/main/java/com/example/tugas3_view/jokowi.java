package com.example.tugas3_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class jokowi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokowi);
    }
    public void MainActivity (View view) {
        Intent a = new Intent(jokowi.this, MainActivity.class);
        startActivity(a);
    }

    public void soeharto (View view) {
        Intent a = new Intent(jokowi.this, soeharto.class);
        startActivity(a);
    }
}