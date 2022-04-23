package com.example.a10119273_aldi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void pindahRegister(View view) {
        Intent intent = new Intent(login.this,register.class);
        startActivity(intent);
    }


    public void pindahDashboard(View view) {
        Intent intent = new Intent(login.this,dashboard.class);
        startActivity(intent);
    }
}