package com.example.androidsdknew;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.earthidlibservice.EarthidSdk;
import com.example.earthidlibservice.Results;
import com.example.earthidlibservice.VerificationResults;

public class MainActivity extends AppCompatActivity {
    final Activity activity = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button myButton = (Button) findViewById(R.id.my_button);
        myButton.setOnClickListener(view -> {
            EarthidSdk a =new EarthidSdk();
            Intent i =   a.createSdk(activity,"https://myearth.id/eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzZXNzaW9uX2lkIjoiNDM2NmM4MTQtMGYzYS00OGY0LThlOWQtM2U1MGQwZjFiOGE4IiwiaWlkIjoiOTIyNDhiNzctNzc3Ni00NDkzLTgxZjQtYTk0ODlmNWYyNDljIiwiaWF0IjoxNjc4OTQ5ODk4fQ.p33ErUXm9HND8G_07s7kbbPrmglYp70PZSdLX5KTYUY");
            startActivityForResult(i,1);
//            a.getVerificationResultFromSdk("2dfbfa15-0319-4671-b164-cf36032fb7d7", new Results() {
//                @Override
//                public void onResponse(VerificationResults response) {
//                    //receive a response which contains details
//                }
//
//                @Override
//                public void onError(Throwable response) {
//
//                }
//
//            });
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //this will execute after you submit the session
        if (resultCode == -1) {
            EarthidSdk a =new EarthidSdk();
            //put your sessionId here
            a.getVerificationResultFromSdk("4366c814-0f3a-48f4-8e9d-3e50d0f1b8a8", new Results() {
                @Override
                public void onResponse(VerificationResults response) {
                    //receive a response which contains details
                }

                @Override
                public void onError(Throwable response) {
                    // handle the error
                }

            });
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

}