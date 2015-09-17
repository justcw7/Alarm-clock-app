package com.example.alarmquiz2;
// Trying to push the file now...
import android.provider.Settings.Secure;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.util.UUID;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.content.Context;
import android.widget.Toast;
import android.content.Intent;
import android.content.BroadcastReceiver;

// -------------------------------------------------------------------------
/**
 * Uses broadcast receiver to allow the alarm to work
 *
 * @author Nicholas Kilmer
 * @version Apr 9, 2014
 */
public class AlarmReceiver
    extends BroadcastReceiver
{
    Sound                     s                 = new Sound();
    Settings                  settings          = new Settings();


    public void onReceive(Context context, Intent intent)
    {

        if (!s.isPlaying() && !settings.getGameWon())
        {
            s.setSound(context);
            settings.setAlarmOff(true);
            settings.setForFun(false);
            Intent i = new Intent(context, MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
        }
        else if (s.isPlaying())
        {
            Toast.makeText(context, "Time Limit Reached", Toast.LENGTH_LONG).show();
            s.stopSound();
            settings.setAlarmOff(false);
            Intent i = new Intent(context, SecondscreenActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
        }
    }
}
