package com.example.taron.flagslist;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class GridActivity extends AppCompatActivity {

    GridView gridView;
    List<Countries> countriesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        countriesList = new ArrayList<>();

        takeCountries();

        Intent intent = getIntent();

        gridView = (GridView)findViewById(R.id.grid_view);

        MyGridAdapter adapter = new MyGridAdapter(countriesList,this);

        gridView.setAdapter(adapter);
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
