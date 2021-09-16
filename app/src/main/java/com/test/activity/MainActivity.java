package com.test.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // クリック処理
    public void onButton_Next( View v){
        Intent intent = new Intent(this,Setting.class); // 画面指定
        startActivity(intent);                                     //  画面を開く
    }
}