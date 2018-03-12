package com.wl.dailypractice.staticproxy;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.wl.dailypractice.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * @describe: 静态代理
 * @author: 武梁
 * @date: 2018/3/12 11:49
 * @mailbox: 1034905058@qq.com
 */

public class StaticProxyActivity extends Activity {

    @Bind(R.id.mTvMessage)
    TextView mTvMessage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staticproxy);
        ButterKnife.bind(this);
        User user=new User("测试",10,"男");
        UserProxy proxy=new UserProxy(user);
        mTvMessage.setText(proxy.getAge()+"/r"+ proxy.getName()+"/r"+proxy.getSix());
    }
}
