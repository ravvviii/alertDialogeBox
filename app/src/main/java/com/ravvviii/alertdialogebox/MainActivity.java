package com.ravvviii.alertdialogebox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AlertDialog.Builder alertdia = new AlertDialog.Builder(MainActivity.this);

        alertdia.setTitle("Terms & Conditions:");
        alertdia.setIcon(R.drawable.baseline_add_alert_24);
        alertdia.setMessage("Have you read all T & C");
        alertdia.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Yes, I have read", Toast.LENGTH_SHORT).show();
            }
        });

        alertdia.show();
    }
}