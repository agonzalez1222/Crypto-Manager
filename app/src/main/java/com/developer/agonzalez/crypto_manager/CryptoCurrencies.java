package com.developer.agonzalez.crypto_manager;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONObject;

import java.io.*;
import java.net.*;



public class CryptoCurrencies extends AppCompatActivity {
   public static TextView txtView;
   public static TextView txtView2;
   public static TextView txtView3;
   public static TextView txtView4;
   public static TextView txtView5;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crypto_currencies);
        View view;
        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.green);
        String urlBit = ("https://rest.coinapi.io/v1/exchangerate/BTC/USD?apikey=2DA46C7C-E7E6-434B-9C0C-680EBEBB3608");
        String urlLite = ("https://rest.coinapi.io/v1/exchangerate/LTC/USD?apikey=2DA46C7C-E7E6-434B-9C0C-680EBEBB3608");
        String urlRipple = ("https://rest.coinapi.io/v1/exchangerate/XRP/USD?apikey=2DA46C7C-E7E6-434B-9C0C-680EBEBB3608");
        String urlEos = ("https://rest.coinapi.io/v1/exchangerate/EOS/USD?apikey=2DA46C7C-E7E6-434B-9C0C-680EBEBB3608");
        String urlEur = ("https://rest.coinapi.io/v1/exchangerate/ETH/USD?apikey=2DA46C7C-E7E6-434B-9C0C-680EBEBB3608");
        btn = findViewById(R.id.button2);
        txtView = findViewById(R.id.textView3);
        txtView2 = findViewById(R.id.textView4);
        txtView3 = findViewById(R.id.textView5);
        txtView4 = findViewById(R.id.textView6);
        txtView5 = findViewById(R.id.textView7);



        btn.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View view1)
            {
                RemoteFetch process = new RemoteFetch();
                process.execute();
            }

        });




    }

    public static void main(String[] args) throws Exception
    {
//        URL urlBit = new URL("https://rest.coinapi.io/v1/exchangerate/BTC/USD?apikey=2DA46C7C-E7E6-434B-9C0C-680EBEBB3608");
//        URL urlLite = new URL("https://rest.coinapi.io/v1/exchangerate/LTC/USD?apikey=2DA46C7C-E7E6-434B-9C0C-680EBEBB3608");
//        URL urlRipple = new URL("https://rest.coinapi.io/v1/exchangerate/XRP/USD?apikey=2DA46C7C-E7E6-434B-9C0C-680EBEBB3608");
//        URL urlEos = new URL("https://rest.coinapi.io/v1/exchangerate/EOS/USD?apikey=2DA46C7C-E7E6-434B-9C0C-680EBEBB3608");
//        URL urlEur = new URL("https://rest.coinapi.io/v1/exchangerate/ETH/USD?apikey=2DA46C7C-E7E6-434B-9C0C-680EBEBB3608");
//        URLConnection bit = urlBit.openConnection();
//        URLConnection lite = urlLite.openConnection();
//        URLConnection ripple = urlRipple.openConnection();
//        URLConnection eos = urlEos.openConnection();
//        URLConnection eur = urlEur.openConnection();
//        InputStream bitCoin = bit.getInputStream();
//        InputStream liteCoin = lite.getInputStream();
//        InputStream rippleCoin = ripple.getInputStream();
//        InputStream eosCoin = eos.getInputStream();
//        InputStream eurCoin = eur.getInputStream();


    }






    public void browser1(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.coinbase.com/"));
        startActivity(browserIntent);
    }

    public void browser2(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://uphold.com/"));
        startActivity(browserIntent);
    }

}
