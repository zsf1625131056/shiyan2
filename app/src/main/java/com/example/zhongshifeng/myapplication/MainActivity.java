package com.example.zhongshifeng.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button LinerLayour=(Button)  findViewById(R.id.LinerLayout);
        LinerLayour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent=new Intent(MainActivity.this,LinerLayoutActivity.class);
                    startActivity(intent);


            }
        });
        final Button RelativeLayout=(Button) findViewById(R.id.RelativeLayout);
        RelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,RelativeLayoutActivity.class);
                startActivity(intent);

            }
        });
        final Button TableLayout=(Button) findViewById(R.id.TableLayout);
        TableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,TabIeLayoutActivity.class);
                startActivity(intent);
            }
        });
        final Button GridLayout=(Button)  findViewById(R.id.GirdLayout);
        GridLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,GirdLayoutActivity.class);
                startActivity(intent);
            }
        });
        Button FrameLayout=(Button) findViewById(R.id.FrameLayout);
        FrameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,FrameLayoutActivity.class);
                startActivity(intent);
            }
        });
    }
}
