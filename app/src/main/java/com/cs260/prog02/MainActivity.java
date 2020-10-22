package com.cs260.prog02;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.fragment.NavHostFragment;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void search_by_address(View view) {
        Intent intent = new Intent(this, SecondFragment.class);
        startActivity(intent);
    }

    public void get_current_location(View view) {
        // get current location 然后作为数据传输进去
        Intent intent = new Intent(this, ResultSearch.class);
        startActivity(intent);
    }

    public void random_search(View view) {
        // 做一个list，然后随机选一个，然后传进去
        Intent intent = new Intent(this, ResultSearch.class);
        startActivity(intent);
    }
}