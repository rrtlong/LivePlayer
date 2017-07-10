package com.rrt.lijilong.liveplayer.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputLayout;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.rrt.lijilong.liveplayer.R;

/**
 * Created by lijilong on 2017/7/10.
 */

public class Act_Loign extends Activity implements View.OnClickListener{

    TextInputLayout tilUserName,tilPassword;
    EditText etUserName,etPassword;
    FloatingActionButton btLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_login);
        tilUserName = (TextInputLayout)findViewById(R.id.username);
        tilPassword = (TextInputLayout) findViewById(R.id.password);
        btLogin = (FloatingActionButton) findViewById(R.id.login);
        etUserName = tilUserName.getEditText();
        etPassword = tilPassword.getEditText();


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login:
                String userName = etUserName.getText().toString();
                String password = etPassword.getText().toString();
                if(TextUtils.isEmpty(userName)) {
                    tilUserName.setError("请输入用户名");
                }else if("李吉龙".equals(userName)){
                    tilUserName.setError("用户名错误");
                }
                if(TextUtils.isEmpty(password)) {
                    tilPassword.setError("请输入密码");
                }else if("1233456".equals(userName)){
                    tilPassword.setError("密码错误");
                }
                break;
        }
    }
}
