package com.yeohe.mycollapesingapplication.snackbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.yeohe.mycollapesingapplication.R;

/**
 * Created by Administrator on 2017/11/25.
 */

public class SnackbarTestActicvity extends AppCompatActivity {

    Button btn1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_snackbar);

        btn1= (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SnackbarUtil.LongSnackbar(view,"这是一条snackbar测试！",1).setAction("这是Action", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        SnackbarUtil.SnackbarAction(view,SnackbarTestActicvity.this);
                    }
                }).show();
            }
        });

    }
}
