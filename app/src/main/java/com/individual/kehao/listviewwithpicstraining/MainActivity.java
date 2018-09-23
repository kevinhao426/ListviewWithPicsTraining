package com.individual.kehao.listviewwithpicstraining;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListView();
    }

    private void setListView() {
        listView = findViewById(R.id.lv_pic_train);
        ListItemEntity listItem = new ListItemEntity();
        List<ListItemEntity> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            listItem.setUserName("Kevin");
            listItem.setSkoop("this is the skoop NO." + i);
            listItem.setTime(i + "m");
            list.add(listItem);
        }

        PicTxtlistAdapter adapter = new PicTxtlistAdapter(list, this);
        listView.setAdapter(adapter);
    }
}
