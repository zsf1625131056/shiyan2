package com.example.zhongshifeng.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class LinerLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liner_layout);
    final LinearLayout linearLayout=findViewById(R.id.Linear);
        Button level=(Button)findViewById(R.id.level);
        level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.setGravity(Gravity.CENTER_HORIZONTAL);
                linearLayout.setOrientation(LinearLayout.HORIZONTAL);
            }
        });
        final Button vertical=(Button)findViewById(R.id.vertical);
        vertical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.setGravity(Gravity.CENTER);
                linearLayout.setOrientation(LinearLayout.VERTICAL);

            }
        });
        Button left=(Button)findViewById(R.id.left);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.setGravity(Gravity.LEFT);
                linearLayout.setOrientation(LinearLayout.VERTICAL);

            }
        });
        Button back=(Button)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LinerLayoutActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
