package com.example.myapp.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

     String[] food ={"Veg Grill Sandwich", "Paneer Cheese Sandwich", "Veg Cheese Sandwich",
             "Veg Mayo Sandwich", "Corn Cheese Sandwich", "Corn Spinach Sandwich","Paneer Corn Sandwich",
             "Omelette", "Veg Maggi", "Egg Maggi","Watermelon Juice","Lemon Juice"};
     
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, food);

        listView.setAdapter(adapter);
    }
}
