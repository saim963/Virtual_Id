package com.example.virtual_id;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Display_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_page);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setTitle("Display Page");

        //intent to get data
        Intent Firstintent = getIntent();
        String name = Firstintent.getStringExtra("Name");
        String age = Firstintent.getStringExtra("Age");
        String address = Firstintent.getStringExtra("Address");

        //TextView
        TextView TextView1 = findViewById(R.id.textView1);

        //set text
        TextView1.setText("Name: "+name+"\nAge: "+age+"\nAddress: "+address);
    }
}