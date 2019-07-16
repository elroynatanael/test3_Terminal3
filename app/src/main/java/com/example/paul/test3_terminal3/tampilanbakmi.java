package com.example.paul.test3_terminal3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tampilanbakmi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilanbakmi);
    }

    public void open (View view){
        Intent i;

        String addressString ="Bakmi GM Bandara Soekarno Hatta Terminal 3 Ultimate Domestic Landside, Lantai 2 Ultimate Food Terminal, Pajang, Benda, Pajang, Benda, Kota Tangerang, Banten 15126";
        Uri geoLocation = Uri.parse("geo:-6.117943, 106.666118?q=" + addressString);

        i = new Intent(Intent.ACTION_VIEW);
        i.setData(geoLocation);

        startActivity(i);


    }



}