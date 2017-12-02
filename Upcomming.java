package com.example.dell.bhamashah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by DELL on 12/3/2017.
 */

public class Upcomming extends MainActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upcomming);
        b1= (Button) findViewById(R.id.upcomming);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Upcomming.this,"your response has been successfully submitted ",Toast.LENGTH_LONG).show();
                Intent i =new Intent(Upcomming.this,MainActivity.class);
                startActivity(i);
            }
        });

    }
}