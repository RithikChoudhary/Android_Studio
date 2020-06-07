package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.EditText;
import static android.graphics.Color.BLUE;

public class MainActivity extends AppCompatActivity {

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
        setContentView(mylayout);
    }
}
