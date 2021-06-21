package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    这里有个需要注意的地方，不能直接将name和pass记录为String类型，否则在非构造函数中并不能修改成员变量String的值。
    EditText name;  //用户名
    EditText pass;  //密码
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 创建界面
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 得到用户信息
        name = ((EditText) findViewById(R.id.name));
        pass = ((EditText) findViewById(R.id.password));
    }
//    核心的用户登录过程：判断输入的账号状态，进行正确的跳转。
    public void check(View v){
        String login = "登录成功！欢迎回来"+name.getText().toString().trim();
        String logon = "注册成功！你好用户"+name.getText().toString().trim();
        if(findUserName()){
            Toast toast = Toast.makeText(this, login, Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, -30, 0);
            toast.show();
        } else{
            Toast toast = Toast.makeText(this, logon, Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, -30, 0);
            toast.show();
        }
        Toast toast = Toast.makeText(this, "yes", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, -30, 0);
        toast.show();
        skip(v);
        Toast toast2 = Toast.makeText(this, "yes", Toast.LENGTH_SHORT);
        toast2.setGravity(Gravity.CENTER, -30, 0);
        toast2.show();
    }

//    登录后默认跳转到功能界面
    public void skip(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, Test.class);//FeatureList
        startActivity(intent);
    }

//    服务器端需要给出接口，此函数返回是否已经注册过该用户名。这里直接测试是否用户名为jinlun，password为wuhu
    public boolean findUserName(){
        String mname = "jinlun";
        String mpass = "wuhu";
        if(name.getText().toString().trim().equals(mname) && pass.getText().toString().trim().equals(mpass)){
            return true;
        }
        else return false;
    }

}
