package com.example.zw896.histeqimage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.net.Uri;

import java.io.File;

import static android.content.ContentValues.TAG;

public class MainActivity extends Activity {
    private static final int READ_REQUEST_CODE = 42;



    public void findImg(View view){

        Intent intent = new Intent();

        intent.setAction(Intent.ACTION_GET_CONTENT);
        intent.setType("audio/wav");



        intent.addCategory(Intent.CATEGORY_OPENABLE);

        startActivityForResult(intent, 1);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
