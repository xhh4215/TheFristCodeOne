package com.example.xiaoheihei;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class ThridActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private Button progress;
    private MyLinearLayout linearlayout;
    Button last;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thrid);
        button = (Button) findViewById(R.id.buttonid);
        button.setOnClickListener(this);
        progress = (Button) findViewById(R.id.progressid);
        progress.setOnClickListener(this);
        linearlayout = (MyLinearLayout) findViewById(R.id.mylinearlayoutid);
        last = linearlayout.findViewById(R.id.last);
        last.setOnClickListener(this);
        next = linearlayout.findViewById(R.id.next);
        next.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonid:
                AlertDialog.Builder alertdialog = new AlertDialog.Builder(ThridActivity.this);
                alertdialog.setTitle("this is a dialog");
                alertdialog.setMessage("something is important");
                alertdialog.setCancelable(true);
                alertdialog.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(ThridActivity.this, "you onclick the cancel", Toast.LENGTH_SHORT).show();
                    }
                });
                alertdialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(ThridActivity.this, "you onclick the ok", Toast.LENGTH_SHORT).show();
                    }
                });
                alertdialog.show();
                break;
            case R.id.progressid:
                ProgressDialog progressDialog = new ProgressDialog(this);
                progressDialog.setTitle("进度对话框");
                progressDialog.setMessage("something is importent");
                progressDialog.setCancelable(true);
                progressDialog.show();
                break;
            case R.id.last:
                Toast.makeText(this, "this is last", Toast.LENGTH_SHORT).show();
                break;
            case R.id.next:
                Toast.makeText(this, "this is next", Toast.LENGTH_SHORT).show();
        }

    }
}
