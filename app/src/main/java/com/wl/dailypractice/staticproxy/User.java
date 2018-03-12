package com.wl.dailypractice.staticproxy;

import android.util.Log;

/**
 * @describe: DailyPractice
 * @author: 武梁
 * @date: 2018/3/12 11:30
 * @mailbox: 1034905058@qq.com
 */

public class User implements UserPort{
    String name;
    int age;
    String six;
    public User(String name,int age,String six){
        this.name=name;
        this.age=age;
        this.six=six;
    }

    @Override
    public String getName() {
        Log.e("----获取原始接口name--",name);
        return name;
    }

    @Override
    public int getAge() {
        Log.e("----获取原始接口age--",age+"");
        return age;
    }

    @Override
    public String getSix() {
        Log.e("----获取原始接口six--",six);
        return six;
    }
}
