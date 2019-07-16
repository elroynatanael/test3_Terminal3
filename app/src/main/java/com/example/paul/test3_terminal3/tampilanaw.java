package com.example.paul.test3_terminal3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tampilanaw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilanaw);
    }

    public void open (View view){
        Intent i;

        String addressString ="A W Restoran 2nd Floor, Pajang, Benda, Pajang, Benda, Kota Tangerang, Banten 15126";
        Uri geoLocation = Uri.parse("geo:-6.118677, 106.665353?q=" + addressString);

        i = new Intent(Intent.ACTION_VIEW);
        i.setData(geoLocation);

        startActivity(i);


    }



}