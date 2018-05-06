package com.example.zhongshifeng.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class FrameLayoutActivity extends AppCompatActivity {
    int[] imageIds = new int[]{
            R.drawable.abc,
            R.drawable.abcd,
            R.drawable.abcde,
            R.drawable.abcdef,
            R.drawable.abcdefg
    };
    int currentImageId = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
        final ImageView show = (ImageView) findViewById(R.id.picture);
        final Handler myHandler = new Handler(){
            @Override
            public void handleMessage(Message msg){
                if (msg.what==0x1233){
                    show.setImageResource(imageIds[currentImageId++% imageIds.length]);
                }
            }
        };
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                myHandler.sendEmptyMessage(0x1233);
            }
        },0,500);
        Button back=(Button)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FrameLayoutActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
