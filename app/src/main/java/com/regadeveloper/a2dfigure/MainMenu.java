package com.regadeveloper.a2dfigure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rumuspersegi(View view){
        Intent intent= new Intent(MainMenu.this,LuasPersegi.class);
        startActivity(intent);
    }
    public void rumuslingkaran(View view){
        Intent intent=new Intent(MainMenu.this,LuasLingkaran.class);
        startActivity(intent);
    }
    public void rumussegitiga(View view){
        Intent intent=new Intent(MainMenu.this,LuasSegitiga.class);
        startActivity(intent);
    }
}
