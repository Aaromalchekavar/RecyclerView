package com.btechbuddy.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mrecyclerview;
    ArrayList<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mrecyclerview = findViewById(R.id.mrecyclerview);


        data.add("India");
        data.add("USA");
        data.add("Russia");
        data.add("Canada");
        data.add("2India");
        data.add("2USA");
        data.add("2Russia");
        data.add("2Canada");
        data.add("3India");
        data.add("3USA");
        data.add("3Russia");
        data.add("3Canada");


        mrecyclerview.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
        AdapterNames myadapter = new AdapterNames(data);
        mrecyclerview.setAdapter(myadapter);
    }
}