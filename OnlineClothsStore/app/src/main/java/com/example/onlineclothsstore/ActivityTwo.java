package com.example.onlineclothsstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;

public class ActivityTwo extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Intent intent= getIntent();
        int pos= intent.getIntExtra("position",0);
        DetailFragment detailFragment= (DetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.fragemt_detail);
        detailFragment.setIndex(pos);
    }
}
