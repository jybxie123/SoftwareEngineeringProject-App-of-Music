package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FeatureList extends AppCompatActivity {
//    private String[] features = {"个人歌单", "音节测试", "乐谱视唱", "乐谱编写"};
    private List<Feature> feaList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature_list);
//        initFeature();
//        构造Viewlist的适配器
//        FeatureAdapter adapter = new FeatureAdapter(FeatureList.this,R.layout.activity_feature_list,feaList);
//        找到viewlist实例并且设置其适配器
//        ListView listView = (ListView) findViewById(R.id.feature_list);
//        listView.setAdapter(adapter);
    }

    private void initFeature() {
        for(int i =0;i<2;i++){
            Feature fea1 = new Feature("个人歌单", R.drawable.test1);
            feaList.add(fea1);
            Feature fea2 = new Feature("音节测试", R.drawable.test2);
            feaList.add(fea2);
            Feature fea3 = new Feature("乐谱视唱", R.drawable.test3);
            feaList.add(fea3);
            Feature fea4 = new Feature("乐谱编写", R.drawable.test4);
            feaList.add(fea4);

        }
    }

}