package com.example.coffee.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.coffee.R;
import com.example.coffee.model.Model;

import java.util.List;

public class MyCustomAdapter extends BaseAdapter {

    List<Model> modelList;
    Context context;

    public MyCustomAdapter(List<Model> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public Object getItem(int position) {
        return modelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            LayoutInflater inflater;
            inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.item_list,parent,false);
        }

        Model model = modelList.get(position);

        ImageView imageView = convertView.findViewById(R.id.image);
        TextView ratingTextView = convertView.findViewById(R.id.rating);
        TextView nameTextView = convertView.findViewById(R.id.name);
        TextView priceTextView = convertView.findViewById(R.id.price);

        imageView.setImageResource(model.getImage());
        ratingTextView.setText(model.getRating());
        nameTextView.setText(model.getName());
        priceTextView.setText(model.getPrice());

        return convertView;
    }

}
