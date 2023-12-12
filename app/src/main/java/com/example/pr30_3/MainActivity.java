package com.example.pr30_3;


import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickStart(View v) {
        Intent serviceIntent = new Intent("com.example.pr_30srv.MyService");
        startService(serviceIntent);

        //startService(new Intent("com.example.pr_30srv;").putExtra("name", "value"));
    }
}