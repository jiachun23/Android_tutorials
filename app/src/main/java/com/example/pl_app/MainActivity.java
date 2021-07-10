package com.example.pl_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("PL-app: List View and RecyclerView");

    }

    public void btnList(View view) {
        Intent intent= new Intent(this,Activity_List.class);
        startActivity(intent);
    }

    public void btnRecycler(View view) {
        Intent intent= new Intent(this, Activity_Recycler.class);
        startActivity(intent);
    }
}