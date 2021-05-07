package com.example.tablet.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tablet.Models.MenuModel;
import com.example.tablet.Models.ProductModel;
import com.example.tablet.R;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolders> {
    ArrayList<ProductModel> data;
    Context ctx;

    public ProductAdapter(ArrayList<ProductModel> data, Context ctx) {
        this.data = data;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ViewHolders onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_box, parent, false);
        return new ProductAdapter.ViewHolders(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolders holder, int position) {

        Glide.with(ctx).load(data.get(position).getImg()).into(holder.img);
        holder.name.setText(data.get(position).getName());
        holder.description.setText(data.get(position).getDescription());
        holder.price.setText(String.valueOf(data.get(position).getPrice() + " Pkr"));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public class ViewHolders extends RecyclerView.ViewHolder {
        ImageView img;
        TextView name, price, description;

        public ViewHolders(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.product_img);
            name = itemView.findViewById(R.id.product_name);
            price = itemView.findViewById(R.id.product_price);
            description = itemView.findViewById(R.id.product_description);
        }
    }
}
