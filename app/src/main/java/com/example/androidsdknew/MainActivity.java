package com.example.androidsdknew;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.earthidlibservice.EarthidSdk;

public class MainActivity extends AppCompatActivity {
    final Activity activity = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button myButton = (Button) findViewById(R.id.my_button);
        myButton.setOnClickListener(view -> {
            EarthidSdk a =new EarthidSdk();
          Intent i = a.createSdk(activity,"https://alchemy.veriff.com/v/eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzZXNzaW9uX2lkIjoiNzU5YjA2NTEtMjZhNC00YzgxLTkxMTMtNjBjNWM0ZjU0ZTg5IiwiaWlkIjoiZTliNWQ2YmEtMWU1Yy00MTU3LWIzMzQtNWExN2FiMDY1ZTJhIiwiaWF0IjoxNjc2MjE1NzM2fQ.Reuu6blImhmDIN8VancMZYU-G906TzuGue7noB0OR54");
          startActivityForResult(i,1);
        });

    }
}