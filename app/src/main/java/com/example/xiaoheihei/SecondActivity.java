package com.example.xiaoheihei;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = new Intent(SecondActivity.this,FristActivity.class);
        /***
         * param1 进行跳转的时候使用的intent对象
         * param2 跳转的时候使用的请求码
         */
        startActivityForResult(intent,1);
    }

    /***
     *
     * @param requestCode  请求码
     * @param resultCode   结果码
     * @param data    上一个activity返回的数据
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
         if(requestCode==1){
             if (resultCode==9){
                 String message = data.getStringExtra("name");
                 Toast.makeText(this, ""+message, Toast.LENGTH_SHORT).show();
             }
         }
    }
}
