package com.yeohe.mycollapesingapplication.mvvm;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/11/29.
 */

public class MyHandler {

    Context context;

    public MyHandler(Context context){
        this.context=context;
    }

    public void click(View view){
        Toast.makeText(context,"点击了click",Toast.LENGTH_LONG).show();
    }

}
