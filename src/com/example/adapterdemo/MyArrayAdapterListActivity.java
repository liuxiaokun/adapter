/**
 * @author Fred Liu <liuxiaokun0410@qq.com>
 * @version 1.7
 * @since  2015-5-26
 */
package com.example.adapterdemo;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MyArrayAdapterListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        List<String> list = new ArrayList<String>();
        list.add("AAAAAAAA");
        list.add("BBBBBBBB");
        list.add("CCCCCCCC");
        list.add("DDDDDDDD");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.list_activity_array_adapter_item, list);

        setListAdapter(adapter);
    }
}
