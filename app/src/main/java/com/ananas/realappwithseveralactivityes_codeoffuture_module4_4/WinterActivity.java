package com.ananas.realappwithseveralactivityes_codeoffuture_module4_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class WinterActivity extends AppCompatActivity {
    private ListView listView;

    private String[] arrWinter = {"Играть в снежки", "Лепить снеговика", "Праздновать Новый год"};

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winter);

        listView = findViewById(R.id.list_winter);
        textView = findViewById(R.id.textView4);


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrWinter);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((adapterView, view, index, identification) -> {
            String str = arrWinter[index];
            textView.setText(str + " – это хорошо!");
        });
    }
}