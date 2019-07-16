package com.example.paul.test3_terminal3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tampilankimia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilankimia);
    }

    public void open (View view){
        Intent i;

        String addressString ="Kimia Farma Terminal 3 International Terminal 3 Ultimate Sekarno Hatta International Airport (CGK, Pajang, Benda, Kota Tangerang, Banten 15126";
        Uri geoLocation = Uri.parse("geo:-6.118877, 106.663855?q=" + addressString);

        i = new Intent(Intent.ACTION_VIEW);
        i.setData(geoLocation);

        startActivity(i);


    }



}