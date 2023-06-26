package com.example.testing_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class testing_base_adapter extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing_base_adapter);

        String[] item = {"dau dau", "too no le", "qy"};

        listView = (ListView) findViewById(R.id.lv_test1);

        CListview_adapter adapter = new CListview_adapter(item, this);
        listView.setAdapter(adapter);

    }
}