package com.khantzinthaw.jobopportunityjoapp;

import static com.khantzinthaw.jobopportunityjoapp.MainActivity.arraylist1name;
import static com.khantzinthaw.jobopportunityjoapp.MainActivity.arraylist2name;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListOfSavedJobOpportunity extends AppCompatActivity {
    public static int index1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_saved_job_opportunity);

        ListView SavedListView = findViewById(R.id.S1);
        ArrayAdapter<String> SavedArrayAdapter= new ArrayAdapter<String>(ListOfSavedJobOpportunity.this, android.R.layout.simple_list_item_1, arraylist2name);
        SavedListView.setAdapter(SavedArrayAdapter);

        SavedListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                index1= i;
                Intent intent= new Intent(ListOfSavedJobOpportunity.this, DetailsOfJobOpportunity.class);
                startActivity(intent);

            }
        });

    }
}