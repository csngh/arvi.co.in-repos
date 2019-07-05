package com.csngh.arduinoalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.provider.Settings;
import android.util.Log;

import java.util.Calendar;

/**
 * Created by csingh on 25/10/17.
 */

public class AlarmReciever extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectDevice cd = new ConnectDevice(context);
        int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

        MediaPlayer mp = MediaPlayer.create(context, Settings.System.DEFAULT_RINGTONE_URI);
        Vibrator v = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);

        mp.start();
        v.vibrate(1000);
        Log.i("MYTAGS", "RANGGGG !!!");

        try {
            cd.initiateBluetoothConnection();
            cd.sendData(day);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
