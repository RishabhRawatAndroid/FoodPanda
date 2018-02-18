package com.myapp.rishabhrawat.foodpanda.broadcastreciver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.myapp.rishabhrawat.foodpanda.interfaces.NetworkCheckerListener;


public class InternetChecker extends BroadcastReceiver {

    NetworkCheckerListener listener;
    public InternetChecker(NetworkCheckerListener listener)
    {
        this.listener=listener;
    }
    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = manager.getActiveNetworkInfo();

        if(networkInfo!=null && networkInfo.isConnected())
        {
            listener.internetstatus(true);
        }
        else
        {
            listener.internetstatus(false);
        }

    }
}
