package ru.blago.a001_test_24_02_2017;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, NextActivity.class);
        startActivity(intent);
    }
}