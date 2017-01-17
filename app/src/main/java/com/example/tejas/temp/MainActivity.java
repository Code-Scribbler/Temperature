package com.example.tejas.temp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView myTextView;
    private Button myCButton;
    private Button myFCutton;
    private EditText myTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView = (EditText) findViewById(R.id.editText);
        myCButton = (Button) findViewById(R.id.buttonc);
        myFCutton = (Button) findViewById(R.id.button);
        myTemp = (TextView) findViewById(R.id.textView2);

        myCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String editTextVal= myTextView.getText().toString();

                if(editTextVal.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Enter A Value", Toast.LENGTH_LONG).show();

                }
                else{
                    int Intedittext = Integer.parseInt(editTextVal);

                    ConvertToCelcious(Intedittext);
                }
            }
        });

        myFCutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTextVal= myTextView.getText().toString();

                if(editTextVal.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Enter A Value", Toast.LENGTH_LONG).show();

                }
                else{
                    int Intedittext = Integer.parseInt(editTextVal);

                    ConvertToFar(Intedittext);
                }

            }
        })
    }

    public int ConvertToCelcious(int farVal){


        return 0;
    }

    public int ConvertToFar(int celVal){

        return 0;
    }
}

