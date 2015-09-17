package com.example.alarmquiz2;

import android.content.Context;
import android.widget.Toast;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.widget.EditText;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.widget.TimePicker;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

// -------------------------------------------------------------------------
/**
 * This part of the application is used for setting time
 *
 * @author Nicholas Kilmer, Justin Whitt
 * @version Apr 7, 2014
 */
public class SecondscreenActivity
    extends Activity
{
    private int          hour;
    private int          minute;
    private int          a;
    private TimePicker   time;
    private Settings     settings;
    private EditText     text;
    private EditText     numInput;
    private AlarmManager alarmManager;
    private Sound s;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        settings = new Settings();
        s = new Sound();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondscreen);
        a = settings.getNeed();
        time = (TimePicker)findViewById(R.id.timePicker1);
        text = (EditText)findViewById(R.id.numInput);
        text.setText("" + settings.getNeed());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.secondscreen, menu);
        return true;
    }


    public void correct(View view)
    {

        hour = time.getCurrentHour();
        minute = time.getCurrentMinute();
        s.setHour(hour);
        s.setMinute(minute);


        Calendar c = Calendar.getInstance();
        if (text.getText().toString().length() > 0)
        {
            a = Integer.parseInt(text.getText().toString());
        }
        settings.setNeeded(a);
        settings.setGameWon(false);

        c.set(Calendar.HOUR_OF_DAY, hour);
        c.set(Calendar.MINUTE, minute);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);

        setAlarm(c);

    }


    public void forFun(View view)
    {
        if (!settings.getAlarmOff())
        {
            settings.setForFun(true);
        }
        Intent i = new Intent(SecondscreenActivity.this, MainActivity.class);
        startActivity(i);
    }


    public void setCategories(View view)
    {
        Intent i =
            new Intent(SecondscreenActivity.this, CategoriesScreen.class);
        startActivity(i);
    }


    private void setAlarm(Calendar targetCal)
    {

        Calendar now = Calendar.getInstance();
        //This will be true if current time is after the alarm setting
        if(now.compareTo(targetCal)>0)
        {
        	targetCal.add(hour, 24); // goes to the next day
        }
        Toast.makeText(
            SecondscreenActivity.this,
            "Alarm is set for " + targetCal.getTime().toString() + " ",
            Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getBaseContext(), AlarmReceiver.class);
        PendingIntent pendingIntent =
            PendingIntent.getBroadcast(getBaseContext(), 1, intent, 0);
        alarmManager = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
        alarmManager.set(
            AlarmManager.RTC_WAKEUP,
            targetCal.getTimeInMillis(),
            pendingIntent);

    }

}
