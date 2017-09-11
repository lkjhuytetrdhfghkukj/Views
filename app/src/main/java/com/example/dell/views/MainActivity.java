package com.example.dell.views;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private Custom histogram_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        ArrayList<Custom.Bar> barLists = new ArrayList<Custom.Bar>();
        for(int i=0; i<5; i++){
            float ratio = (float) Math.random();
            int color = (int) (Color.GRAY * ratio);
            Custom.Bar bar=new Custom.Bar(i, ratio, color, " ", "");
            //  Bar bar = histogram_view.new Bar();
            barLists.add(bar);
        }
        histogram_view.setBarLists(barLists);
    }

    private void initView() {
        histogram_view = (Custom) findViewById(R.id.histogram_view);
    }
}
