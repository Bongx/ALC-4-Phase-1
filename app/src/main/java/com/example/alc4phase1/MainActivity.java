package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static String LOG_TAG=MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchProfileActivity(View view) {
       Log.d(LOG_TAG,"Button Profile Clicked");
        Intent intent= new Intent(this,MyProfile.class);
        startActivity(intent);
    }

    public void launchAboutActivity(View view) {
        Log.d(LOG_TAG,"Button Profile Clicked");
        Intent intent= new Intent(this,AboutALC.class);
        startActivity(intent);
    }
}
