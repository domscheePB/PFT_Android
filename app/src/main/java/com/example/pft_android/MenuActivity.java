package com.example.pft_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void metodoCerrarSesion (View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}