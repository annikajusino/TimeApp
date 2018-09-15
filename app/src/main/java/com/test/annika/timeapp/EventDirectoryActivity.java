package com.test.annika.timeapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class EventDirectoryActivity extends AppCompatActivity {

    private RecyclerView ListingsRecycler;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_directory);
        ListingsRecycler = findViewById(R.id.rvListings);

        Listing[] myDataset = new Listing[2];

        myDataset[0] = new Listing();
        myDataset[1] = new Listing();


        myDataset[0].setName("My house");
        myDataset[1].setName("Your house");


        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        ListingsRecycler.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        ListingsRecycler.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new ListingAdapter(myDataset);
        ListingsRecycler.setAdapter(mAdapter);
    }
    // ...
}