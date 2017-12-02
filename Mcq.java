package com.example.dell.bhamashah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by DELL on 12/3/2017.
 */

public class Mcq extends MainActivity {
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mcq);
        b1= (Button) findViewById(R.id.su1);
        b2= (Button) findViewById(R.id.su2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Mcq.this,Ongoing.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Mcq.this,Upcomming.class);
                startActivity(i);
            }
        });

    }
}