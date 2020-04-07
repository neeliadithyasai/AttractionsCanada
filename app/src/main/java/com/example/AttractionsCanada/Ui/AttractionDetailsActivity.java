package com.example.AttractionsCanada.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.AttractionsCanada.CanadaAttraction;
import com.example.countrylistrecyclerview.R;

public class AttractionDetailsActivity extends AppCompatActivity {

    private TextView showDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction_details);

        showDetails = findViewById(R.id.txtdetails);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        CanadaAttraction C2 = (CanadaAttraction) extras.getSerializable("object");

        showDetails.setText(C2.getPlaceName()+"\n"+C2.getDescription());
    }
}
