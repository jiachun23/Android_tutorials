package com.example.pl_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Activity_List extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);
        getSupportActionBar().setTitle("PL-app: List View");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        listView = (ListView)findViewById(R.id.listview);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("C++");
        arrayList.add("C#");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("Ruby");
        arrayList.add("Perl");
        arrayList.add("HTML");
        arrayList.add("PHP");
        arrayList.add("Javascript");
        arrayList.add("CSS");
        arrayList.add("C++");
        arrayList.add("C#");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("Ruby");
        arrayList.add("Perl");
        arrayList.add("HTML");
        arrayList.add("PHP");
        arrayList.add("Javascript");
        arrayList.add("CSS");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Activity_List.this, "clicked item:"+position+" "+arrayList.get(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });




    }
}