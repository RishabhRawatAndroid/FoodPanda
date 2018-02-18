package com.myapp.rishabhrawat.foodpanda.activity;

import android.content.Intent;
import android.provider.Settings;
import android.view.View;


/**
 * Created by Rishabh Rawat on 2/16/2018.
 */

//this is not a activity but still it will open an setting activity when the internet gone
public class OpenSetting implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        view.getContext().startActivity(new Intent(Settings.ACTION_SETTINGS));
    }
}
