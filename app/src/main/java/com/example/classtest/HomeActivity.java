package com.example.classtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        String[] names = {"Jay ","Raj", "Shayam", "Lucky"};
        int index = new Random().nextInt(names.length);
        String name = names[index];
        Toast.makeText(this, name,
                Toast.LENGTH_LONG).show();
        TextView t = findViewById(R.id.text_header);
        t.setText(name);
    }

    public void goBack(View view) {
        Intent i2 = new Intent(this, MainActivity.class);
        startActivity(i2);

    }
}