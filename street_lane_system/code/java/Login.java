package com.arvi.slc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText usr, pass;
    Button blogin, bclear;
    String user = "user", usPassword = "12345", admin = "admin", adPassword = "98765", finaluser, finalpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usr = (EditText) findViewById(R.id.editTextUser);
        pass = (EditText) findViewById(R.id.editTextPass);
        blogin = (Button) findViewById(R.id.blogin);
        bclear = (Button) findViewById(R.id.bclear);

        blogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finaluser = usr.getText().toString();
                finalpass = pass.getText().toString();
                if (finaluser.equalsIgnoreCase("") || finalpass.equalsIgnoreCase("")) {
                    Toast.makeText(getApplicationContext(), "Please fill all details first !!", Toast.LENGTH_SHORT).show();
                } else if (finaluser.equalsIgnoreCase(user) && finalpass.equalsIgnoreCase(usPassword)) {
                    Contents c = new Contents(0);
                    c.setState(0);
                    Intent usr = new Intent(Login.this, ControlPage.class);
                    startActivity(usr);
                    Toast.makeText(getApplicationContext(), "Welcome User !!", Toast.LENGTH_SHORT).show();
                } else if (finaluser.equalsIgnoreCase(admin) && finalpass.equalsIgnoreCase(adPassword)) {
                    Contents c = new Contents(1);
                    c.setState(1);
                    Intent adm = new Intent(Login.this, ControlPage.class);
                    startActivity(adm);
                    Toast.makeText(getApplicationContext(), "Welcome Admin !!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "User doesn't exist !!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usr.setText("");
                pass.setText("");
            }
        });
    }
}
