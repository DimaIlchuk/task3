package com.example.ilchu.three;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
     TextView tv, tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        tv = (TextView) findViewById(R.id.textView2);
        tv1 = (TextView) findViewById(R.id.textView3);
        tv2 = (TextView) findViewById(R.id.textView4);

        tv.setText("HEllo" +getIntent().getStringExtra("NAME"));
        tv1.setText("HI");
        tv2.setText(getIntent().getStringExtra("DESCRIPTION"));
    }
}
