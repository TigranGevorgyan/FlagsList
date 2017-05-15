package com.example.taron.flagslist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Taron on 05/05/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private List<Countries> countriesList;
    Context context;

    public MyAdapter(List<Countries> countriesList, Context context) {
        this.countriesList = countriesList;
        this.context = context;
        Log.d("bag","MyAdapter constructor");
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("bag","onCreateViewHolder");
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_liner,parent,false);
        return new MyViewHolder(view,context);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Log.d("bag","onBindViewHolder");
        holder.bind(countriesList.get(position));
    }

    @Override
    public int getItemCount() {
        return countriesList.size();
    }
}
