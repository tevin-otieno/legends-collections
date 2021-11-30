package com.example.legends_collections;

import android.content.Context;
import android.widget.ArrayAdapter;

public class CollectionsListAdapter extends ArrayAdapter {
    private String[] clothes;

    public CollectionsListAdapter(Context context, int resource, String[] clothes) {
        super(context, resource);
        this.clothes = clothes;
    }

    @Override
    public Object getItem(int position){
        String product = clothes[position];
        return String.format("cloth selected is", product);
    }
}
