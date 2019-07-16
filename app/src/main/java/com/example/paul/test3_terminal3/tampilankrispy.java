package com.example.paul.test3_terminal3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tampilankrispy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilankrispy);
    }

    public void open (View view){
        Intent i;

        String addressString ="Krispy Kreme Soekarno Hatta Terminal 3 Soekarno Hatta Jl. Suka Makmur, Pajang, Benda, Kota Tangerang, Banten 15125";
        Uri geoLocation = Uri.parse("geo:-6.127174, 106.653695?q=" + addressString);

        i = new Intent(Intent.ACTION_VIEW);
        i.setData(geoLocation);

        startActivity(i);


    }



}