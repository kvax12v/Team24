package com.medappjam.team24.meddo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open_Newuser_Login(View view){
            Intent intent1 = new Intent(this, Newuser_Login.class);
            startActivity(intent1);
    }

    public void open_LoginActivity(View view){
        Intent intent2 = new Intent(this, LoginActivity.class);
        startActivity(intent2);
    }


}
