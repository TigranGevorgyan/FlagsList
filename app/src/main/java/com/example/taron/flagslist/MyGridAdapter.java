package com.example.taron.flagslist;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Taron on 05/05/17.
 */

public class MyGridAdapter extends BaseAdapter implements CompoundButton.OnCheckedChangeListener {

    List<Countries> list;
    private Context context;
    private LayoutInflater inflater;
    Countries obj;

    public MyGridAdapter(List<Countries> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        obj = list.get(position);
        View gridView = convertView;
        if (convertView == null){
            inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.item_grid,null);
        }

        ImageView imageView = (ImageView)gridView.findViewById(R.id.item_grid_image);
        TextView textView = (TextView)gridView.findViewById(R.id.item_grid_country_name);
        CheckBox checkBox = (CheckBox)gridView.findViewById(R.id.item_grid_checkbox);

        checkBox.setOnCheckedChangeListener(this);

        String toLowerCase = obj.getCode().toLowerCase();

        int id = context.getResources().getIdentifier("s_flag_" + toLowerCase,"drawable",context.getPackageName());
        if (id > 0)
            imageView.setImageResource(id);
        else imageView.setImageResource(R.drawable.flag_unknown);

        textView.setText(obj.getName());
        checkBox.setChecked(obj.isSelected());

        return gridView;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        obj.setSelected(isChecked);
    }
}
