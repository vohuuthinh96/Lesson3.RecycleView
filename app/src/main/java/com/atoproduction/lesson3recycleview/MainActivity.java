package com.atoproduction.lesson3recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ContactAdapter mAdapter;
    private ArrayList<Contact> mContactArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler);
        mContactArrayList = new ArrayList<>();
        mContactArrayList.add(new Contact("Vo Huu Thinh","0962890153"));
        mContactArrayList.add(new Contact("Tran Van To","0398477967"));
        mContactArrayList.add(new Contact("Nguyen thi Huyen","0398477967"));
        mContactArrayList.add(new Contact("Dao Tuan ANh","0398477967"));
        mContactArrayList.add(new Contact("Le Hung Anh","0398477967"));
        mContactArrayList.add(new Contact("Nguyen Tuan Nghia","0398477967"));
        mContactArrayList.add(new Contact("Vo Huu Thinh","0962890153"));
        mContactArrayList.add(new Contact("Tran Van To","0398477967"));
        mContactArrayList.add(new Contact("Nguyen thi Huyen","0398477967"));
        mContactArrayList.add(new Contact("Dao Tuan ANh","0398477967"));
        mContactArrayList.add(new Contact("Le Hung Anh","0398477967"));
        mContactArrayList.add(new Contact("Nguyen Tuan Nghia","0398477967"));

        mAdapter = new ContactAdapter(this, mContactArrayList);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mAdapter);
    }
}