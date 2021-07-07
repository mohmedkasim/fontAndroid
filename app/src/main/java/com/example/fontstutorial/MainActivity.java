package com.example.fontstutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textHello;
    private Button changeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textHello = findViewById(R.id.textHello);
        changeText = findViewById(R.id.buttonChange);

        final Typeface typeface = ResourcesCompat.getFont(this,R.font.amarante);

        changeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textHello.setTypeface(typeface);
            }
        });
    }
}