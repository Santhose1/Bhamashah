package com.example.dell.bhamashah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by DELL on 12/3/2017.
 */

public class Ongoing extends MainActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ongoing);
        b1= (Button) findViewById(R.id.current);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Ongoing.this,"your response has been successfully submitted ",Toast.LENGTH_LONG).show();
                Intent i =new Intent(Ongoing.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
