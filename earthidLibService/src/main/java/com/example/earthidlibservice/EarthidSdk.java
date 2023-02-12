package com.example.earthidlibservice;


import android.app.Activity;
import android.content.Intent;

import com.veriff.Branding;
import com.veriff.Configuration;
import com.veriff.Sdk;

public class EarthidSdk {
    public Intent createSdk(Activity activity,String sessionUrl){
        Branding branding = new Branding.Builder()
                .logo(R.drawable.earthidlogo_round)
                // Button corner radius, in `dp`
                .buttonRadius(48f)
                .build();

        Configuration configuration = new Configuration.Builder()
                .branding(branding)
                .build();
        Intent intent = Sdk.createLaunchIntent(activity, sessionUrl,configuration);
        return  intent;
    }

}
