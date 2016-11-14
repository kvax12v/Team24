package com.medappjam.team24.meddo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Newuser_Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_newuser__login);

        final Button back_button = (Button) findViewById(R.id.back_button);
        final Button signup_button = (Button) findViewById(R.id.signup_button);

        back_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //fxn to view homescreen
            }
        });

        signup_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //send to data base
                //fxn to view homescreen
            }
        });

    }
}
