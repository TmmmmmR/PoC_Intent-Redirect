package com.attacker.application;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AccessProviderActivity extends AppCompatActivity {

    private static final String TAG = "AccessProviderActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "AccessProviderActivity.onCreate() — ENTER");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_provider);
        String file = "files/docs/readme.txt";
        InputStream is = null;
        try {
            is = getContentResolver().openInputStream(Uri.parse(getIntent().getDataString() + file));
            Log.i(TAG, "AccessProviderActivity.onCreate() — DONE !");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line = "";
        while (true) {
            try {
                if (!((line = br.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            sb.append(line);
        }
        Log.i(TAG, "AccessProviderActivity.onCreate() — EXIT [RETURN = " + sb + "]:");
    }
}