/**
 * @author Fred Liu <liuxiaokun0410@qq.com>
 * @version 1.7
 * @since  2015-5-26
 */
package com.example.adapterdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyListViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.list_view);

        ListView listView = (ListView) findViewById(R.id.list_view);
        String[] arr = { "AAAAA", "BBBBB", "CCCCC", "DDDDD" };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.list_view_item, arr);

        listView.setAdapter(adapter);
    }
}
