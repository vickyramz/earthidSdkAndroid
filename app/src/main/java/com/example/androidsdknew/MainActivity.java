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
            Intent i =   a.createSdk(activity,"https://myearth.id/eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzZXNzaW9uX2lkIjoiYTA5YjNhYTItMDgyMC00MzBhLThmNzQtYWI4YzAxNDk1MWIyIiwiaWlkIjoiOTIyNDhiNzctNzc3Ni00NDkzLTgxZjQtYTk0ODlmNWYyNDljIiwiaWF0IjoxNjc4ODk3MDQ5fQ.HBJbGPU4YKEfD2ijJoeJTpivwWvLOWOJyL2oPg762YI");
            startActivityForResult(i,1);
//            a.getVerificationResultFromSdk("d3537725-b984-4be3-8c36-b18f17c1bd6c", new Results() {
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
        if (resultCode == -1) {
            EarthidSdk a =new EarthidSdk();
            //put your sessionId here
            a.getVerificationResultFromSdk("d3537725-b984-4be3-8c36-b18f17c1bd6c", new Results() {
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