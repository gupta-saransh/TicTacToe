package com.example.android.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

class SplashTimer extends Thread{

    SplashScreen welcome;

    SplashTimer(SplashScreen wel){
        welcome = wel;

    }


    public void run()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }   finally {

            Intent launchGame = new Intent(welcome,Game.class);
            welcome.startActivity(launchGame);


        }

    }


}
public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        SplashTimer splashTimer = new SplashTimer(this);
        splashTimer.start();
    }
}
