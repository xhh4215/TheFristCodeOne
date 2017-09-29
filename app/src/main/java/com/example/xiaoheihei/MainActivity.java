package com.example.xiaoheihei;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
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
        final String name = getIntent().getStringExtra("name");
        WindowManager wm = this.getWindowManager();
        final int width = wm.getDefaultDisplay().getWidth();
        final int height = wm.getDefaultDisplay().getHeight();
        textClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Gson gson = new Gson();
//               String jsontext =  gson.toJson(text);
//                Toast.makeText(MainActivity.this, jsontext+"现在的时间是"+width+height, Toast.LENGTH_SHORT).show();
//                Log.d("MainActivity","你点击了显示时间的按钮®");
                Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();

            }
        });
    }

}
