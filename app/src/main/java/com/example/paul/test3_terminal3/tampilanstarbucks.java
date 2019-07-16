package com.example.paul.test3_terminal3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tampilanstarbucks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilanstarbucks);
    }

    public void open (View view){
        Intent i;

       String addressString ="Starbucks Terminal 3 Ultimate - Arrival";
       Uri geoLocation = Uri.parse("geo:-6.118025, 106.667119?q=" + addressString);

       i = new Intent(Intent.ACTION_VIEW);
       i.setData(geoLocation);

       startActivity(i);


  }



 }