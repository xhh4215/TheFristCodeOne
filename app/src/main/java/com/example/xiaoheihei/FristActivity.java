package com.example.xiaoheihei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class FristActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frist);
        button = (Button) findViewById(R.id.buttonid);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //通过finish()方法结束当前的activity
                finish();
            }
        });
    }

}
