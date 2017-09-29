package com.example.xiaoheihei;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

/**
 * Created by xhh on 2017/9/29.
 */

public class MyLinearLayout extends LinearLayout {
    public MyLinearLayout(Context context) {
        super(context);

    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.activity_test,this);
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
