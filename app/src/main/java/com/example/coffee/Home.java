package com.example.coffee;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.coffee.adapter.MyCustomAdapter;
import com.example.coffee.model.Model;

import java.util.ArrayList;
import java.util.List;


public class Home extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        GridView gridView = view.findViewById(R.id.grid_view1);
        List<Model> modelList = new ArrayList<>();

        Model model = new Model(R.drawable.cafe1,"4","cafe","99");
        Model model1 = new Model(R.drawable.cafe1,"4","cafe","99");
        Model model2 = new Model(R.drawable.cafe1,"4","cafe","99");
        Model model3 = new Model(R.drawable.cafe1,"4","cafe","99");
        Model model4 = new Model(R.drawable.cafe1,"4","cafe","99");
        Model model5 = new Model(R.drawable.cafe1,"4","cafe","99");


        modelList.add(model);
        modelList.add(model1);
        modelList.add(model2);
        modelList.add(model3);
        modelList.add(model4);
        modelList.add(model5);

        MyCustomAdapter myCustomAdapter = new MyCustomAdapter(modelList,getContext());
        gridView.setAdapter(myCustomAdapter);

        return view;


    }

}