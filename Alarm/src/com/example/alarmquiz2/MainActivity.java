package com.example.alarmquiz2;

// import android.content.Context;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import java.util.Calendar;
import android.widget.Toast;
import android.content.Intent;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

// -------------------------------------------------------------------------
/**
 * This is the Quiz activity part of the application
 *
 * @author Nicholas Kilmer, Justin Whitt
 * @version Apr 7, 2014
 */
public class MainActivity
    extends Activity
{

    private int          total;
    private Settings     settings;
    private Model        mod;
    private Question     x;
    private TextView     textView1;
    private TextView     textView2;
    private Button       button1;
    private Button       button2;
    private Button       button3;
    private Button       button4;
    private Button       giveUp;
    private TextView     textView;
    private Sound        s;
    private PendingIntent pendingIntent;
    private AlarmManager alarmManager;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        settings = new Settings();
        x = new Question();
        s = new Sound();
        total = settings.getCurr();
        mod = new Model();
        textView1 = (TextView)findViewById(R.id.score);
        textView1.setText("Score: " + total);
        textView2 = (TextView)findViewById(R.id.needed);
        if (s.isPlaying())
        {

            Calendar c = Calendar.getInstance();
            c.set(Calendar.HOUR_OF_DAY, s.getHour());
            c.set(Calendar.MINUTE, s.getMinute() + 2);
            c.set(Calendar.SECOND, 30);
            c.set(Calendar.MILLISECOND, 0);

            setAlarm(c);
        }
        if (settings.getforFun() && !settings.getAlarmOff())
        {
            textView2.setText("High Score: " + settings.getHigh());
        }
        else
        {
            textView2.setText("Needed: " + settings.getNeed());
            settings.setWrong(0);
        }
        if (settings.getGivenUp() && !settings.getforFun())
        {
            this.gameWon();
        }
        button1 = (Button)findViewById(R.id.one);
        button2 = (Button)findViewById(R.id.two);
        button3 = (Button)findViewById(R.id.three);
        button4 = (Button)findViewById(R.id.four);
        giveUp = (Button)findViewById(R.id.giveup);
        giveUp.setEnabled(false);
        giveUp.setVisibility(View.INVISIBLE);
        textView = (TextView)findViewById(R.id.question);
        refresh();

    }


    public void refresh()
    {
        if (settings.getHigh() < total && settings.getforFun()
            && !settings.getAlarmOff())
        {
            settings.setHigh(total);
            textView2.setText("High Score: " + settings.getHigh());
        }
        if (settings.getUpdate())
        {
            mod.update();
        }
        if (settings.getWrong() == 5 && !settings.getforFun())
        {
            giveUp.setEnabled(true);
            giveUp.setVisibility(View.VISIBLE);
        }
        x = mod.getQuestion();
        button1.setText(x.getFirst());

        button2.setText(x.getSecond());

        button3.setText(x.getThird());

        button4.setText(x.getFourth());

        textView.setText(x.getQuestion());

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    public void choiceOne(View view)
    {
        if (x.getAnswer() == 0)
        {
            total++;
            textView1.setText("Score: " + total);
            if (total == settings.getNeed() && !settings.getforFun())
            {
                gameWon();
            }
        }
        else
        {
            settings.wrong();
            total = 0;
            textView1.setText("Score: " + total);
        }
        refresh();
    }


    public void choiceThree(View view)
    {
        if (x.getAnswer() == 2)
        {
            total++;
            textView1.setText("Score: " + total);
            if (total == settings.getNeed() && !settings.getforFun())
            {
                gameWon();
            }
        }
        else
        {
            settings.wrong();
            total = 0;
            textView1.setText("Score: " + total);
        }
        refresh();
    }


    public void choiceTwo(View view)
    {
        if (x.getAnswer() == 1)
        {
            total++;
            textView1.setText("Score: " + total);
            if (total == settings.getNeed() && !settings.getforFun())
            {
                gameWon();
            }
        }
        else
        {
            settings.wrong();
            total = 0;
            textView1.setText("Score: " + total);
        }
        refresh();
    }


    public void choiceFour(View view)
    {
        if (x.getAnswer() == 3)
        {
            total++;
            textView1.setText("Score: " + total);
            if (total == settings.getNeed() && !settings.getforFun())
            {
                gameWon();
            }
        }
        else
        {
            settings.wrong();
            total = 0;
            textView1.setText("Score: " + total);
        }
        refresh();
    }


    private void gameWon()
    {
        if (settings.getGivenUp() && !settings.getforFun())
        {
            Toast.makeText(
                MainActivity.this,
                "Given Up, Turning off Alarm",
                Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(
                MainActivity.this,
                "Needed Score Reached, Turning off Alarm",
                Toast.LENGTH_LONG).show();
        }
        settings.setAlarmOff(false);
        settings.setGivenUp(false);
        settings.setGameWon(true);
        settings.setWrong(0);
        settings.setCurr(0);
        if(s.isPlaying())
        {
            pendingIntent.cancel();
            s.stopSound();
        }
        Intent i = new Intent(MainActivity.this, SecondscreenActivity.class);
        startActivity(i);

    }


    public void gaveUp(View view)
    {
        settings.setCurr(total);
        Intent i = new Intent(MainActivity.this, GiveUp.class);
        startActivity(i);
    }


    public void startSettings(View view)
    {
        settings.setCurr(total);
        settings.setForFun(false);
        settings.setNeeded(settings.getNeed());
        Intent i = new Intent(MainActivity.this, SecondscreenActivity.class);
        startActivity(i);
    }


    private void setAlarm(Calendar targetCal)
    {
        Intent intent = new Intent(getBaseContext(), AlarmReceiver.class);
        pendingIntent =
            PendingIntent.getBroadcast(getBaseContext(), 1, intent, 0);
        alarmManager = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
        alarmManager.set(
            AlarmManager.RTC_WAKEUP,
            targetCal.getTimeInMillis(),
            pendingIntent);

    }
}
