package com.example.demo.DelayQueue;

import java.util.Calendar;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @author:wangyang
 * @creatDate:2020-03-31
 **/
public class DelayedTask implements Delayed {
    private int _expireInSecond = 0;

    public DelayedTask(int delaySecond) {
        Calendar cal = Calendar.getInstance ();
        cal.add (Calendar.SECOND, delaySecond);
        _expireInSecond = (int) (cal.getTimeInMillis () / 1000);
    }

    @Override
    public int compareTo(Delayed o) {
        long d = (getDelay (TimeUnit.NANOSECONDS) - o.getDelay (TimeUnit.NANOSECONDS));
        return (d == 0) ? 0 : ((d < 0) ? -1 : 1);
    }

    @Override
    public long getDelay(TimeUnit unit) {
        // TODO Auto-generated method stub
        Calendar cal = Calendar.getInstance ();
        return _expireInSecond - (cal.getTimeInMillis () / 1000);
    }


}
