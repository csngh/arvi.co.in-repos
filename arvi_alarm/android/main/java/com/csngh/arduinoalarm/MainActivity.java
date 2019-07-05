package com.csngh.arduinoalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker = (TimePicker) findViewById(R.id.timePicker);

        //Setting alarm
        findViewById(R.id.bSetAlarm).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Calendar calendar = Calendar.getInstance();

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                    calendar.set(calendar.get(Calendar.YEAR),
                            calendar.get(Calendar.MONTH),
                            calendar.get(Calendar.DAY_OF_MONTH),
                            timePicker.getHour(),
                            timePicker.getMinute(),
                            0
                    );
                } else {
                    calendar.set(calendar.get(Calendar.YEAR),
                            calendar.get(Calendar.MONTH),
                            calendar.get(Calendar.DAY_OF_MONTH),
                            timePicker.getCurrentHour(),
                            timePicker.getCurrentMinute(),
                            0
                    );
                }

                Toast.makeText(getApplicationContext(), "Set on: " + timePicker.getCurrentHour() + ":" + timePicker.getCurrentMinute(), Toast.LENGTH_LONG).show();
                setAlarm(calendar.getTimeInMillis());
                /*mYear = calendar.get(Calendar.YEAR);
                mMonth = calendar.get(Calendar.MONTH);
                mDay = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dpd = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                String month = "";
                                if ((monthOfYear + 1) < 10)
                                    month = "0" + (monthOfYear + 1);
                                else
                                    month = String.valueOf((monthOfYear + 1));

                                String day = "";
                                if (dayOfMonth < 10)
                                    day = "0" + dayOfMonth;
                                else
                                    day = String.valueOf(dayOfMonth);

                                calendar.set(year, Integer.parseInt(month), Integer.parseInt(day), timePicker.getCurrentHour(),
                                        timePicker.getCurrentMinute(), 0);
                                Log.i("MYTAGS", "Alarm Set to " + String.valueOf(day) + "th, " +
                                        String.valueOf(year + ":" + month));
                                Log.i("MYTAGS", String.valueOf(calendar.getTimeInMillis()));
                                setAlarm(calendar.getTimeInMillis());
                            }

                        }, mYear, mMonth, mDay);
                dpd.show();*/
            }
        });
    }

    //Intent for broadcast
    private void setAlarm(long time) {
        AlarmManager am = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent i = new Intent(MainActivity.this, AlarmReciever.class);
        PendingIntent pi = PendingIntent.getBroadcast(this, 0, i, 0);
        am.setRepeating(AlarmManager.RTC, time, AlarmManager.INTERVAL_DAY, pi);
        Toast.makeText(this, "Alarm Set", Toast.LENGTH_SHORT).show();
    }
}
