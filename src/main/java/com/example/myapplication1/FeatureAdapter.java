package com.example.myapplication1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class FeatureAdapter extends ArrayAdapter<Feature> {
    private int resourceId;
    public FeatureAdapter(@NonNull Context context, int resource, @NonNull List<Feature> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Feature feature = getItem(position);//获取当前项的Feature实例
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
//        ImageView feaImg = view.findViewById(R.id.img);
//        TextView feaTxt = view.findViewById(R.id.txt);
//        feaImg.setImageResource(feature.getImg());
//        feaTxt.setText(feature.getTxt());

        return view;
    }
}


