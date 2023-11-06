package com.example.coffee;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.coffee.adapter.CartAdapter;
import com.example.coffee.model.CartModel;

import java.util.ArrayList;
import java.util.List;

public class Cart extends Fragment {
    List<CartModel> cartModelList;
    RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cart,container,false);

        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));



        cartModelList=new ArrayList<>();

        CartModel cartModel = new CartModel("coffee","999","Enjoy the day",R.drawable.cafe1);
        CartModel cartModel1 = new CartModel("coffee","999","Enjoy the day",R.drawable.cafe);
        CartModel cartModel2 = new CartModel("coffee","999","Enjoy the day",R.drawable.cafe2);
        CartModel cartModel3 = new CartModel("coffee","999","Enjoy the day",R.drawable.cafe3);
        CartModel cartModel4 = new CartModel("coffee","999","Enjoy the day",R.drawable.cafe4);
        CartModel cartModel5 = new CartModel("coffee","999","Enjoy the day",R.drawable.cafe5);
        CartModel cartModel6 = new CartModel("coffee","999","Enjoy the day",R.drawable.cafe1);

        cartModelList.add(cartModel);
        cartModelList.add(cartModel1);
        cartModelList.add(cartModel2);
        cartModelList.add(cartModel3);
        cartModelList.add(cartModel4);
        cartModelList.add(cartModel5);
        cartModelList.add(cartModel6);

        CartAdapter cartAdapter = new CartAdapter(cartModelList);
        recyclerView.setAdapter(cartAdapter);
        return view;


    }

    ItemTouchHelper.SimpleCallback simpleCallback = new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT|ItemTouchHelper.RIGHT) {
        @Override
        public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
            return false;
        }

        @Override
        public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {

        }
    };
}