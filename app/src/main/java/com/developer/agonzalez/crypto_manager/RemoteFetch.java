package com.developer.agonzalez.crypto_manager;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.json.JSONArray;
import org.json.JSONObject;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

public class RemoteFetch extends AsyncTask<Void,Void,Void>
{
    String data = "";
    String data1 = "";
    String data2 = "";
    String data3 = "";
    String data4 = "";
    String data5 = "";
    double num;
    double num1;
    double num2;
    double num3;
    double num4;
    double num5;
    @Override
    protected Void doInBackground(Void ... voids)
    {
        try
        {
            URL url = new URL("https://rest.coinapi.io/v1/exchangerate/BTC/USD?apikey=2E5BB2CB-76B8-460E-8F75-3B6570456BD7");

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            InputStream inputStream = httpURLConnection.getInputStream();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line = "";
            while(line != null)
            {
                line = bufferedReader.readLine();
                data = data+ line;
            }

            String[] parse1 = data.split(",");
            data = parse1[3];
            String[] parse2 = data.split(":");
            data = parse2[1];
            String[] parse3 = data.split("} ");
            data = parse3[0];
            num = (Double.parseDouble(data));
            NumberFormat format = new DecimalFormat("#0000.00");
            format.format(num);
            data = Double.toString(num);



//            JSONArray ja = new JSONArray(data);
//            for(int i = 0; i < ja.length(); i++)
//            {
//                JSONObject jo = (JSONObject) ja.get(i);
//                singleParsed = "Time: " + jo.get("time") + "\n" +
//                               "Name: " + jo.get("asset_id_base") + "\n" +
//                               "ID: " + jo.get("asset_id_quote") + "\n" +
//                               "Rate: " + jo.get("rate");
//
//                dataParsed = dataParsed + singleParsed;
//            }


        }catch (Exception e)
        {
            e.getMessage();
        }
        try
        {
            URL url1 = new URL("https://rest.coinapi.io/v1/exchangerate/LTC/USD?apikey=2E5BB2CB-76B8-460E-8F75-3B6570456BD7");

            HttpURLConnection httpURLConnection1 = (HttpURLConnection) url1.openConnection();

            InputStream inputStream1 = httpURLConnection1.getInputStream();

            BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(inputStream1));

            String line1 = "";
            while(line1 != null)
            {
                line1 = bufferedReader1.readLine();
                data1 = data1+ line1;
            }

            String[] parse1 = data1.split(",");
            data1 = parse1[3];
            String[] parse2 = data1.split(":");
            data1 = parse2[1];
            String[] parse3 = data1.split("} ");
            data1 = parse3[0];
            num1 = (Double.parseDouble(data1));
            NumberFormat format1 = new DecimalFormat("#0000.00");
            format1.format(num1);
            data1 = Double.toString(num1);



//            JSONArray ja = new JSONArray(data);
//            for(int i = 0; i < ja.length(); i++)
//            {
//                JSONObject jo = (JSONObject) ja.get(i);
//                singleParsed = "Time: " + jo.get("time") + "\n" +
//                               "Name: " + jo.get("asset_id_base") + "\n" +
//                               "ID: " + jo.get("asset_id_quote") + "\n" +
//                               "Rate: " + jo.get("rate");
//
//                dataParsed = dataParsed + singleParsed;
//            }


        }catch (Exception e)
        {
            e.getMessage();
        }

        try
        {
            URL url2 = new URL("https://rest.coinapi.io/v1/exchangerate/XRP/USD?apikey=2E5BB2CB-76B8-460E-8F75-3B6570456BD7");

            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url2.openConnection();

            InputStream inputStream2 = httpURLConnection2.getInputStream();

            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream2));

            String line2 = "";
            while(line2 != null)
            {
                line2 = bufferedReader2.readLine();
                data2 = data2+ line2;
            }

            String[] parse1 = data2.split(",");
            data2 = parse1[3];
            String[] parse2 = data2.split(":");
            data2 = parse2[1];
            String[] parse3 = data2.split("} ");
            data2 = parse3[0];
            num2 = (Double.parseDouble(data2));
            NumberFormat format2 = new DecimalFormat("#0000.00");
            format2.format(num2);
            data2 = Double.toString(num2);



//            JSONArray ja = new JSONArray(data);
//            for(int i = 0; i < ja.length(); i++)
//            {
//                JSONObject jo = (JSONObject) ja.get(i);
//                singleParsed = "Time: " + jo.get("time") + "\n" +
//                               "Name: " + jo.get("asset_id_base") + "\n" +
//                               "ID: " + jo.get("asset_id_quote") + "\n" +
//                               "Rate: " + jo.get("rate");
//
//                dataParsed = dataParsed + singleParsed;
//            }


        }catch (Exception e)
        {
            e.getMessage();
        }

        try
        {
            URL url3 = new URL("https://rest.coinapi.io/v1/exchangerate/EOS/USD?apikey=2E5BB2CB-76B8-460E-8F75-3B6570456BD7");

            HttpURLConnection httpURLConnection3 = (HttpURLConnection) url3.openConnection();

            InputStream inputStream3 = httpURLConnection3.getInputStream();

            BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(inputStream3));

            String line3 = "";
            while(line3 != null)
            {
                line3 = bufferedReader3.readLine();
                data3 = data3+ line3;
            }

            String[] parse1 = data3.split(",");
            data3 = parse1[3];
            String[] parse2 = data3.split(":");
            data3 = parse2[1];
            String[] parse3 = data3.split("} ");
            data3 = parse3[0];
            num3 = (Double.parseDouble(data3));
            NumberFormat format3 = new DecimalFormat("#0000.00");
            format3.format(num3);
            data3 = Double.toString(num3);
        }catch (Exception e)
        {
            e.getMessage();
        }

        try
        {
            URL url4 = new URL("https://rest.coinapi.io/v1/exchangerate/ETH/USD?apikey=2E5BB2CB-76B8-460E-8F75-3B6570456BD7");

            HttpURLConnection httpURLConnection4 = (HttpURLConnection) url4.openConnection();

            InputStream inputStream4 = httpURLConnection4.getInputStream();

            BufferedReader bufferedReader4 = new BufferedReader(new InputStreamReader(inputStream4));

            String line4 = "";
            while(line4 != null)
            {
                line4 = bufferedReader4.readLine();
                data4 = data4+ line4;
            }

            String[] parse1 = data4.split(",");
            data4 = parse1[3];
            String[] parse2 = data4.split(":");
            data4 = parse2[1];
            String[] parse3 = data4.split("} ");
            data4 = parse3[0];
            num4 = (Double.parseDouble(data4));
            NumberFormat format4 = new DecimalFormat("#0000.00");
            format4.format(num4);
            data4 = Double.toString(num4);
        }catch (Exception e)
        {
            e.getMessage();
        }
        return null;







    }


    @Override
    protected void onPostExecute(Void aVoid)
    {
        super.onPostExecute(aVoid);

        CryptoCurrencies.txtView.setText(this.data);
        CryptoCurrencies.txtView2.setText(this.data1);
        CryptoCurrencies.txtView3.setText(this.data2);
        CryptoCurrencies.txtView4.setText(this.data3);
        CryptoCurrencies.txtView5.setText(this.data4);
    }



}
