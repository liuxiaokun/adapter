/**
 * @author Fred Liu <liuxiaokun0410@qq.com>
 * @version 1.7
 * @since  2015-5-26
 */
package com.example.adapterdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class SimpleAdapterTest extends Activity {

    private String[] names = { "Fred", "Jay", "Wills" };
    private String[] descs = { "desc 1", "desc 2", "desc 3" };
    private int[] imageIds = { R.drawable.zero, R.drawable.one, R.drawable.two };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ListView listView = (ListView) findViewById(R.id.list_view);
        List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();

        for (int i = 0, len = names.length; i < len; i++) {

            Map<String, Object> map = new HashMap<String, Object>();
            map.put("name", names[i]);
            map.put("desc", descs[i]);
            map.put("header", imageIds[i]);

            listMap.add(map);
        }

        SimpleAdapter adapter = new SimpleAdapter(this, listMap,
                R.layout.simple_item,
                new String[] { "header", "name", "desc" }, new int[] {
                        R.id.header, R.id.name, R.id.desc });

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                    int position, long id) {

                Log.i("item_click", "postion:" + position + "|"
                        + names[position]);
            }
        });
    }
}
