package com.cs260.prog02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ResultSearch extends AppCompatActivity {

    String api_key = "AIzaSyDAPFpmm620lRGeVN5v3qtwFvtkqOZbtdo";
    String GEO_URL = "https://maps.googleapis.com/maps/api/geocode/json";
    String address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle extras = getIntent().getExtras();
//        if (extras == null) {
//            return;
//        }
//        address = extras.getString("address");
//        String zipcode = extras.getString("zipcode");
//        System.out.println("address");
//        System.out.println(address);
//        System.out.println("zipcode");
//        System.out.println(zipcode);
//        if(zipcode != null) {
//            address = convertToAddress(zipcode);
//        }
        //searchResult(address);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_result);
//        TextView addressTV = findViewById(R.id.address);
//        addressTV.setText(address);
    }

    public void get_detail(View view) {
        Intent intent = new Intent(this, DetailGet.class);
        startActivity(intent);
    }

    public String convertToAddress(String zipcode) {
        return null;
    }

    public void searchResult(String address) {
        // Instantiate the RequestQueue.
        System.out.println("in search result");
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://www.googleapis.com/civicinfo/v2/representatives";

        // Request a string response from the provided URL.
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    System.out.println("in search result123");
                    JSONArray officials = response.getJSONArray("officials");
                    System.out.println(officials);
                } catch(JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                TextView textView = findViewById(R.id.textView);
                textView.setText("error");
            }
        });

        // Add the request to the RequestQueue.
        queue.add(request);
    }
}