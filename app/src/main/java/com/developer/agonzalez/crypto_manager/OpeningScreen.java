package com.developer.agonzalez.crypto_manager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OpeningScreen extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        View view;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening_screen);
        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.green);
        Button nextScreen = findViewById(R.id.getStarted);
        nextScreen.setOnClickListener(new View.OnClickListener()
        {
           @Override
           public void onClick(View v)
           {
               startActivity(new Intent(OpeningScreen.this, CryptoCurrencies.class));
           }
        });

    }
}

