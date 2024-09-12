package com.khantzinthaw.jobopportunityjoapp;

import static com.khantzinthaw.jobopportunityjoapp.MainActivity.arraylist1desc;
import static com.khantzinthaw.jobopportunityjoapp.MainActivity.arraylist1name;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddNewJobOpportunity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_job_opportunity);

        EditText InputName= findViewById(R.id.A1);
        EditText InputDesc= findViewById(R.id.A2);

        String NameInput = InputName.getText().toString();
        String DescInput = InputDesc.getText().toString();

        Button AddButton= findViewById(R.id.A3);
        AddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arraylist1name.add(NameInput);
                arraylist1desc.add(DescInput);
            }
        });

    }
}