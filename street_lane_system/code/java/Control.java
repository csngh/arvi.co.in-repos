package com.arvi.slc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ControlPage extends AppCompatActivity {

    Button ln1, ln2, ln3;
    int state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_page);

        ln1 = (Button) findViewById(R.id.bln1);
        ln2 = (Button) findViewById(R.id.bln2);
        ln3 = (Button) findViewById(R.id.bln3);

        ln1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pass1 = new Intent(ControlPage.this, Lane1.class);
                startActivity(pass1);
            }
        });

        ln2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contents c = new Contents();
                state = c.getState();
                if (state == 1) {
                    Intent pass2 = new Intent(ControlPage.this, Lane1.class);
                    startActivity(pass2);
                } else if (state == 0) {
                    Toast.makeText(getApplicationContext(), "You are Not Authorized to Access the Lane !!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ln3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contents c = new Contents();
                state = c.getState();
                if (state == 1) {
                    Intent pass3 = new Intent(ControlPage.this, Lane1.class);
                    startActivity(pass3);
                } else if (state == 0) {
                    Toast.makeText(getApplicationContext(), "You are Not Authorized to Access the Lane !!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
