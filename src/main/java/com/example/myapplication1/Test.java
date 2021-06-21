package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Test extends AppCompatActivity {
    private String[] features = {"个人歌单", "音节测试", "乐谱视唱", "乐谱编写","乐谱库"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Test.this,R.layout.activity_test,features);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}