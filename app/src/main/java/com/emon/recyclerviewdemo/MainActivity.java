package com.emon.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.emon.recyclerviewdemo.adapter.MyAdapter;
import com.emon.recyclerviewdemo.model.Model;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView textView1,textView2;
    private RecyclerView recyclerView;
    private MyAdapter mAdapter;
    List<Model> models=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);
        // recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),models));
        data();
    }

    private void data() {
        models.add(new Model("Muhammad","Emon"));
        models.add(new Model("emon","hosen"));
    }
}
