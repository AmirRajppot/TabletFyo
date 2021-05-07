package com.example.tablet.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.TextView;

import com.example.tablet.Adapter.CartApadter;
import com.example.tablet.Adapter.MenuAdapter;
import com.example.tablet.Adapter.ProductAdapter;
import com.example.tablet.Models.CartModel;
import com.example.tablet.Models.MenuModel;
import com.example.tablet.Models.ProductModel;
import com.example.tablet.R;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    TextView category_title, famous_title, deal_title;
    RecyclerView menu_recyclerView, product_recyclerView, cart_recyclerView;
    ProductAdapter productAdapter;
    MenuAdapter menuAdapter;
    CartApadter cartApadter;
    String user_id;
    SharedPreferences preferences;

    private final ArrayList<ProductModel> productModels = new ArrayList<>();
    private final ArrayList<MenuModel> menuModels = new ArrayList<>();
    private final ArrayList<CartModel> cartModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        menu_recyclerView = findViewById(R.id.menu_rv);
        product_recyclerView = findViewById(R.id.product_rv);
        cart_recyclerView = findViewById(R.id.cart_rv);
        //menu
        menuModels.add(new MenuModel(1, R.drawable.pexels, "Lissa"));
        menuModels.add(new MenuModel(1, R.drawable.pexels, "Lissa"));
        menuModels.add(new MenuModel(1, R.drawable.pexels, "Lissa"));
        menuModels.add(new MenuModel(1, R.drawable.pexels, "Lissa"));
        menuModels.add(new MenuModel(1, R.drawable.pexels, "Lissa"));
        menuAdapter = new MenuAdapter(menuModels, Home.this);
        menu_recyclerView.setLayoutManager(new LinearLayoutManager(Home.this, LinearLayoutManager.HORIZONTAL, false));
        menu_recyclerView.setAdapter(menuAdapter);
        //product
        productModels.add(new ProductModel(1, 100000000, R.drawable.pexels, "Food substance consisting essentially  and other nutrients used in the body of an organism to sustain growth and vital processes and to furnish energy", "Pizza"));
        productModels.add(new ProductModel(1, 100000000, R.drawable.pexels, "Food substance consisting essentially  and other nutrients used in the body of an organism to sustain growth and vital processes and to furnish energy", "Pizza"));
        productModels.add(new ProductModel(1, 100000000, R.drawable.pexels, "Food substance consisting essentially  and other nutrients used in the body of an organism to sustain growth and vital processes and to furnish energy", "Pizza"));
        productModels.add(new ProductModel(1, 100000000, R.drawable.pexels, "Food substance consisting essentially  and other nutrients used in the body of an organism to sustain growth and vital processes and to furnish energy", "Pizza"));
        productModels.add(new ProductModel(1, 100000000, R.drawable.pexels, "Food substance consisting essentially  and other nutrients used in the body of an organism to sustain growth and vital processes and to furnish energy", "Pizza"));
        productAdapter = new ProductAdapter(productModels, Home.this);
        product_recyclerView.setLayoutManager(new LinearLayoutManager(Home.this, GridLayoutManager.VERTICAL,true));
        product_recyclerView.setAdapter(productAdapter);
    }
}