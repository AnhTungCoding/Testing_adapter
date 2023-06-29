package com.example.testing_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class testing_base_adapter extends AppCompatActivity {
    private ListView listView;
    Button btnHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing_base_adapter);
        btnHome = (Button) findViewById(R.id.btnHome);

        //-----------------------------------------------
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(testing_base_adapter.this, MainActivity.class);
                startActivity(intent);
            }
        });



        //-----------------------------------------------
        String[] item = {"dau dau", "too no le", "qy"};

        listView = (ListView) findViewById(R.id.lv_test1);

        CListview_adapter adapter = new CListview_adapter(item, this);
        listView.setAdapter(adapter);

    }
}