package com.example.paul.test3_terminal3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.Switch;

public class menushop extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout slidetempat1, slidetempat2, slidetempat3, linearalexandre, linearalfa, linearkimia, linearperi, linearLayout, linearthomasabo, linearwhsmith;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menushop);
        // baru satu kartu
        slidetempat1 = (LinearLayout) findViewById(R.id.slidetempat1);
        slidetempat2 = (LinearLayout) findViewById(R.id.slidetempat2);
        slidetempat3 = (LinearLayout) findViewById(R.id.slidetempat3);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        linearalexandre = (LinearLayout) findViewById(R.id.linearalexandre);
        linearalfa = (LinearLayout) findViewById(R.id.linearalfa);
        linearkimia = (LinearLayout) findViewById(R.id.linearkimia);
        linearperi = (LinearLayout) findViewById(R.id.linearperi);
        linearthomasabo = (LinearLayout) findViewById(R.id.linearthomasabo);
        linearwhsmith = (LinearLayout) findViewById(R.id.linearwhsmith);
        slidetempat1.setOnClickListener(this);
        slidetempat2.setOnClickListener(this);
        slidetempat3.setOnClickListener(this);
        linearLayout.setOnClickListener(this);
        linearalexandre.setOnClickListener(this);
        linearalfa.setOnClickListener(this);
        linearkimia.setOnClickListener(this);
        linearperi.setOnClickListener(this);
        linearthomasabo.setOnClickListener(this);
        linearwhsmith.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;


        switch (v.getId()) {
            case R.id.slidetempat1 : i = new Intent(this,tampilanbatik.class);startActivity(i); break ;
            default:break;
        }
        switch (v.getId()) {
            case R.id.slidetempat2 : i = new Intent(this,tampilancoach.class);startActivity(i); break ;
            default:break;
        }
        switch (v.getId()) {
            case R.id.slidetempat3 : i = new Intent(this,tampilaniport.class);startActivity(i); break ;
            default:break;
        }
        switch (v.getId()) {
            case R.id.linearLayout : i = new Intent(this,tampilanbatik.class);startActivity(i); break ;
            default:break;
        }
        switch (v.getId()) {
            case R.id.linearalexandre : i = new Intent(this,tampilanalexandre.class);startActivity(i); break ;
            default:break;
        }
        switch (v.getId()) {
            case R.id.linearalfa : i = new Intent(this,tampilanalfa.class);startActivity(i); break ;
            default:break;
        }
        switch (v.getId()) {
            case R.id.linearkimia : i = new Intent(this,tampilankimia.class);startActivity(i); break ;
            default:break;
        }
        switch (v.getId()) {
            case R.id.linearperi : i = new Intent(this,tampilanbatik.class);startActivity(i); break ;
            default:break;
        }
        switch (v.getId()) {
            case R.id.linearthomasabo : i = new Intent(this,tampilanbatik.class);startActivity(i); break ;
            default:break;
        }
        switch (v.getId()) {
            case R.id.linearwhsmith : i = new Intent(this,tampilanbatik.class);startActivity(i); break ;
            default:break;
        }
    }
}
