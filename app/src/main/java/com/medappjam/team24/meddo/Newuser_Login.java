package com.medappjam.team24.meddo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Newuser_Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_newuser__login);

        final EditText username_editText = (EditText) findViewById(R.id.editText8);
        final EditText password_editText = (EditText) findViewById(R.id.editText9);

        final Button back_button = (Button) findViewById(R.id.back_button);
        final Button signup_button = (Button) findViewById(R.id.signup_button);

        signup_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //send to data base
                //fxn to view homescreen
            }
        });

    }

    public void open_MainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
