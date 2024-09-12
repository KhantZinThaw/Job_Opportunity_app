package com.khantzinthaw.jobopportunityjoapp;

import static com.khantzinthaw.jobopportunityjoapp.MainActivity.arraylist1name;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListOfJobOpportunities extends AppCompatActivity {
    public static int index;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_job_opportunities);

        ListView JOListView = findViewById(R.id.JO1);
        ArrayAdapter<String> JOArrayAdapter= new ArrayAdapter<String>(ListOfJobOpportunities.this, android.R.layout.simple_list_item_1, arraylist1name);
        JOListView.setAdapter(JOArrayAdapter);

        JOListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                index=i;
                Intent intent= new Intent(ListOfJobOpportunities.this, DetailsOfJobOpportunity.class);
                startActivity(intent);

            }
        });


    }
}