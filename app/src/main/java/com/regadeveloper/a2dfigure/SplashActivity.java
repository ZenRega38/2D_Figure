package com.regadeveloper.a2dfigure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {
    private final int SPLASH_DELAYED = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent moveMain = new Intent(SplashActivity.this, MainMenu.class);
                startActivity(moveMain);
                finish();
            }
        }, SPLASH_DELAYED);
    }
}
