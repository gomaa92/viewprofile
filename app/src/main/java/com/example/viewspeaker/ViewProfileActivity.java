package com.example.viewspeaker;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ViewProfileActivity extends AppCompatActivity {

    Toolbar toolbar;
    TextView jobTextView;
    TextView emailTextView;
    TextView companyTextView;
    TextView locationTextView;
    TextView bioTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile);
        User use = new User("Ahmed", "Gomaa", "android developer", "ITI", "ahmed@gmaill.com", "fesal", "ay haga b2a hena");

        toolbar = (Toolbar) findViewById(R.id.nameID);
        setSupportActionBar(toolbar);
        TextView textView = (TextView) toolbar.findViewById(R.id.toolbarTextView);
        textView.setText(use.getfName() + " " + use.getlName());
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        jobTextView = findViewById(R.id.jobTxtView);
        emailTextView = findViewById(R.id.emailTxtView);
        companyTextView = findViewById(R.id.companyTxtView);
        locationTextView = findViewById(R.id.locationTxtView);
        bioTextView = findViewById(R.id.bioTxtView);


        jobTextView.setText(use.getJob());
        emailTextView.setText(use.getEmil());
        companyTextView.setText(use.getCompanyName());
        locationTextView.setText(use.getLocation());
        bioTextView.setText(use.getBio());

        FloatingActionButton fab = findViewById(R.id.fabEdit);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ViewProfileActivity.this, "Open edit profile activity", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ViewProfileActivity.this , ViewSpeakerActivity.class);
                startActivity(intent);
            }
        });

    }
}
