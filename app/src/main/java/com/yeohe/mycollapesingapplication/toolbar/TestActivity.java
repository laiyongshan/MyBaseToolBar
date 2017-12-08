package com.yeohe.mycollapesingapplication.toolbar;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.yeohe.mycollapesingapplication.R;

/**
 * Created by Administrator on 2017/11/27.
 */

public class TestActivity extends BaseActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentLayout(R.layout.activity_test);
        setToolBarMenuOnclick(new mainToolBarMenuClick());
        setTitle("");
        context = this;
        setBackArrow();
    }

    class mainToolBarMenuClick implements Toolbar.OnMenuItemClickListener {

        @Override
        public boolean onMenuItemClick(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.action_refresh:
                    Toast.makeText(context, "refresh", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.action_message:
                    Toast.makeText(context, "message", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.action_message1:
                    Toast.makeText(context, "消息", Toast.LENGTH_SHORT).show();
                    break;
            }
            return false;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
