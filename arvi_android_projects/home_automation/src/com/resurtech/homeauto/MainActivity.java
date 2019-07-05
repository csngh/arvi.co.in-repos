package com.resurtech.homeauto;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;
import java.util.UUID;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.app.AlertDialog;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.DialogInterface;
import android.os.Bundle;

public class MainActivity extends ActionBarActivity {

	BluetoothAdapter mba;
	BluetoothSocket sok1;
	BluetoothDevice dev1;
	OutputStream outs;
	InputStream inps;
	String conn = "room1";
	int state;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/*
		 * Checking if Bluetooth is
		 * Available------------------------------------
		 * --------------------------
		 * ------------------------------------------------------------------
		 */
		mba = BluetoothAdapter.getDefaultAdapter();
		if (mba == null) {
			Toast.makeText(getApplicationContext(),
					"Bluetooth not supported in this device", Toast.LENGTH_LONG)
					.show();
			this.finish();
		} else if (!mba.isEnabled()) {
			mba.enable();
			Toast.makeText(getApplicationContext(),
					"Bluetooth Enabled Automatically", Toast.LENGTH_SHORT)
					.show();
		} else {
			Toast.makeText(getApplicationContext(), "Bluetooth On",
					Toast.LENGTH_SHORT).show();
		}

		/*
		 * 
		 * Activation------------------------------------------------------
		 * ------
		 * ----------------------------------------------------------------
		 * --------------------
		 */
		final ToggleButton act = (ToggleButton) findViewById(R.id.tactiv);
		act.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Set<BluetoothDevice> pairedDevices = mba.getBondedDevices();
				if (act.isChecked()) {
					try {
						if (pairedDevices.size() > 0) {
							Toast.makeText(getApplicationContext(),
									"Please Wait for a Moment !!",
									Toast.LENGTH_SHORT).show();
							for (BluetoothDevice device : pairedDevices) {
								if (device.getName().equalsIgnoreCase(conn)) {
									dev1 = device;
									UUID uuid = UUID
											.fromString("00001101-0000-1000-8000-00805f9b34fb");
									sok1 = dev1
											.createRfcommSocketToServiceRecord(uuid);
									sok1.connect();
									outs = sok1.getOutputStream();
									inps = sok1.getInputStream();
									Toast.makeText(getApplicationContext(),
											"Connected", Toast.LENGTH_LONG)
											.show();
									state = 1;
									break;
								} else if (!device.getName().equalsIgnoreCase(
										conn)) {
									Toast.makeText(getApplicationContext(),
											"Error, No Device",
											Toast.LENGTH_SHORT).show();
									state = 0;
									act.toggle();
									break;
								}
							}
						} else if (pairedDevices.isEmpty()) {
							Toast.makeText(getApplicationContext(),
									"Please pair with the BT Device first",
									Toast.LENGTH_SHORT).show();
							state = 0;
							act.toggle();
						}
					} catch (IOException e) {
						state = 0;
						e.printStackTrace();
						Toast.makeText(getApplicationContext(),
								"Error in Establishing Connection",
								Toast.LENGTH_SHORT).show();
						act.toggle();
					}
				}

				else if (!act.isChecked()) {
					try {
						state = 0;
						sok1.close();
						Toast.makeText(getApplicationContext(),
								"Connection Closed", Toast.LENGTH_SHORT).show();
					} catch (Exception e) {
						Toast.makeText(getApplicationContext(),
								"Error Closing Connection", Toast.LENGTH_SHORT)
								.show();
					}

				}
			}
		});

		/*
		 * Light
		 * On/Off----------------------------------------------------------
		 * ------
		 * ----------------------------------------------------------------
		 * ---------------------
		 */
		final ToggleButton light = (ToggleButton) findViewById(R.id.lightbt);
		light.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				if (light.isChecked()) {
					if (state == 1) {
						try {
							outs.write('1');
						} catch (IOException e) {
							Toast.makeText(getApplicationContext(),
									"Connection Failed", Toast.LENGTH_SHORT)
									.show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(getApplicationContext(),
								"Connection With Any Device First",
								Toast.LENGTH_SHORT).show();
				} else {
					if (state == 1) {
						try {
							outs.write('2');
						} catch (IOException e) {
							Toast.makeText(getApplicationContext(),
									"Connection Failed", Toast.LENGTH_SHORT)
									.show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(getApplicationContext(),
								"Connection With Any Device First",
								Toast.LENGTH_SHORT).show();
				}
			}
		});

		/*
		 * Fan
		 * On/Off------------------------------------------------------------
		 * ----
		 * ------------------------------------------------------------------
		 * --------------------
		 */
		final ToggleButton fan = (ToggleButton) findViewById(R.id.fanbt);
		fan.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				if (fan.isChecked()) {
					if (state == 1) {
						try {
							outs.write('3');
						} catch (IOException e) {
							Toast.makeText(getApplicationContext(),
									"Connection Failed", Toast.LENGTH_SHORT)
									.show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(getApplicationContext(),
								"Connection With Any Device First",
								Toast.LENGTH_SHORT).show();
				} else {
					if (state == 1) {
						try {
							outs.write('4');
						} catch (IOException e) {
							Toast.makeText(getApplicationContext(),
									"Connection Failed", Toast.LENGTH_SHORT)
									.show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(getApplicationContext(),
								"Connection With Any Device First",
								Toast.LENGTH_SHORT).show();
				}
			}
		});

	}

	/*
	 * On Pressing Back
	 * Button----------------------------------------------------
	 * ----------------
	 * ---------------------------------------------------------------------
	 */
	@Override
	public void onBackPressed() {
		AlertDialog.Builder alertDialogBuilderex = new AlertDialog.Builder(this);
		alertDialogBuilderex.setTitle("Sure to exit?");
		alertDialogBuilderex
				.setCancelable(false)
				.setPositiveButton("Yes",
						new DialogInterface.OnClickListener() {

							@Override
							public void onClick(DialogInterface dialog, int arg1) {
								MainActivity.this.finish();
							}
						})
				.setNegativeButton("No", new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int arg1) {
						dialog.cancel();
					}
				});
		AlertDialog alertDialogex = alertDialogBuilderex.create();
		alertDialogex.show();
	}
}
