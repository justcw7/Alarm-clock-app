package com.example.alarmquiz2;

import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class GiveUp
    extends Activity
{

    private Settings settings;
    private EditText userBox;
    private TextView message;
    private Button   cancel;
    private Button   finished;
    private String   input;
    private String   neededMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        settings = new Settings();
        neededMessage = "I am a failure.";
        setContentView(R.layout.giveup);
        userBox = (EditText)findViewById(R.id.userbox);
        message = (TextView)findViewById(R.id.message);
        cancel = (Button)findViewById(R.id.cancel);
        finished = (Button)findViewById(R.id.finished);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.secondscreen, menu);
        return true;
    }


    public void cancel(View view)
    {
        Intent i = new Intent(GiveUp.this, MainActivity.class);
        startActivity(i);
    }


    public void finished(View view)
    {
        input = userBox.getText().toString();
        if (input.equals(neededMessage))
        {
            settings.setGivenUp(true);
            Intent i = new Intent(GiveUp.this, MainActivity.class);
            startActivity(i);
        }
        else
        {
            message.setText("Incorrect message... you fail at failing");
        }

    }

}
