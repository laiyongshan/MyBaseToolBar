package com.yeohe.mycollapesingapplication.mvvm;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.yeohe.mycollapesingapplication.BR;

/**
 * Created by Administrator on 2017/11/29.
 * 有3种方式实现动态更新界面数据：
 * 实现 Observable 接口；
 *继承 BaseObservable；
 *使用 ObservableField；
 */

public class UserViewModel2 extends BaseObservable {

    private String firstName;
    private String lastName;
    public String iv;

    private static Context context;

    public UserViewModel2(String iv,String firstName,String lastName,Context context){
        this.firstName=firstName;
        this.lastName=lastName;
        this.iv=iv;

        this.context=context;
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }


    @Bindable
    public String getDisplayName(){
        return firstName+"."+lastName;
    }


    public void setIv(String iv) {
        this.iv = iv;
    }

    public String getIv() {
        return iv;
    }





    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }


    public void onClick(View view){
        Toast.makeText(context,"点击了onClick!",Toast.LENGTH_LONG).show();
    }

}
