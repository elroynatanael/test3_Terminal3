package com.example.paul.test3_terminal3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Switch;

import static android.content.Intent.ACTION_VIEW;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView dineCard, shopCard,numbersCard, reportCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // baru satu kartu
        dineCard = (CardView) findViewById(R.id.dine_card);
        shopCard = (CardView) findViewById(R.id.shop_card);
        numbersCard = (CardView) findViewById(R.id.numbers_card);
        reportCard = (CardView) findViewById(R.id.report_card);
        dineCard.setOnClickListener(this);
        shopCard.setOnClickListener(this);
        numbersCard.setOnClickListener(this);
        reportCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;


        switch (v.getId()) {
            case R.id.dine_card:
                i = new Intent(this, MenuDine.class);
                startActivity(i);
                break;

            case R.id.shop_card:
                i = new Intent(this, menushop.class);
                startActivity(i);
                break;

            case R.id.numbers_card:
                i = new Intent(this, Importantnumbers.class);
                startActivity(i);
                break;

            case R.id.report_card:
               i = new Intent(ACTION_VIEW,Uri.parse("https://forms.gle/jjvuJ8ks5aU9v1mz5"));
                startActivity(i);
                break;

            default:
                break;
        }
    }



}
