package com.example.xiaoheihei;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import static android.R.attr.action;
import static android.R.attr.start;

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
//                finish();
                //显示意图的使用
//                Intent intent = new Intent(FristActivity.this,MainActivity.class);
//                startActivity(intent);
                //使用隐示
                /**
                 * 在程序的配置文件中可以使用action和category同时进行Activity的跳转的匹配
                 */
//                Intent intent = new Intent("com.example.xiaoheihei.ACTION_START");
//                startActivity(intent);
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                //可以通过在intent-falter中设置data的数值只有当前的data和标签中的匹配才会进行跳转
//                intent.setData(Uri.parse("http://www.baidu.com"));
//                startActivity(intent);
                /**
                 * 使用intent进行数据的传输
                 */
                String name = "xiaoheihei";
                Intent intent = new Intent(FristActivity.this, MainActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);

            }
        });
    }

}
