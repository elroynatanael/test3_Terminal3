package com.example.paul.test3_terminal3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tampilanbatik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilanbatik);
    }

    public void open (View view){
        Intent i;

        String addressString ="Batik Keris Terminal 3 Pajang, Benda, Tangerang City, Banten 15126";
        Uri geoLocation = Uri.parse("geo:-6.117782, 106.666814?q=" + addressString);

        i = new Intent(Intent.ACTION_VIEW);
        i.setData(geoLocation);

        startActivity(i);


    }



}