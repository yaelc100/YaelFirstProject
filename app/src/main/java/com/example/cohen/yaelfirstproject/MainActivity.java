package com.example.cohen.yaelfirstproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    Button btn;
    Button btn1;
    TextView tex;

    @Override
    protected void onCreate (Bundle savesInstanceState){
        super.onCreate(savesInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.btn);
        btn1=(Button) findViewById(R.id.btn1);
        tex=(TextView) findViewById(R.id.tex);
    }

    int r;

    public void rdClick(View view) {
        Random rd = new Random();
        r= rd.nextInt();
        tex.setText("number="+r);

    }


    public void rbClick(View view) {
        tex.setText("number not found");
    }
}

