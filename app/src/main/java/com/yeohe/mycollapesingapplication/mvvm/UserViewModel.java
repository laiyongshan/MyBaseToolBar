package com.yeohe.mycollapesingapplication.mvvm;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Administrator on 2017/11/29.
 *
 * 仅做静态展示
 */

public class UserViewModel {

    public String firstName;
    public String lastName;

    public String iv;

    private static Context context;

    public UserViewModel(Context context, String iv, String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.iv=iv;
        this.context=context;
    }



    @BindingAdapter({"iv"})
    public static void getImg(ImageView img, String iv){
        Glide.with(img.getContext())
                .load(iv)
                .centerCrop()
                .into(img);
    }




}
