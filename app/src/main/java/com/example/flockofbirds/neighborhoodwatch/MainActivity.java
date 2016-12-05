package com.example.flockofbirds.neighborhoodwatch;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;

public class MainActivity extends AppCompatActivity {
    Button btnReport, btnAlert, btnSOS;
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialisation();

        btnReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start your second activity
                Intent intent = new Intent(MainActivity.this, MyAndroidAppActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initialisation() {
        btnReport = (Button) findViewById(R.id.btnReport);
        btnAlert = (Button) findViewById(R.id.btnAlerts);
        btnSOS = (Button) findViewById(R.id.btnSOS);
    }
}
