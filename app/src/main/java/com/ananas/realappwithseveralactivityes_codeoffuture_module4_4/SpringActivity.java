package com.ananas.realappwithseveralactivityes_codeoffuture_module4_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class SpringActivity extends AppCompatActivity {

    private ListView listView;

    private String[] arrSpring = {"Убираться на улице", "Загорать", "Просыпаться"};

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spring);

        listView = findViewById(R.id.list_spring);
        textView = findViewById(R.id.textView1);


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrSpring);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((adapterView, view, index, identification) -> {
            String str = arrSpring[index];
            textView.setText(str + " – это хорошо!");
        });
    }

    
}