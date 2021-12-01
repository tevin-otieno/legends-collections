package com.example.legends_collections;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.button2)
    Button mGreet;
    @BindView(R.id.name1)
    EditText mUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mGreet.setOnClickListener(this);
    }

    @Override
    public void onClick(View log) {
        if (log == mGreet){
            String username = mUserName.getText().toString();
            if (username.isEmpty()){
                Toast.makeText(MainActivity.this, "Please input Username", Toast.LENGTH_SHORT).show();
            }else{
                Intent intent = new Intent(MainActivity.this, ClothesActivity.class);
                intent.putExtra("username",username);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Hooray your in!!!", Toast.LENGTH_SHORT).show();
            }

        }

    }
}