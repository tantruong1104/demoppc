package com.ppctimeshare.hbbs.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imgUser;
    ImageView imgSetting;
    LinearLayout loResort;
    FrameLayout loPromotion;
    FrameLayout loDiscover;
    FrameLayout loSuggest;
    FrameLayout loIntroduct;
    LinearLayout loRecruitment;
    FrameLayout loSendRequest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgUser = (ImageView) findViewById(R.id.imgUser);
        imgSetting = (ImageView) findViewById(R.id.imgSetting);
        loResort = (LinearLayout) findViewById(R.id.loResort);
        loPromotion = (FrameLayout) findViewById(R.id.loPromotion);
        loDiscover = (FrameLayout) findViewById(R.id.loDiscover);
        loSuggest = (FrameLayout) findViewById(R.id.loSuggest);
        loIntroduct = (FrameLayout) findViewById(R.id.loIntroduce);
        loRecruitment = (LinearLayout) findViewById(R.id.loRecruitment);
        loSendRequest = (FrameLayout) findViewById(R.id.loSendRequest);

        imgUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "User", Toast.LENGTH_SHORT).show();
            }
        });
        imgSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Setting", Toast.LENGTH_SHORT).show();
            }
        });
        loResort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "List Resort", Toast.LENGTH_SHORT).show();
            }
        });
        loPromotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Promotion", Toast.LENGTH_SHORT).show();
            }
        });
        loDiscover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Discover", Toast.LENGTH_SHORT).show();
            }
        });
        loSuggest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Suggest", Toast.LENGTH_SHORT).show();
            }
        });
        loIntroduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Introduct", Toast.LENGTH_SHORT).show();
            }
        });
        loRecruitment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Recruitment", Toast.LENGTH_SHORT).show();
            }
        });
        loSendRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Send Reqquest", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
