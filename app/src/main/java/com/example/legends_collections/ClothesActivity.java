package com.example.legends_collections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ClothesActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.name123)
    TextView mUserName;
    @BindView(R.id.clothName)
    EditText mCloth;
    @BindView(R.id.buttonAdd)
    Button addCloth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        mUserName.setText(username);
        addCloth.setOnClickListener(this);
    }

    @Override
    public void onClick(View log) {}

}
