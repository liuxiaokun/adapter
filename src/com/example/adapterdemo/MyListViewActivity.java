package com.example.adapterdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyListViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.list_view_array);

        ListView listView = (ListView) findViewById(R.id.list_view_array);
        String[] arr = { "AAAAA", "BBBBB", "CCCCC", "DDDDD" };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.list_activity_array_adapter_item, arr);
        
        listView.setAdapter(adapter);
    }
}
