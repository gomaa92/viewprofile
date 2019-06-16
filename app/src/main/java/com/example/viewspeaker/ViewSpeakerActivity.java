package com.example.viewspeaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class ViewSpeakerActivity extends AppCompatActivity {

    Toolbar toolbar;
    TextView jobTextView;
    TextView emailTextView;
    TextView companyTextView;
    TextView locationTextView;
    TextView bioTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_speaker);

        Speaker speaker = new Speaker("Ahmed", "Gomaa", "android developer", "ITI", "ahmed@gmaill.com", "fesal", "ay haga b2a hena");

        toolbar = (Toolbar) findViewById(R.id.nameID);
        setSupportActionBar(toolbar);
        TextView textView = (TextView)toolbar.findViewById(R.id.toolbarTextView);
        textView.setText(speaker.getfName() + " " + speaker.getlName());
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        jobTextView = findViewById(R.id.jobTxtView);
        emailTextView = findViewById(R.id.emailTxtView);
        companyTextView = findViewById(R.id.companyTxtView);
        locationTextView = findViewById(R.id.locationTxtView);
        bioTextView = findViewById(R.id.bioTxtView);


        jobTextView.setText(speaker.getJob());
        emailTextView.setText(speaker.getEmil());
        companyTextView.setText(speaker.getCompanyName());
        locationTextView.setText(speaker.getLocation());
        bioTextView.setText(speaker.getBio());


    }
}
