package com.example.paul.test3_terminal3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tampilancoach extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilancoach);
    }

    public void open (View view){
        Intent i;

        String addressString ="Coach Domestik Departure Airside Area Shop, Soekarno Hatta International Airport Terminal 3, Jl. P2 No.14 A, Pajang, Benda, Kota Tangerang, Banten 19120";
        Uri geoLocation = Uri.parse("geo:-6.118462, 106.663349?q=" + addressString);

        i = new Intent(Intent.ACTION_VIEW);
        i.setData(geoLocation);

        startActivity(i);


    }



}