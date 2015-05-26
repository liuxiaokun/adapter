/**
 * @author Fred Liu <liuxiaokun0410@qq.com>
 * @version 1.7
 * @since  2015-5-26
 */
package com.example.adapterdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button listActivityButton = (Button) findViewById(R.id.array_adapter_extends_listActivity);
        listActivityButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
        case R.id.array_adapter_listview:

            break;

        case R.id.array_adapter_extends_listActivity:
            Log.i("click", "array_adapter_extends_listActivity");
            Intent intent = new Intent(getApplicationContext(),
                    MyArrayAdapterListActivity.class);
            startActivity(intent);
            break;

        default:
            break;
        }

    }

}
