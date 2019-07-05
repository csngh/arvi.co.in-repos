package com.arvi.wgc;

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
	BluetoothSocket sok;
	BluetoothDevice dev;
	OutputStream outs;
	InputStream inps;
	String btmane = "HC-06";
	int state;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Checking if Bluetooth is Available
		mba = BluetoothAdapter.getDefaultAdapter();
		if (mba == null) {
			Toast.makeText(getApplicationContext(),
					"Bluetooth not supported in this device", Toast.LENGTH_LONG)
					.show();
		} else if (!mba.isEnabled()) {
			mba.enable();
			Toast.makeText(getApplicationContext(),
					"Bluetooth Enabled Automatically", Toast.LENGTH_SHORT)
					.show();
		} else {
			Toast.makeText(getApplicationContext(), "Bluetooth On",
					Toast.LENGTH_SHORT).show();

		}

		final ToggleButton activate = (ToggleButton) findViewById(R.id.actibt);
		activate.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Set<BluetoothDevice> pairedDevices = mba.getBondedDevices();
				if (activate.isChecked()) {
					try {
						if (pairedDevices.size() > 0) {
							Toast.makeText(getApplicationContext(),
									"Please Wait for a Moment !!",
									Toast.LENGTH_SHORT).show();
							for (BluetoothDevice device : pairedDevices) {
								if (device.getName().equalsIgnoreCase(btmane)) {
									dev = device;
									UUID uuid = UUID
											.fromString("00001101-0000-1000-8000-00805f9b34fb");
									sok = dev
											.createRfcommSocketToServiceRecord(uuid);
									sok.connect();
									outs = sok.getOutputStream();
									inps = sok.getInputStream();
									Toast.makeText(getApplicationContext(),
											"Connected", Toast.LENGTH_LONG)
											.show();
									state = 1;
									break;
								} else if (!device.getName().equalsIgnoreCase(
										btmane)) {
									Toast.makeText(getApplicationContext(),
											"Error, No Module",
											Toast.LENGTH_SHORT).show();
									state = 0;
									activate.toggle();
									break;
								}
							}
						} else if (pairedDevices.isEmpty()) {
							Toast.makeText(getApplicationContext(),
									"Please pair with HC-06 first",
									Toast.LENGTH_SHORT).show();
							state = 0;
							activate.toggle();
						}
					} catch (IOException e) {
						state = 0;
						e.printStackTrace();
						Toast.makeText(getApplicationContext(),
								"Error in Establishing Connection",
								Toast.LENGTH_SHORT).show();
						activate.toggle();
					}
				}

				else if (!activate.isChecked()) {
					try {
						state = 0;
						sok.close();
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

		final ToggleButton l1 = (ToggleButton) findViewById(R.id.toggle1);
		l1.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				if (l1.isChecked()) {
					if (state == 1) {
						try {
							outs.write('0');
						} catch (IOException e) {
							Toast.makeText(getApplicationContext(),
									"Connection Failed", Toast.LENGTH_SHORT)
									.show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(getApplicationContext(),
								"Connection With Any Room First",
								Toast.LENGTH_SHORT).show();
				} else {
					if (state == 1) {
						try {
							outs.write('a');
						} catch (IOException e) {
							Toast.makeText(getApplicationContext(),
									"Connection Failed", Toast.LENGTH_SHORT)
									.show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(getApplicationContext(),
								"Connection With Any Room First",
								Toast.LENGTH_SHORT).show();
				}
			}
		});

		final ToggleButton l2 = (ToggleButton) findViewById(R.id.toggle2);
		l2.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				if (l2.isChecked()) {
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
								"Connection With Any Room First",
								Toast.LENGTH_SHORT).show();
				} else {
					if (state == 1) {
						try {
							outs.write('b');
						} catch (IOException e) {
							Toast.makeText(getApplicationContext(),
									"Connection Failed", Toast.LENGTH_SHORT)
									.show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(getApplicationContext(),
								"Connection With Any Room First",
								Toast.LENGTH_SHORT).show();
				}
			}
		});

		final ToggleButton l3 = (ToggleButton) findViewById(R.id.toggle3);
		l3.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				if (l3.isChecked()) {
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
								"Connection With Any Room First",
								Toast.LENGTH_SHORT).show();
				} else {
					if (state == 1) {
						try {
							outs.write('c');
						} catch (IOException e) {
							Toast.makeText(getApplicationContext(),
									"Connection Failed", Toast.LENGTH_SHORT)
									.show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(getApplicationContext(),
								"Connection With Any Room First",
								Toast.LENGTH_SHORT).show();
				}
			}
		});

		final ToggleButton l4 = (ToggleButton) findViewById(R.id.toggle4);
		l4.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				if (l4.isChecked()) {
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
								"Connection With Any Room First",
								Toast.LENGTH_SHORT).show();
				} else {
					if (state == 1) {
						try {
							outs.write('d');
						} catch (IOException e) {
							Toast.makeText(getApplicationContext(),
									"Connection Failed", Toast.LENGTH_SHORT)
									.show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(getApplicationContext(),
								"Connection With Any Room First",
								Toast.LENGTH_SHORT).show();
				}
			}
		});

		final ToggleButton l5 = (ToggleButton) findViewById(R.id.toggle5);
		l5.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				if (l5.isChecked()) {
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
								"Connection With Any Room First",
								Toast.LENGTH_SHORT).show();
				} else {
					if (state == 1) {
						try {
							outs.write('e');
						} catch (IOException e) {
							Toast.makeText(getApplicationContext(),
									"Connection Failed", Toast.LENGTH_SHORT)
									.show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(getApplicationContext(),
								"Connection With Any Room First",
								Toast.LENGTH_SHORT).show();
				}
			}
		});

		final ToggleButton l6 = (ToggleButton) findViewById(R.id.toggle6);
		l6.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				if (l6.isChecked()) {
					if (state == 1) {
						try {
							outs.write('5');
						} catch (IOException e) {
							Toast.makeText(getApplicationContext(),
									"Connection Failed", Toast.LENGTH_SHORT)
									.show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(getApplicationContext(),
								"Connection With Any Room First",
								Toast.LENGTH_SHORT).show();
				} else {
					if (state == 1) {
						try {
							outs.write('f');
						} catch (IOException e) {
							Toast.makeText(getApplicationContext(),
									"Connection Failed", Toast.LENGTH_SHORT)
									.show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(getApplicationContext(),
								"Connection With Any Room First",
								Toast.LENGTH_SHORT).show();
				}
			}
		});
		final ToggleButton l7 = (ToggleButton) findViewById(R.id.toggle7);
		l7.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				if (l7.isChecked()) {
					if (state == 1) {
						try {
							outs.write('6');
						} catch (IOException e) {
							Toast.makeText(getApplicationContext(),
									"Connection Failed", Toast.LENGTH_SHORT)
									.show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(getApplicationContext(),
								"Connection With Any Room First",
								Toast.LENGTH_SHORT).show();
				} else {
					if (state == 1) {
						try {
							outs.write('g');
						} catch (IOException e) {
							Toast.makeText(getApplicationContext(),
									"Connection Failed", Toast.LENGTH_SHORT)
									.show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(getApplicationContext(),
								"Connection With Any Room First",
								Toast.LENGTH_SHORT).show();
				}
			}
		});
		final ToggleButton l8 = (ToggleButton) findViewById(R.id.toggle8);
		l8.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				if (l8.isChecked()) {
					if (state == 1) {
						try {
							outs.write('7');
						} catch (IOException e) {
							Toast.makeText(getApplicationContext(),
									"Connection Failed", Toast.LENGTH_SHORT)
									.show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(getApplicationContext(),
								"Connection With Any Room First",
								Toast.LENGTH_SHORT).show();
				} else {
					if (state == 1) {
						try {
							outs.write('h');
						} catch (IOException e) {
							Toast.makeText(getApplicationContext(),
									"Connection Failed", Toast.LENGTH_SHORT)
									.show();
							e.printStackTrace();
						}
					} else
						Toast.makeText(getApplicationContext(),
								"Connection With Any Room First",
								Toast.LENGTH_SHORT).show();
				}
			}
		});

	}

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
