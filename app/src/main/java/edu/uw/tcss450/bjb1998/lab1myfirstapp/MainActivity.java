package edu.uw.tcss450.bjb1998.lab1myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("START", "starting...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w("RESUME", "Resuming...");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i("PAUSE", "Pausing...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("STOP", "Stopping...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("DESTROY", "Destroying...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}