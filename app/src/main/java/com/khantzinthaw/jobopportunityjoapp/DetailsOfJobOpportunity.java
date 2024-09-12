package com.khantzinthaw.jobopportunityjoapp;


import static com.khantzinthaw.jobopportunityjoapp.MainActivity.arraylist1desc;
import static com.khantzinthaw.jobopportunityjoapp.MainActivity.arraylist1name;
import static com.khantzinthaw.jobopportunityjoapp.MainActivity.arraylist2desc;
import static com.khantzinthaw.jobopportunityjoapp.MainActivity.arraylist2name;
import static com.khantzinthaw.jobopportunityjoapp.ListOfSavedJobOpportunity.index1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailsOfJobOpportunity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_of_job_opportunity);

        TextView OutputName = findViewById(R.id.D1);
        TextView OutputDesc = findViewById(R.id.D2);

        OutputName.setText(MainActivity.arraylist1name.get(ListOfJobOpportunities.index));
        OutputDesc.setText(MainActivity.arraylist1desc.get(ListOfJobOpportunities.index));

        OutputName.setText(MainActivity.arraylist2name.get(index1));
        OutputDesc.setText(MainActivity.arraylist2desc.get(index1));

        Button DetailsSave = findViewById(R.id.D3);
        DetailsSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arraylist2name.add(MainActivity.arraylist1name.get(ListOfJobOpportunities.index));
                arraylist2desc.add(MainActivity.arraylist1desc.get(ListOfJobOpportunities.index));

            }
        });

        Button DetailsUnsave = findViewById(R.id.D4);
        DetailsUnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arraylist2name.remove(MainActivity.arraylist1name.get(ListOfJobOpportunities.index));
                arraylist2desc.remove(MainActivity.arraylist1desc.get(ListOfJobOpportunities.index));
            }
        });

        Button DetailsDelete = findViewById(R.id.D5);
        DetailsDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arraylist1name.remove(MainActivity.arraylist1name.get(ListOfJobOpportunities.index));
                arraylist1desc.remove(MainActivity.arraylist1desc.get(ListOfJobOpportunities.index));
            }
        });

    }
}