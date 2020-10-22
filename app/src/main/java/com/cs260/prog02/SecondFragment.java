package com.cs260.prog02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_second);
    }

    public void search(View view) {
        TextView address_tmp = (TextView) findViewById(R.id.address);
        String address = address_tmp.getText().toString();
        TextView zipcode_tmp = (TextView) findViewById(R.id.zip_code);
        String zipcode = zipcode_tmp.getText().toString();

        Intent intent = new Intent(this, ResultSearch.class);
        intent.putExtra("address", address);
        intent.putExtra("zipcode", zipcode);
        startActivity(intent);
    }
}