package com.example.uts_10118398;

//06-06-2021 - 10118398 - M Riffi Yusuf Hawarry - IF-9

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;




public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run () {

                Intent MainIntent =new Intent(SplashScreen.this, com.example.uts_10118398.MainActivity.class);

                startActivity(MainIntent);
                finish();
            }

        }, 2000);

    }
}