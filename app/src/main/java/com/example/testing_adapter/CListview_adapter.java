package com.example.testing_adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CListview_adapter extends BaseAdapter {
    private String[] item;
    private Activity activity;


    public CListview_adapter(String[] item, Activity activity) {
        this.item = item;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return item.length;
    }

    @Override
    public Object getItem(int position) {
        return item[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //ánh xạ layout con
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        convertView = layoutInflater.inflate(R.layout.listview_test1, null);


        TextView textView = (TextView) convertView.findViewById(R.id.tvTest1);
        textView.setText(item[position]);
        return convertView;
    }
}
