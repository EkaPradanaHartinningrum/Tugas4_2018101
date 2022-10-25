package com.example.tugas3_view;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void soeharto(View view) {
        Intent a = new Intent(MainActivity.this, soeharto.class);
        startActivity(a);
    }

    public void jokowi(View view) {
        Intent a = new Intent(MainActivity.this, jokowi.class);
        startActivity(a);
    }


    public void MainActivity(View view) {
    }
}