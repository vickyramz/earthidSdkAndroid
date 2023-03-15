package com.example.earthidlibservice;


import android.app.Activity;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import com.veriff.Branding;
import com.veriff.Configuration;
import com.veriff.Sdk;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class EarthidSdk extends AppCompatActivity {
    public Intent createSdk(Activity activity,String sessionUrl){
        String originalUrl = sessionUrl.replace("https://myearth.id/","https://alchemy.veriff.com/v/");
        Branding branding = new Branding.Builder()
                .logo(R.drawable.earthidlogo_round)
                .buttonRadius(48f)
                .build();

        Configuration configuration = new Configuration.Builder()
                .branding(branding)
                .build();
        Intent intent = Sdk.createLaunchIntent(activity, originalUrl,configuration);
        return  intent;
    }

    public  void getVerificationResultFromSdk (String sessionId,final Results callback){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://session.myearth.id/earthid/api/"+sessionId+"/")
                .build();

        RetrofitAPI retroApi = retrofit.create(RetrofitAPI.class);
        Call<ResponseBody> call = retroApi.getName();
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                callback.onResponse(response.body());
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                // Handle failure response
                callback.onError(t);
            }
        });


    }

}
