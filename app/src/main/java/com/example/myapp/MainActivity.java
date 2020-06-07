package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.EditText;
import static android.graphics.Color.BLUE;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout mylayout = new RelativeLayout(this);
        Button mybutton =  new Button(this);



        mylayout.setBackgroundColor(BLUE);
        mybutton.setBackgroundColor(Color.GREEN);
        mybutton.setText("lets go");
        RelativeLayout.LayoutParams btndetails =  new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        btndetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        btndetails.addRule(RelativeLayout.CENTER_VERTICAL);
        mylayout.addView(mybutton,btndetails);

        EditText ed = new EditText(this);
        mybutton.setId(1);
        ed.setId(2);


        RelativeLayout.LayoutParams edetails =  new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        edetails.addRule(RelativeLayout.ABOVE,mybutton.getId());
        edetails.addRule(RelativeLayout.CENTER_HORIZONTAL);

        edetails.setMargins(0,0,0,50);
        mylayout.addView(ed,edetails);
        setContentView(mylayout);
    }
}
