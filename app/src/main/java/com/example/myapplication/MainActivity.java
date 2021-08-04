package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    public final double dollar = 75.0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick(View view)
    {
        Button button = (Button) findViewById(R.id.button);
        EditText nominal = (EditText) findViewById(R.id.Nominal);
        EditText kolichestvo = (EditText) findViewById(R.id.Kolichestvo);
        TextView textView = (TextView) findViewById(R.id.textView);
        double Nominal = Double.parseDouble(nominal.getText().toString());
        double Kolichestvo = Double.parseDouble(kolichestvo.getText().toString());
        double result1 = (Kolichestvo * Nominal) / dollar;
        String ac = Double.toString(result1);
        textView.setText(ac);
    }
}
