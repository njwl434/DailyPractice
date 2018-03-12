package com.wl.dailypractice.dynamicproxy;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.wl.dailypractice.R;
import com.wl.dailypractice.staticproxy.User;
import com.wl.dailypractice.staticproxy.UserProxy;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * @describe: DailyPractice
 * @author: 武梁
 * @date: 2018/3/12 14:05
 * @mailbox: 1034905058@qq.com
 */

public class DynamicProxyActivity extends Activity {

    @Bind(R.id.mTvMessage)
    TextView mTvMessage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staticproxy);
        ButterKnife.bind(this);
        User user=new User("测试",20,"女");
        UserJdkProxy jdk=new UserJdkProxy();
        UserProxy proxy= (UserProxy) jdk.bind(user);
        mTvMessage.setText(proxy.getName()+"/r"+proxy.getAge()+"/r"+proxy.getSix());
    }
}
