package com.example.taron.flagslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class LinerListActivity extends AppCompatActivity {

    private List<Countries> countriesList;

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liner_list);

        countriesList = new ArrayList<>();

        Intent intent = getIntent();

        takeCountries();

        recyclerView = (RecyclerView)findViewById(R.id.act_recycle_view);

        layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new MyAdapter(countriesList,this);
        recyclerView.setAdapter(adapter);

    }

    public void takeCountries(){
        countriesList.add(new Countries("Armenia",false,"AM"));
        countriesList.add(new Countries("Austria",false,"AT"));
        countriesList.add(new Countries("Angola",false,"AD"));
        countriesList.add(new Countries("Brazil",false,"BR"));
        countriesList.add(new Countries("Azerbaijan",false,"AZ"));
        countriesList.add(new Countries("Belarus",false,"BY"));
        countriesList.add(new Countries("Canada",false,"CA"));
        countriesList.add(new Countries("Cuba",false,"CU"));
        countriesList.add(new Countries("France",false,"FR"));
        countriesList.add(new Countries("Georgia",false,"GE"));
        countriesList.add(new Countries("Aruba",false,"AW"));
        countriesList.add(new Countries("China",false,"CN"));
        countriesList.add(new Countries("Egypt",false,"EG"));
        countriesList.add(new Countries("Spain",false,"ES"));
        countriesList.add(new Countries("Ethiopia",false,"ET"));
        countriesList.add(new Countries("Finland",false,"FI"));
    }
}
