package com.example.a10119273_aldi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void pindahProfil(View view) {
        Intent intent = new Intent(dashboard.this,detailProfile.class);
        startActivity(intent);
    }



}