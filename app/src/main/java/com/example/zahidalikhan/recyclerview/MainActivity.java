package com.example.zahidalikhan.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Flag> Istflag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Istflag= new ArrayList<>();
        Istflag.add(new Flag ("Algeria",R.drawable.algeria));
        Istflag.add(new Flag ("Argentina",R.drawable.argentina));
        Istflag.add(new Flag ("Bangladesh",R.drawable.bangladesh));
        Istflag.add(new Flag ("Chile",R.drawable.chile));
        Istflag.add(new Flag ("Colombia",R.drawable.colombia));
        Istflag.add(new Flag ("England",R.drawable.england));
        Istflag.add(new Flag ("Indonesia",R.drawable.indonesia));
        Istflag.add(new Flag ("Ireland",R.drawable.ireland));
        Istflag.add(new Flag ("Malaysia",R.drawable.malaysia));
        Istflag.add(new Flag ("Nigeria",R.drawable.nigeria));
        Istflag.add(new Flag ("Pakistan",R.drawable.pakistan));
        Istflag.add(new Flag ("Romania",R.drawable.romania));

        RecyclerView rv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, Istflag);
        rv.setLayoutManager(new GridLayoutManager(this,3));
        rv.setAdapter(myAdapter);

    }
}
