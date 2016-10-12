package com.example.myapp.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Button;

public class second extends AppCompatActivity {
    private Button _decrease;
    private Button _increase;
    private TextView _value;
    private TextView _total;
    private static int _counter = 0;
    private String _stringVal;
    private String _stringVal2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        _decrease = (Button) findViewById(R.id.decrease);
        _increase = (Button) findViewById(R.id.increase);
        _value = (TextView) findViewById(R.id.quantity_text_view);
        _total = (TextView) findViewById(R.id.price_text_view);

        _decrease.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Log.d("src", "Decreasing value...");
                if (_counter > 0)
                    _counter--;
                _stringVal2 = Integer.toString(25* _counter);
                _stringVal = Integer.toString(_counter);
                _value.setText(_stringVal);
                _total.setText(_stringVal2);
            }

        });
        _increase.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Log.d("src", "Increasing value...");
                _counter++;
                _stringVal2 = Integer.toString(25* _counter);
                _stringVal = Integer.toString(_counter);
                _value.setText(_stringVal);
                _total.setText(_stringVal2);
            }
        });





}
}
