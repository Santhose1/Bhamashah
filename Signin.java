package com.example.dell.bhamashah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by DELL on 12/2/2017.
 */

public class Signin extends MainActivity {
    EditText d1,d2;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
        d1= (EditText) findViewById(R.id.s1);
        d2= (EditText) findViewById(R.id.s2);
        b2= (Button) findViewById(R.id.button4);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addlog();
            }
        });
    }
    public void addlog(){
        String Bhamasha_id=d1.getText().toString();
        String password=d2.getText().toString();
        if(Bhamasha_id.length()==0||password.length()==0){
            Toast.makeText(Signin.this,"please fill all the fields",Toast.LENGTH_LONG).show();
        }
        else{
            Intent i=new Intent(Signin.this,Mcq.class);
            startActivity(i);
        }
    }
}