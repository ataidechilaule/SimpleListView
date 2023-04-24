package com.ataide.simplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.widget.ArrayAdapter;

import com.ataide.simplelistview.databinding.ActivityListViewBinding;
import com.ataide.simplelistview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    String lista [] = {"Banana", "Maça", "Pera"};

    private ActivityMainBinding mainBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());


        //Contexto, Layout, TextView, Lista
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, R.layout.activity_list_view, R.id.textView,
                        lista);

        mainBinding.listView.setAdapter(arrayAdapter);
    }
}