package com.ananas.realappwithseveralactivityes_codeoffuture_module4_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class SummerActivity extends AppCompatActivity {

    private ListView listView;

    private String[] arrSummer = {"Копать огород", "Ходить в баню", "Есть ягоды"};

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summer);

        listView = findViewById(R.id.list_summer);
        textView = findViewById(R.id.textView2);


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrSummer);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((adapterView, view, index, identification) -> {
            String str = arrSummer[index];
            textView.setText(str + " – это хорошо!");
        });
    }
}