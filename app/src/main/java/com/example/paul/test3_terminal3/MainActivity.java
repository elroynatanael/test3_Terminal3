package com.example.paul.test3_terminal3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView dineCard,shopCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // baru satu kartu
        dineCard = (CardView) findViewById(R.id.dine_card);
        shopCard = (CardView) findViewById(R.id.shop_card);
        dineCard.setOnClickListener(this);
        shopCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;


        switch (v.getId()) {
            case R.id.dine_card : i = new Intent(this,MenuDine.class);startActivity(i); break ;
            case R.id.shop_card : i = new Intent(this,menushop.class);startActivity(i); break ;
        default:break;
        }
    }
}
