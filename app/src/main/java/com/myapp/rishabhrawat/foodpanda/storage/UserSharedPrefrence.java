package com.myapp.rishabhrawat.foodpanda.storage;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Rishabh Rawat on 2/13/2018.
 */

public class UserSharedPrefrence {

    private  SharedPreferences preferences;
    private  SharedPreferences.Editor editor;
    private boolean first_time_open;

    public UserSharedPrefrence(Context context)
    {
        preferences=context.getSharedPreferences("user",0);
        editor=preferences.edit();
    }

    public boolean isFirst_time_open() {
        return preferences.getBoolean("first_time_open",false);
    }

    public void setFirst_time_open(boolean first_time_open) {
        editor.putBoolean("first_time_open",first_time_open);
        editor.commit();
    }
}
