package com.example.alarmquiz2;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothSocket;
import java.io.OutputStream;
import java.util.UUID;
import android.bluetooth.BluetoothDevice;
import java.io.IOException;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.content.Context;

// -------------------------------------------------------------------------
/**
 * sets,plays, and stops the sound
 *
 * @author Nicholas Kilmer
 * @version Apr 9, 2014
 */
public class Sound
{
    private static MediaPlayer mp = new MediaPlayer();
    private static int hour;
    private static int minute;
    private static BluetoothSocket   btSocket;
    private static OutputStream      sender;
    private static String     address           = "00:14:03:18:42:19";
    private static final UUID MY_UUID           =
                                                    UUID.fromString("00001101-0000-1000-8000-00805f9b34fb");
    private static BluetoothAdapter          mBluetoothAdapter = BluetoothAdapter
                                                    .getDefaultAdapter();



    public Sound()
    {
        Settings settings = new Settings();
    }

    public void reset()
    {
            {

                BluetoothDevice remoteDevice =
                    mBluetoothAdapter.getRemoteDevice(address);
                try
                {
                    btSocket =
                        remoteDevice.createRfcommSocketToServiceRecord(MY_UUID);
                }
                catch (IOException e)
                {
                }
                try
                {
                    btSocket.connect();
                }
                catch (IOException e)
                {
                }

                try
                {
                    sender = btSocket.getOutputStream();
                }
                catch (IOException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

    }


    public void setSound(Context context)
    {
        Uri notification =
            RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);

        try
        {
            mp.setDataSource(context, notification);
            mp.setLooping(true);
            mp.prepare();
        }
        catch (Exception e)
        {

        }
        mp.start();


        if (mBluetoothAdapter != null)
        {
            if (!mBluetoothAdapter.isEnabled())
            {
            }
            else
            {
                this.reset();
                try
                {
                    byte[] msg = ("1").getBytes();
                    sender.write(msg);
                }
                catch (IOException e)
                {

                }
            }
        }


    }


    public void stopSound()
    {
        mp.pause();

        if (mBluetoothAdapter != null)
        {
            if (!mBluetoothAdapter.isEnabled())
            {
            }
            else
            {
                try
                {
                    byte[] msg = ("0").getBytes();
                    sender.write(msg);
                }
                catch (IOException e)
                {

                }
                try
                {
                    sender.close();
                    btSocket.close();
                }
                catch (IOException e)
                {
                }
            }

            }
    }
    public boolean isPlaying()
    {
        return mp.isPlaying();
    }
    public void setHour(int HOUR)
    {
        hour = HOUR;
    }
    public void setMinute(int MINUTE)
    {
        minute = MINUTE;
    }
    public int getHour()
    {
        return hour;
    }
    public int getMinute()
    {
        return minute;
    }

}
