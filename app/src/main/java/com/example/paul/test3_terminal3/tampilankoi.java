package com.example.paul.test3_terminal3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tampilankoi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilankoi);
    }

    public void open (View view){
        Intent i;

        String addressString ="KOI Cafe - Terminal 3 Domestic Terminal 3 Gate 1 Departure, Pajang, Benda, Kota Tangerang, Banten 15126";
        Uri geoLocation = Uri.parse("geo:-6.119125, 106.664196?q=" + addressString);

        i = new Intent(Intent.ACTION_VIEW);
        i.setData(geoLocation);

        startActivity(i);


    }



}