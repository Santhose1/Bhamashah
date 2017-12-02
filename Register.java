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

public class Register extends MainActivity{
    EditText a1,a2,a3,a4,a5;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        a1= (EditText) findViewById(R.id.e1);
        a2= (EditText) findViewById(R.id.e2);
        a3= (EditText) findViewById(R.id.e3);
        a4= (EditText) findViewById(R.id.e4);
        a5= (EditText) findViewById(R.id.e5);
        b1= (Button) findViewById(R.id.button3);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addreg();
            }
        });


    }
    public void addreg(){

                String name = a1.getText().toString();
                String aadhar_no =a2.getText().toString();
                String bamashah_no =a3.getText().toString();
                String mobile_no =a4.getText().toString();
                String password =a5.getText().toString();
              if(name.length()==0||aadhar_no.length()==0||bamashah_no.length()==0||mobile_no.length()==0||password.length()==0){
                  Toast.makeText(Register.this,"please fill all the fields",Toast.LENGTH_LONG).show();
              }
              else{
                  Toast.makeText(Register.this,"successfully submitted",Toast.LENGTH_LONG).show();
                  Intent i =new Intent(Register.this,MainActivity.class);
                  startActivity(i);
              }
    }
}
