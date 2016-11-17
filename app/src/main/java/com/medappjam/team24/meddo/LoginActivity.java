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
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by chris on 11/13/16.
 */
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


        Button submit = (Button) findViewById(R.id.login_button);
        final EditText editText = (EditText) findViewById(R.id.editText);
        final EditText editText2 = (EditText) findViewById(R.id.editText2);
        TextView forgotpass = (TextView) findViewById(R.id.forgot);

        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                String username = editText.getText().toString();
                String password = editText2.getText().toString();

                checkinput(username,password);


            }
        });


        forgotpass.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {

            }
        });

    }


    public void checkinput(String username, String password)
    {
        

    }


}
