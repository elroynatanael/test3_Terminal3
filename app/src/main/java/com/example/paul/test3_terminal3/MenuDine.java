package com.example.paul.test3_terminal3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.Switch;

public class MenuDine extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout slidetempat1, slidetempat2, slidetempat3, linearLayout, linearbakmi, linearbread, linearkoi, linearmarugame, linearotio, linearsate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_dine);
        // baru satu kartu
        slidetempat1 = (LinearLayout) findViewById(R.id.slide_tempat1);
        slidetempat2 = (LinearLayout) findViewById(R.id.slidetempat2);
        slidetempat3 = (LinearLayout) findViewById(R.id.slidetempat3);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        linearbakmi = (LinearLayout) findViewById(R.id.linearbakmi);
        linearbread = (LinearLayout) findViewById(R.id.linearbread);
        linearkoi = (LinearLayout) findViewById(R.id.linearkoi);
        linearmarugame = (LinearLayout) findViewById(R.id.linearmarugame);
        linearotio = (LinearLayout) findViewById(R.id.linearotio);
        linearsate = (LinearLayout) findViewById(R.id.linearsate);
        slidetempat1.setOnClickListener(this);
        slidetempat2.setOnClickListener(this);
        slidetempat3.setOnClickListener(this);
        linearLayout.setOnClickListener(this);
        linearbakmi.setOnClickListener(this);
        linearbread.setOnClickListener(this);
        linearkoi.setOnClickListener(this);
        linearmarugame.setOnClickListener(this);
        linearotio.setOnClickListener(this);
        linearsate.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;


        switch (v.getId()) {
            case R.id.slide_tempat1 : i = new Intent(this,tampilanstarbucks.class);startActivity(i); break ;
            default:break;
        }
        switch (v.getId()) {
            case R.id.slidetempat2 : i = new Intent(this,tampilanburgerking.class);startActivity(i); break ;
            default:break;
        }
        switch (v.getId()) {
            case R.id.slidetempat3 : i = new Intent(this,tampilankrispy.class);startActivity(i); break ;
            default:break;
        }
        switch (v.getId()) {
            case R.id.linearLayout : i = new Intent(this,tampilanaw.class);startActivity(i); break ;
            default:break;
        }
        switch (v.getId()) {
            case R.id.linearbakmi : i = new Intent(this,tampilanbakmi.class);startActivity(i); break ;
            default:break;
        }
        switch (v.getId()) {
            case R.id.linearbread : i = new Intent(this,tampilanbakmi.class);startActivity(i); break ;
            default:break;
        }
        switch (v.getId()) {
            case R.id.linearkoi : i = new Intent(this,tampilankoi.class);startActivity(i); break ;
            default:break;
        }
        switch (v.getId()) {
            case R.id.linearmarugame : i = new Intent(this,tampilanmarugame.class);startActivity(i); break ;
            default:break;
        }
        switch (v.getId()) {
            case R.id.linearotio : i = new Intent(this,tampilanrotio.class);startActivity(i); break ;
            default:break;
        }
        switch (v.getId()) {
            case R.id.linearsate : i = new Intent(this,tampilansate.class);startActivity(i); break ;
            default:break;
        }
    }
}
