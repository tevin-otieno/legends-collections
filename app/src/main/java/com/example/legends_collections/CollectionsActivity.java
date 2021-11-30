package com.example.legends_collections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CollectionsActivity extends AppCompatActivity {

    private TextView mClothesTextView;
    private ListView mListView;

    private String[] clothes = new String[] {"shirt", "Jeans",
            "T-shirts", "Trousers", "Socks", "dunguress",
            "Clacks", "Air Force", "Suits", "cufflings",
            "Jackets", "Pull overs", "Sweaters"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collections);

        mListView = (ListView) findViewById(R.id.clothesTextView);
        mClothesTextView = (TextView) findViewById(R.id.clothesTextView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, clothes);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String restaurant = ((TextView)view).getText().toString();
                Toast.makeText(CollectionsActivity.this, restaurant, Toast.LENGTH_LONG).show();
            }
        });

        Intent intent = getIntent();
        String clothes = intent.getStringExtra("clothes");
        mClothesTextView.setText("Here are all the clothes in our stores: " + clothes);
    }
}
