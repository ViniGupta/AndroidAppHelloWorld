package com.example.vini.my_android_app;

import java.util.Date;

/**
 * Created by vini on 5/9/2015.
 */
public class TaskSummary {
    String eventDesc;
    Date startDate;
    Date endDate;
    Boolean isCompleted;
    TaskSummary(String desc,Date start,Date end)
    {
        eventDesc=desc;
        startDate=start;
        endDate=end;
        isCompleted=false;
    }
    void setEventDesc(String desc)
    {
        eventDesc=desc;
    }

}
