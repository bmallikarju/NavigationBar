package com.example.coffee.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coffee.Cart;
import com.example.coffee.R;
import com.example.coffee.model.CartModel;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {

    List<CartModel>  cartModelList;

    public CartAdapter(List<CartModel> cartModelList) {
        this.cartModelList = cartModelList;
    }

    @NonNull
    @Override
    public CartAdapter.CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_item,parent,false);
        return new CartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartAdapter.CartViewHolder holder, int position) {
        CartModel cartModel = cartModelList.get(position);

        holder.name.setText(cartModel.getName());
        holder.desc.setText(cartModel.getDesc());
        holder.price.setText(cartModel.getPrice());
        holder.imageView.setImageResource(cartModel.getImage());
    }

    @Override
    public int getItemCount() {
        return cartModelList.size();
    }

    public static class CartViewHolder extends RecyclerView.ViewHolder {
        TextView name,price,desc;
        ImageView imageView;
        public CartViewHolder(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.name1);
            desc=itemView.findViewById(R.id.desc);
            price=itemView.findViewById(R.id.price);
            imageView=itemView.findViewById(R.id.image1);

        }
    }
}
