package com.example.paul.test3_terminal3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class MenuHotel extends AppCompatActivity {


    ViewFlipper viewFlipper;
    Animation fadein, fadeout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_hotel);

        viewFlipper           = (ViewFlipper) findViewById(R.id.viewFlipper);


        fadein = AnimationUtils.loadAnimation(this,R.anim.fadein);
        fadeout = AnimationUtils.loadAnimation(this,R.anim.fadeout);
        viewFlipper.setInAnimation(fadein);
        viewFlipper.setOutAnimation(fadeout);
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();

    }
}
