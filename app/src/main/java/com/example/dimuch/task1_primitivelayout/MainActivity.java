package com.example.dimuch.task1_primitivelayout;

import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitleAppBar(R.string.application_name);
        setIconAppBar(R.drawable.vk_logo);

        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.main_activity);
        layout.setOnTouchListener(new OnSwipeTouchListener(MainActivity.this) {
            public void onSwipeLeft() {
                Toast.makeText(MainActivity.this, "left", Toast.LENGTH_SHORT).show();
                openProfile();
            }
        });

    }

    public void openProfile() {
        Intent intent = new Intent(this, PrimitiveLayout.class);
        int iIdPerson = 0;
        intent.putExtra(EXTRA_MESSAGE, iIdPerson);
        startActivity(intent);
    }

    public void setTitleAppBar(@StringRes int resId) {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle(resId);
        }
    }

    public void setIconAppBar(@DrawableRes int resId) {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowHomeEnabled(true);
            actionBar.setIcon(resId);
        }
    }

}
