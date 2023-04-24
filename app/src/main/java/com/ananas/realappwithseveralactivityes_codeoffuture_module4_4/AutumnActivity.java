package com.ananas.realappwithseveralactivityes_codeoffuture_module4_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class AutumnActivity extends AppCompatActivity {

    private ListView listView;

    private String[] arrAutumn = {"Пить чай", "Скорбеть о лете", "Ловить падующие листья"};

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autumn);

        listView = findViewById(R.id.list_autumn);
        textView = findViewById(R.id.textView3);


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrAutumn);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((adapterView, view, index, identification) -> {
            String str = arrAutumn[index];
            textView.setText(str + " – это хорошо!");
        });
    }
}