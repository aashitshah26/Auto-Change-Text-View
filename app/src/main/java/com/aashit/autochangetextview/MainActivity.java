package com.aashit.autochangetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aashit.library.AutoChangeTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    AutoChangeTextView autoChangeTextView;
    ArrayList<String> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList.add("asdsad");
        arrayList.add("qweerr");
        arrayList.add("qwtt");
        arrayList.add("vsddfdsf");
        arrayList.add("utrtyty");
        autoChangeTextView = findViewById(R.id.auto);
       // autoChangeTextView.setInAnimation(AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left));
       // autoChangeTextView.setOutAnimation(AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right));
        autoChangeTextView.setTexts(arrayList);
        autoChangeTextView.setDuration(500,AutoChangeTextView.MILLISECONDS);
        autoChangeTextView.setAnimate(true);
    }

    public void restart(View view) {
        autoChangeTextView.restart();
    }

    public void pause(View view) {
        autoChangeTextView.pause();
    }
}
