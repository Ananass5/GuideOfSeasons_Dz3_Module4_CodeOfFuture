package com.ananas.realappwithseveralactivityes_codeoffuture_module4_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private List<Season> seasonList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.recyclerSeason);
        SeasonAdapter adapter = new SeasonAdapter(seasonList, this);

        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        seasonList = new ArrayList<>();

        seasonList.add(new Season("Январь", "Холодный зимный месяц", R.drawable.winter));
        seasonList.add(new Season("Март", "Тоже холодно, но теплее", R.drawable.img));
        seasonList.add(new Season("Апрель", "Весна пришла", R.drawable.spring));
        seasonList.add(new Season("Май", "Прям очень тепло", R.drawable.img_1));
        seasonList.add(new Season("Июнь", "Лето началось", R.drawable.img_2));
        seasonList.add(new Season("Июль", "Весьма жарко", R.drawable.summer));
        seasonList.add(new Season("Август", "Скоро осень", R.drawable.img_3));
        seasonList.add(new Season("Октябрь", "Листочки опадают( ", R.drawable.autumn));

    }


}