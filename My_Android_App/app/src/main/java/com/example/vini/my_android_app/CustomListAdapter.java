package com.example.vini.my_android_app;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by vini on 5/9/2015.
 */
public class CustomListAdapter extends ArrayAdapter<TaskSummary> {
    private final Activity context;
    private final List<TaskSummary> taskName;

    public CustomListAdapter(Activity context, List<TaskSummary> itemname) {
        super(context,R.layout.mylist, itemname);
        this.context = context;
        for (TaskSummary taskSummary : taskName = itemname) {

        }
        ;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mylist, null, true);
        TextView eventDesc = (TextView) rowView.findViewById(R.id.event_desc);
        TextView startDate = (TextView)rowView.findViewById(R.id.start_date);
        TextView endDate = (TextView) rowView.findViewById(R.id.end_date);
        eventDesc.setText(taskName.get(position).eventDesc);
        startDate.setText(taskName.get(position).startDate.toString());
        endDate.setText(taskName.get(position).endDate.toString());
        CheckBox status = (CheckBox) rowView.findViewById(R.id.isCompleted);
        status.setChecked(taskName.get(position).isCompleted);
        return rowView;
    };
}
