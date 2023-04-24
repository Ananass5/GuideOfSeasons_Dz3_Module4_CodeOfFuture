package com.ananas.realappwithseveralactivityes_codeoffuture_module4_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton spring, summer, autumn, winter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        spring = findViewById(R.id.spring);
        summer = findViewById(R.id.summer);
        autumn = findViewById(R.id.autumn);
        winter = findViewById(R.id.winter);

        spring.setOnClickListener(this);
        summer.setOnClickListener(this);
        autumn.setOnClickListener(this);
        winter.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.spring:
                Intent intentSpring = new Intent(getApplicationContext(), SpringActivity.class);
                startActivity(intentSpring);
                break;
            case R.id.summer:
                Intent intentSummer = new Intent(getApplicationContext(), SummerActivity.class);
                startActivity(intentSummer);
                break;
            case R.id.autumn:
                Intent intentAutumn = new Intent(getApplicationContext(), AutumnActivity.class);
                startActivity(intentAutumn);
                break;
            case R.id.winter:
                Intent intentWinter = new Intent(getApplicationContext(), WinterActivity.class);
                startActivity(intentWinter);
                break;
            default: break;

        }
    }
}