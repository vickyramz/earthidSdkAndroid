package com.example.earthidlibservice;


import android.app.Activity;
import android.content.Intent;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.recaptcha.VerificationResult;
import com.veriff.Branding;
import com.veriff.Configuration;
import com.veriff.Sdk;

import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

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
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RetrofitAPI retroApi = retrofit.create(RetrofitAPI.class);
        Call<VerificationResults> call = retroApi.getName();
        call.enqueue(new Callback<VerificationResults>() {
            @Override
            public void onResponse(Call<VerificationResults> call, Response<VerificationResults> response) {
                if(Objects.equals(response.body().getStatus(), "success")){
                    Log.d("messageSuccess",response.body().getStatus());
                    Log.d("messageSuccess",response.body().getVerification().getPerson().getFirstName());
                    callback.onResponse(response.body());
                }
            }

            @Override
            public void onFailure(Call<VerificationResults> call, Throwable t) {
                // Handle failure response
                callback.onError(t);
            }
        });


    }

}
