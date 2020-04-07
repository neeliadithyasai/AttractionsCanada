package com.example.AttractionsCanada.Ui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.view.WindowManager;

import com.example.countrylistrecyclerview.R;

public class splashScreenAcitivity extends AppCompatActivity {

    private static int SPLASH_SCREEN_TIME_OUT=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen_acitivity);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(splashScreenAcitivity.this,
                        AttractionListActivity.class);

                startActivity(i);


                finish();

            }
        }, SPLASH_SCREEN_TIME_OUT);
    }
}