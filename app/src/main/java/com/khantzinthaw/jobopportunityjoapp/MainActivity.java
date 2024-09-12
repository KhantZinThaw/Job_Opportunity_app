package com.khantzinthaw.jobopportunityjoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<String> arraylist1name = new ArrayList<String>();
    public static ArrayList<String> arraylist1desc = new ArrayList<String>();
    public static ArrayList<String> arraylist2name = new ArrayList<String>();
    public static ArrayList<String> arraylist2desc = new ArrayList<String>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button MPListJO= findViewById(R.id.MP1);
        MPListJO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListOfJobOpportunities.class);
                startActivity(intent);
            }
        });

        Button MPAdd= findViewById(R.id.MP2);
        MPAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddNewJobOpportunity.class);
                startActivity(intent);
            }
        });

        Button MPSaved= findViewById(R.id.MP3);
        MPSaved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, ListOfSavedJobOpportunity.class);
                startActivity(intent);
            }
        });




    }
}