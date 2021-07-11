package com.example.virtual_id;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Name,Age,Address;
    private Button Submit;
    private EditText enterName,enterAge,enterAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setTitle("Virtual Id");

        EditText NameEdt = findViewById(R.id.entername);
        EditText AgeEdt = findViewById(R.id.enterage);
        EditText AddressEdt = findViewById(R.id.enteraddress);


        Submit = (Button) findViewById(R.id.button);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get data from edit text
                String name = NameEdt.getText().toString();
                String age =AgeEdt.getText().toString();
                String address = AddressEdt.getText().toString();

                //activity intent errors
                Intent Firstintent = new Intent(MainActivity.this,Display_Page.class);
                Firstintent.putExtra("Name",name);
                Firstintent.putExtra("Age",age);
                Firstintent.putExtra("Address",address);

                startActivity(Firstintent);
            }
        });

    }
}