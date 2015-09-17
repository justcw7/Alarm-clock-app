package com.example.alarmquiz2;

import android.widget.CheckBox;
import android.view.View;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.content.Intent;

// -------------------------------------------------------------------------
/**
 * This part of the application is used for setting time
 *
 * @author Justin Whitt
 * @version Apr 7, 2014
 */
public class CategoriesScreen
    extends Activity
{
    private Button   finished;
    private Settings settings;
    private CheckBox group1;
    private CheckBox group2;
    private CheckBox group3;
    private CheckBox group4;
    private CheckBox group5;
    private CheckBox group6;
    private CheckBox group7;
    private CheckBox group8;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        settings = new Settings();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);
        finished = (Button)findViewById(R.id.finished);
        group1 = (CheckBox)findViewById(R.id.group1);
        group2 = (CheckBox)findViewById(R.id.group2);
        group3 = (CheckBox)findViewById(R.id.group3);
        group4 = (CheckBox)findViewById(R.id.group4);
        group6 = (CheckBox)findViewById(R.id.group5);
        group5 = (CheckBox)findViewById(R.id.group6);
        group7 = (CheckBox)findViewById(R.id.group7);
        group8 = (CheckBox)findViewById(R.id.group8);
        group1.setChecked(settings.getGroup1());
        group2.setChecked(settings.getGroup2());
        group3.setChecked(settings.getGroup3());
        group4.setChecked(settings.getGroup4());
        group5.setChecked(settings.getGroup5());
        group6.setChecked(settings.getGroup6());
        group7.setChecked(settings.getGroup7());
        group8.setChecked(settings.getGroup8());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.categories, menu);
        return true;
    }


    public void finished(View view)
    {
        settings.setGroup1(group1.isChecked());
        settings.setGroup2(group2.isChecked());
        settings.setGroup3(group3.isChecked());
        settings.setGroup4(group4.isChecked());
        settings.setGroup5(group5.isChecked());
        settings.setGroup6(group6.isChecked());
        settings.setGroup7(group7.isChecked());
        settings.setGroup8(group8.isChecked());
        Intent i =
            new Intent(CategoriesScreen.this, SecondscreenActivity.class);
        startActivity(i);
    }
}
