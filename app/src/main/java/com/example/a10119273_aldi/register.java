package com.example.a10119273_aldi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }



    public void pindahLogin(View view) {
        Intent intent = new  Intent (register.this,login.class);
        startActivity(intent);
    }
}