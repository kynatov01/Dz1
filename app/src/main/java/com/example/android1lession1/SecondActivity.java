package com.example.android1lession1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        image = findViewById(R.id.image);

        Bundle argument = getIntent().getExtras();
        String text = argument.getString("text");

        if (argument.isEmpty()) {
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();

        }
        switch (text) {
            case "WhatsApp":
                image.setImageResource(R.drawable.img_2);
                break;

            case "YouTube":
                image.setImageResource(R.drawable.img_1);
                break;

            case "Google":
                image.setImageResource(R.drawable.img_3);
                break;
        }
    }

}