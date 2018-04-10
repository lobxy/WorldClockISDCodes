package com.lovish1pandey.android.worldclockisdcodes;


public class Countries {
    private String mCountry;
    private String mISDCode;

    public Countries(String Country, String ISDCode) {
        mCountry = Country;
        mISDCode = ISDCode;
    }

    public String getCountries() {
        return mCountry;
    }

    public String getISDCodes() {
        return mISDCode;
    }
}