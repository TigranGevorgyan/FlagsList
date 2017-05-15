package com.example.taron.flagslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button linerListButton;
    Button gridButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linerListButton = (Button)findViewById(R.id.act_liner_btn);
        gridButton = (Button)findViewById(R.id.act_grid_btn);

        linerListButton.setOnClickListener(this);
        gridButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.act_liner_btn:
                Intent intent = new Intent(this,LinerListActivity.class);
                startActivity(intent);
                break;
            case R.id.act_grid_btn:
                Intent intent1 = new Intent(this,GridActivity.class);
                startActivity(intent1);
                break;
        }
    }
}
