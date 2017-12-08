package com.yeohe.mycollapesingapplication.mvvm;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

import java.util.Observable;

/**
 * Created by Administrator on 2017/11/29.
 */

public class UserViewModel3  {

    public final ObservableField<String> firstName=new ObservableField<String>();
    public final ObservableField<String> lastName=new ObservableField<String>();
    public final ObservableInt age=new ObservableInt();

}
