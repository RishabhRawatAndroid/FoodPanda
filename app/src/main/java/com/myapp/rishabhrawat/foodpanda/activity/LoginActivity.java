package com.myapp.rishabhrawat.foodpanda.activity;

import android.graphics.Color;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.myapp.rishabhrawat.foodpanda.R;
import com.myapp.rishabhrawat.foodpanda.broadcastreciver.InternetChecker;
import com.myapp.rishabhrawat.foodpanda.interfaces.NetworkCheckerListener;

public class LoginActivity extends AppCompatActivity  implements NetworkCheckerListener{


    private ConstraintLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //register the listener of internet checker
        InternetChecker checker=new InternetChecker(this);

        layout=findViewById(R.id.layout);
    }

    @Override
    public void internetstatus(final boolean value) {
        //This handler post this runnable to the message_queue of UI thread when the internet gone
        Handler handler = new Handler(getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (value) {
                  //  Snackbar.make(layout, "Network Connection Available :)", Snackbar.LENGTH_SHORT).setActionTextColor(Color.GREEN).show();
                } else {
                    Snackbar.make(layout, "No Network Connection Available :(", Snackbar.LENGTH_INDEFINITE).setAction(R.string.setting, new OpenSetting()).setActionTextColor(Color.RED).show();
                }
            }
        });
    }
}
