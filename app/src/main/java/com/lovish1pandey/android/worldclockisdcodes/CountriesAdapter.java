package com.lovish1pandey.android.worldclockisdcodes;


import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CountriesAdapter extends ArrayAdapter<Countries> {
    public CountriesAdapter(Activity context, ArrayList<Countries> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.custom_adapter, parent, false);
        }

        Countries currentCountry = getItem(position);

        TextView countryView = (TextView) listItemView.findViewById(R.id.count);
        countryView.setText(currentCountry.getCountries());

        TextView isdView = (TextView) listItemView.findViewById(R.id.codes);
        isdView.setText(currentCountry.getISDCodes());

        return listItemView;
    }
}
