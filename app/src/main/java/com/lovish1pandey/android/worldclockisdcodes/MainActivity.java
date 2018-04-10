package com.lovish1pandey.android.worldclockisdcodes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Countries> places = new ArrayList<Countries>();
        places.add(new Countries("Algeria", "213"));
        places.add(new Countries("Argentina", "54"));
        places.add(new Countries("Australia", "61"));
        places.add(new Countries("Austria", "43"));
        places.add(new Countries("Bahrain", "973"));
        places.add(new Countries("Bangladesh", "880"));
        places.add(new Countries("Belgium", "32"));
        places.add(new Countries("Brazil", "32"));
        places.add(new Countries("Bulgaria", "359"));
        places.add(new Countries("Canada", "1"));
        places.add(new Countries("China", "86"));
        places.add(new Countries("Cyprus", "375"));
        places.add(new Countries("Czech", "42"));
        places.add(new Countries("Denmark", "45"));
        places.add(new Countries("Egypt", "20"));
        places.add(new Countries("Ethiopia", "251"));
        places.add(new Countries("Finland", "358"));
        places.add(new Countries("Fiji", "679"));
        places.add(new Countries("France", "33"));
        places.add(new Countries("Germany", "49"));
        places.add(new Countries("Ghana", "233"));
        places.add(new Countries("Greece", "30"));
        places.add(new Countries("Hong Kong", "852"));
        places.add(new Countries("Hungary", "36"));
        places.add(new Countries("Indonesia", "62"));
        places.add(new Countries("India", "91"));
        places.add(new Countries("Iran", "98"));
        places.add(new Countries("Iraq", "964"));
        places.add(new Countries("Ireland", "353"));
        places.add(new Countries("Italy", "39"));
        places.add(new Countries("Japan", "81"));
        places.add(new Countries("Jordan", "962"));
        places.add(new Countries("Kenya Rep", "254"));
        places.add(new Countries("Kuwait", "965"));
        places.add(new Countries("Libya", "218"));
        places.add(new Countries("Malaysia", "60"));
        places.add(new Countries("Maldives", "960"));
        places.add(new Countries("Mexico", "52"));
        places.add(new Countries("Mauritius", "320"));
        places.add(new Countries("Nepal", "977"));
        places.add(new Countries("Netherland", "31"));
        places.add(new Countries("New Zealand", "64"));
        places.add(new Countries("Nigeria", "234"));
        places.add(new Countries("Norway", "47"));
        places.add(new Countries("Omen", "968"));
        places.add(new Countries("Pakistan", "92"));
        places.add(new Countries("Phillipines", "63"));
        places.add(new Countries("Poland", "48"));
        places.add(new Countries("Qatar", "974"));
        places.add(new Countries("Russia", "7"));
        places.add(new Countries("Saudi Arabia", "966"));
        places.add(new Countries("Seychelles", "248"));
        places.add(new Countries("Singapore", "65"));
        places.add(new Countries("Slovak", "42"));
        places.add(new Countries("South Korea", "82"));
        places.add(new Countries("Spain", "34"));
        places.add(new Countries("Sri Lanka", "94"));
        places.add(new Countries("Sweden", "46"));
        places.add(new Countries("Switzerland", "41"));
        places.add(new Countries("Syria", "963"));
        places.add(new Countries("Taiwan", "886"));
        places.add(new Countries("Tanzania", "255"));
        places.add(new Countries("Thailand", "66"));
        places.add(new Countries("Turkey", "90"));
        places.add(new Countries("UAE", "971"));
        places.add(new Countries("Uganda", "256"));
        places.add(new Countries("United Kingdom", "44"));
        places.add(new Countries("United States", "1"));
        places.add(new Countries("Ukraine", "7"));
        places.add(new Countries("Vatican City", "39"));
        places.add(new Countries("Zimbabwe", "263"));

        CountriesAdapter placesAdapter = new CountriesAdapter(this, places);
        ListView listView = (ListView) findViewById(R.id.view_List);
        listView.setAdapter(placesAdapter);
    }
}
