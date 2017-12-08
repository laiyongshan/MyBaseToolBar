package com.yeohe.mycollapesingapplication.mvvm;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.yeohe.mycollapesingapplication.R;
import com.yeohe.mycollapesingapplication.databinding.ActivityDatabindingBinding;


/**
 * Created by Administrator on 2017/11/29.
 */

public class DataBindingActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDatabindingBinding dataBinding= DataBindingUtil.setContentView(this, R.layout.activity_databinding);

        // viewmodel
        UserViewModel viewModel = new UserViewModel(this,"http://upload-images.jianshu.io/upload_images/2972448-78cb561ab24f41c4.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240","Lai","YongShan");
        MyHandler myHandler=new MyHandler(this);
        dataBinding.setUserViewModel(viewModel);
        dataBinding.setMyHandler(myHandler);
    }
}
