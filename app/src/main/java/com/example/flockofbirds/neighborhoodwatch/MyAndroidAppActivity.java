package com.example.flockofbirds.neighborhoodwatch;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MyAndroidAppActivity extends Activity {

	private Spinner spinner1;
	private Button btnSubmit;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_report);

		// Create an instance of GoogleAPIClient.
//		if (mGoogleApiClient == null) {
//			mGoogleApiClient = new GoogleApiClient.Builder(this)
//					.addConnectionCallbacks(this)
//					.addOnConnectionFailedListener(this)
//					.addApi(LocationServices.API)
//					.build();
//		}

		addListenerOnButton();
		addListenerOnSpinnerItemSelection();
		getLastLocation();
	}

	private void getLastLocation() {

	}

	public void addListenerOnSpinnerItemSelection(){
		
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	}
	
	//get the selected dropdown list value
	public void addListenerOnButton() {

		spinner1 = (Spinner) findViewById(R.id.spinner1);

		btnSubmit = (Button) findViewById(R.id.btnSubmit);

		btnSubmit.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Toast.makeText(MyAndroidAppActivity.this,
						"OnClickListener : " + 
						"\nSpinner 1 : " + String.valueOf(spinner1.getSelectedItem()),
						Toast.LENGTH_SHORT).show();
			}

		});

	}

}