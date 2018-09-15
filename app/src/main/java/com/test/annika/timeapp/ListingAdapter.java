package com.test.annika.timeapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ListingAdapter extends RecyclerView.Adapter<ListingAdapter.ListingViewHolder> {
    private Listing[] mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ListingViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mEventName;
        
        
        public ListingViewHolder(View v) {
            super(v);
            mEventName = itemView.findViewById(R.id.tvEventName);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public ListingAdapter(Listing[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ListingAdapter.ListingViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ListingViewHolder vh = new ListingViewHolder(inflater.inflate(R.layout.item_listing, parent, false));

        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ListingViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.mEventName.setText(mDataset[position].getName());

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}