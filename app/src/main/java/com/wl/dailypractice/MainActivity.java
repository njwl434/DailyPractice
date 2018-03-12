package com.wl.dailypractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.wl.dailypractice.dynamicproxy.DynamicProxyActivity;
import com.wl.dailypractice.staticproxy.StaticProxyActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.btn1)
    Button btn1;
    @Bind(R.id.btn2)
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn1, R.id.btn2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                startActivity(new Intent(MainActivity.this, StaticProxyActivity.class));
                break;
            case R.id.btn2:
                startActivity(new Intent(MainActivity.this, DynamicProxyActivity.class));
                break;
                default:
        }
    }
}
