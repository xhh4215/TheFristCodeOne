package com.example.xiaoheihei;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextClock;
import android.widget.Toast;

import com.google.gson.Gson;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextClock textClock;//一个显示当前的时间的控件
    public String text="this is the frist code";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textClock = (TextClock) findViewById(R.id.textcolock);
        textClock.setTextColor(Color.BLACK);
        textClock.setTextSize(23);
        textClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gson gson = new Gson();
               String jsontext =  gson.toJson(text);
                Toast.makeText(MainActivity.this, jsontext+"现在的时间是"+textClock.getText(), Toast.LENGTH_SHORT).show();


            }
        });
    }
}
