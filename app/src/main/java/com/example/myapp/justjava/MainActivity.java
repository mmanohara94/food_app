package com.example.myapp.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     String[] food ={"Veg Grill Sandwich", "Paneer Cheese Sandwich", "Veg Cheese Sandwich",
             "Veg Mayo Sandwich", "Corn Cheese Sandwich", "Corn Spinach Sandwich","Paneer Corn Sandwich",
             "Omelette", "Veg Maggi", "Egg Maggi","Watermelon Juice","Lemon Juice", "Kiwi Juice"};
     
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, food);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String foods = (String)adapterView.getItemAtPosition(i);
                 Toast.makeText(view.getContext(),""+foods+ " is available", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
