package com.example.AttractionsCanada.Ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.AttractionsCanada.adapters.placesAdapter;
import com.example.AttractionsCanada.CanadaAttraction;
import com.example.countrylistrecyclerview.R;

import java.util.ArrayList;

public class AttractionListActivity extends AppCompatActivity {

    private RecyclerView rvPlacesList;
    private ArrayList<CanadaAttraction> Places;
    private ArrayList<String> mImageUrls = new ArrayList<>();

    private com.example.AttractionsCanada.adapters.placesAdapter placesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPlacesList = findViewById(R.id.rvCountryList);
        initImageBitmaps();

        populateCountries();
        placesAdapter = new placesAdapter(Places ,mImageUrls,this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        rvPlacesList.setLayoutManager(mLayoutManager);
        rvPlacesList.setAdapter(placesAdapter);
    }
    private void   initImageBitmaps(){

        mImageUrls.add("https://www.planetware.com/photos-large/CDN/canada-ontario-toronto-cn-tower-2.jpg");


        mImageUrls.add("https://www.planetware.com/photos-large/CDN/canada-ontario-niagara-falls-2.jpg");


        mImageUrls.add("https://www.planetware.com/photos-large/CDN/canada-banff-national-park-moraine-lake-2.jpg");


        mImageUrls.add("https://www.planetware.com/photos-large/CDN/canada-view-over-old-quebec.jpg");

        mImageUrls.add("https://www.planetware.com/photos-large/CDN/canada-british-columbia-whistler-ski-hill.jpg");


        mImageUrls.add("https://www.planetware.com/photos-large/CDN/canada-ontario-ottawa-parliament-hill.jpg");


        mImageUrls.add("https://www.planetware.com/photos-large/CDN/canada-newfoundland-st-johns-signal-hill-view.jpg");


        mImageUrls.add("https://www.planetware.com/photos-large/CDN/canada-quebec-old-montreal.jpg");

        mImageUrls.add("https://www.planetware.com/photos-large/CDN/canada-churchill-polar-bears.jpg");

        mImageUrls.add("https://www.planetware.com/wpimages/2019/03/canada-british-colombia-attractions-tofino-beach-and-people.jpg");


        mImageUrls.add("https://www.planetware.com/wpimages/2019/03/canada-british-colombia-attractions-tofino-beach-and-people.jpg");


        mImageUrls.add("https://www.planetware.com/photos-large/CDN/canada-british-columbia-victoria-inner-harbour.jpg");


        mImageUrls.add("https://www.planetware.com/photos-large/CDN/canada-newfoundland-gros-morne-national-park.jpg");

        mImageUrls.add("https://www.planetware.com/photos-large/CDN/canada-british-columbia-vancouver-stanley-park.jpg");

        mImageUrls.add("https://www.planetware.com/photos-large/CDN/canada-alberta-calgary-stampede.jpg");


    }

    private void populateCountries()
    {
        Places = new ArrayList<>();
        Places.add(new CanadaAttraction(1,"CN Tower","290 Bremner Blvd,M5V 3L9","Toronto","Ontario",getString(R.string.cntower)));

        Places.add(new CanadaAttraction(2,"Niagara Falls","6650 Niagara Parkway. (River Rd) Niagara Falls L2G 0L0","Niagara Falls","Ontario",getString(R.string.Niagra)));

        Places.add(new CanadaAttraction(3,"Banff National Park & the Rocky Mountains","Improvement District No. 9, AB T0L","Alberta","Alberta",getString(R.string.banff)));

        Places.add(new CanadaAttraction(4,"Old Quebec (Vieux-Quebec)","Rue de Tresor, GIR 5B8","Quebec City","Quebec",getString(R.string.OldQubec)));

        Places.add(new CanadaAttraction(5,"Whistler","British Columbia","British Columbia","British Columbia",getString(R.string.whistler)));

        Places.add(new CanadaAttraction(6,"Ottawa's Parliament Hill","Wellington St, K1A 0A9","Ottawa","Ontario",getString(R.string.ottawasparliment)));

        Places.add(new CanadaAttraction(7,"St. John's Signal Hill National Historic Site","230 Signal Hill Rd, St. John's, NL A1A 1B3","St. John's","Newfoundland and Labrador",getString(R.string.stjohnsSignal)));

        Places.add(new CanadaAttraction(8,"Old Montreal","Old Montreal","Montreal","Quebec",getString(R.string.oldmontreal)));

        Places.add(new CanadaAttraction(9,"Polar Bears of Churchill","town of Churchill in Northern Manitoba.","Manitoba","Manitoba",getString(R.string.polarbear)));

        Places.add(new CanadaAttraction(10,"Vancouver Island","Vancouver","Vancouver","British Columbia",getString(R.string.vancouverisland)));

        Places.add(new CanadaAttraction(11,"Bay of Fundy","New Brunswick, Nova Scotia, Maine","Nova Scotia and New Brunswick","Nova Scotia and New Brunswick",getString(R.string.bayoffundy)));

        Places.add(new CanadaAttraction(12,"Victoria's Inner Harbour","Victoria, British Columbia","British Columbia","British Columbia",getString(R.string.victoriainnerharbour)));

        Places.add(new CanadaAttraction(13,"Gros Morne National Park","Newfoundland and Labrador","Newfoundland and Labrador","Newfoundland and Labrador",getString(R.string.GrosMonre)));

        Places.add(new CanadaAttraction(14,"Vancouver's Stanley Park","Vancouver, BC V6G 1Z4","Vancouver","British Columbia",getString(R.string.vancouvernationalpark)));
        Places.add(new CanadaAttraction(15,"Calgary Stampede","1410 Olympic Way SE, Calgary, AB T2G 2W1","Calgary","Alberta",getString(R.string.clagary)));





    }
}
