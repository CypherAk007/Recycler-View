package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //9
        RecyclerView programingList = (RecyclerView) findViewById(R.id.programmingList);
        //10 make adapter

        //11 set layout manager
        programingList.setLayoutManager(new LinearLayoutManager(this));

        //4set adapter- we have to send data to adapter that we want to show
        String [] languages = {"java","c","python","c++","java","c","python","c++","java","c","python","c++"};
        programingList.setAdapter(new ProgrammingAdapter(languages));

    }
}