package com.example.tobbaccobarningsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ColoringActivity extends AppCompatActivity {
       Button buttonEnter;
       EditText editText;
       TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coloring);
        buttonEnter =(Button) findViewById(R.id.buttonEnter);
        editText = (EditText) findViewById(R.id.editTextTemp);
        textView1=(TextView) findViewById(R.id.textView2);




        buttonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tempr = Integer.parseInt(editText.getText().toString());
                textView1.setText(String.valueOf(tempr));

            }
        });
    }
}