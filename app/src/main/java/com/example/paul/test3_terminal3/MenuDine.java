package com.example.paul.test3_terminal3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.Switch;

public class MenuDine extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout slidetempat1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_dine);
        // baru satu kartu
        slidetempat1 = (LinearLayout) findViewById(R.id.slide_tempat1);
        slidetempat1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;


        switch (v.getId()) {
            case R.id.slide_tempat1 : i = new Intent(this,tampilanstarbucks.class);startActivity(i); break ;
            default:break;
        }
    }
}
