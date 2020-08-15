package com.example.carapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TypeSelectActivity extends AppCompatActivity {
    public static final String EXTRA_DOOR = "com.example.carapp.DOOR";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_select);
    }


    /** Called when the user taps the 2Door button */
    public void twoDoor(View view) {
        Intent intent = new Intent(this, MakerSelectActivity.class);
        String message = "2";
        intent.putExtra(EXTRA_DOOR, message);
        startActivity(intent);
    }



    /** Called when the user taps the 4Door button */
    public void fourDoor(View view) {
        Intent intent = new Intent(this, MakerSelectActivity.class);
        String message = "4";
        intent.putExtra(EXTRA_DOOR, message);
        startActivity(intent);
    }

    /** Called when the user taps the SUV button */
    public void suvDoor(View view) {
        Intent intent = new Intent(this, MakerSelectActivity.class);
        String message = "S";
        intent.putExtra(EXTRA_DOOR, message);
        startActivity(intent);
    }
}