package com.example.paul.test3_terminal3;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Importantnumbers extends ListActivity {
    TextView information;
    String pilihan[] = { "Air China", "All Nippon", "Asiana Airlines",
            "Cathay Pacific Airways", "China Airlines", "Emirates", "Ethiopian Airlines",
            "Etihad Airways", "Eva Air", "Garuda Indonesia", "Japan Airlines", "KLM Royal Deutch", "Korean Airlines", "Malaysian Airlines",
                "Oman Airlines", "Philippine Airlines", "Qantas Airways", "Qatar Airways", "Royal Brunai Airlines", "Singapore Airlines",
                "Sri Lankan Airlines", "Thai Airways", "Turkish Airlines", "Vietnam Airlines", "Xiamen Airline"};

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_importantnumbers);

        ListView lv = getListView();
        ListAdapter la = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, pilihan);
        lv.setAdapter(la);
        lv.setTextFilterEnabled(true);
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        lv.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View View,
                                    int position, long id) {
                switch (position) {

                    case 0:
                        Intent i;

                        String addressString = "Air China";
                        Uri geoLocation = Uri.parse("geo:-6.180777, 106.895521?q=" + addressString);

                        i = new Intent(Intent.ACTION_VIEW);
                        i.setData(geoLocation);

                        startActivity(i);
                }


                switch (position) {
                    case 1:
                        Intent a;

                        String addressString1 = "All Nippon";
                        Uri geoLocation1 = Uri.parse("geo:-6.385342, 106.847177?q=" + addressString1);

                        a = new Intent(Intent.ACTION_VIEW);
                        a.setData(geoLocation1);

                        startActivity(a);
                }

                switch (position) {
                    case 2:
                        Intent b;

                        String addressString2 = "Asiana Airlines";
                        Uri geoLocation2 = Uri.parse("geo:-6.586576, 106.831585?q=" + addressString2);

                        b = new Intent(Intent.ACTION_VIEW);
                        b.setData(geoLocation2);

                        startActivity(b);
                }

                switch (position) {
                    case 3:
                        Intent c;

                        String addressString3 = "Cathay Pacific Airways";
                        Uri geoLocation3 = Uri.parse("geo:-6.311892, 106.925289?q=" + addressString3);

                        c = new Intent(Intent.ACTION_VIEW);
                        c.setData(geoLocation3);

                        startActivity(c);
                }

                switch (position) {

                    case 4:
                        Intent d;

                        String addressString4 = "China Airlines";
                        Uri geoLocation4 = Uri.parse("geo:-6.231975, 107.166294?q=" + addressString4);

                        d = new Intent(Intent.ACTION_VIEW);
                        d.setData(geoLocation4);

                        startActivity(d);
                }

                switch (position) {
                    case 5:
                        Intent e;

                        String addressString5 = "Emirates";
                        Uri geoLocation5 = Uri.parse("geo:-6.232237, 106.889785?q=" + addressString5);

                        e = new Intent(Intent.ACTION_VIEW);
                        e.setData(geoLocation5);

                        startActivity(e);
                }

                switch (position) {
                    case 6:
                        Intent f;

                        String addressString6 = "Ethiopian Airlines";
                        Uri geoLocation6 = Uri.parse("geo:-6.220324, 106.921077?q=" + addressString6);

                        f = new Intent(Intent.ACTION_VIEW);
                        f.setData(geoLocation6);

                        startActivity(f);
                }

                switch (position) {
                    case 7:
                        Intent g;

                        String addressString7 = "Etihad Airways";
                        Uri geoLocation7 = Uri.parse("geo:-6.578482, 106.797164?q=" + addressString7);

                        g = new Intent(Intent.ACTION_VIEW);
                        g.setData(geoLocation7);

                        startActivity(g);
                }

                switch (position) {
                    case 8:
                        Intent i;

                        String addressString8 = "Eva Air";
                        Uri geoLocation8 = Uri.parse("geo:-6.226776, 107.006372?q=" + addressString8);

                        i = new Intent(Intent.ACTION_VIEW);
                        i.setData(geoLocation8);

                        startActivity(i);
                }

                switch (position) {
                    case 9:
                        Intent j;

                        String addressString9 ="Garuda Indonesia";
                        Uri geoLocation9 = Uri.parse("geo:-6.494931, 106.833392?q=" + addressString9);

                        j = new Intent(Intent.ACTION_VIEW);
                        j.setData(geoLocation9);

                        startActivity(j);


                }
            }

        });
    }
}