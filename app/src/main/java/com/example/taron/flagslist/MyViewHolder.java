package com.example.taron.flagslist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Taron on 05/05/17.
 */
public class MyViewHolder extends RecyclerView.ViewHolder implements CompoundButton.OnCheckedChangeListener {

    Context context;
    ImageView linerListImage;
    TextView linerListCountryName;
    CheckBox linerListCountryCheckBox;
    Countries countryObj;

    public MyViewHolder(View itemView, Context context) {
        super(itemView);
        Log.d("bag","MyViewHolder constructot");
        this.context = context;
        linerListImage = (ImageView)itemView.findViewById(R.id.item_liner_image);
        linerListCountryName = (TextView)itemView.findViewById(R.id.item_country_name);
        linerListCountryCheckBox = (CheckBox)itemView.findViewById(R.id.item_liner_cheackbox);

        linerListCountryCheckBox.setOnCheckedChangeListener(this);
    }


    public void bind(Countries countries) {
        this.countryObj = countries;
        String toLowerCase = countries.getCode().toLowerCase();
        int id = context.getResources().getIdentifier("flag_" + toLowerCase,"drawable",context.getPackageName());
        if (id > 0){
            linerListImage.setImageResource(id);
        }
        else linerListImage.setImageResource(R.drawable.flag_transparent);

        linerListCountryName.setText(countries.getName());

        linerListCountryCheckBox.setChecked(countries.isSelected());

        Log.d("bag","MyViewHolder bind");

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        countryObj.setSelected(isChecked);
    }
}
