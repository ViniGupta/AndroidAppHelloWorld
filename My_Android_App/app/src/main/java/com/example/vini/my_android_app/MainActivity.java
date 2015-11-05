package com.example.vini.my_android_app;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import static com.example.vini.my_android_app.R.drawable.add_button;

public class MainActivity extends ActionBarActivity {
    ListView list;
    List<TaskSummary> tasks= new ArrayList<TaskSummary>();

    void initializeTaskList()
    {
        tasks.add(new TaskSummary("Shopping_list", new Date(),new Date()));
        tasks.add(new TaskSummary("Doctor_visit", new Date(),new Date()));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeTaskList();
        CustomListAdapter adapter = new CustomListAdapter(this,tasks);
        ListView listView = (ListView) findViewById(R.id.todo_list);
        listView.setAdapter(adapter);
        ImageButton ib= (ImageButton) findViewById(R.id.addButton);
        ib.setImageResource(R.drawable.add_button);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Hello toast!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });
   }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
