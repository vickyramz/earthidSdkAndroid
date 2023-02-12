package com.example.earthidlibservice;


import android.app.Activity;
import android.content.Intent;

import com.veriff.Sdk;

public class EarthidSdk {
    public Intent createSdk(Activity activity,String sessionUrl){
        Intent intent = Sdk.createLaunchIntent(activity, sessionUrl);
        return  intent;
    }

}
