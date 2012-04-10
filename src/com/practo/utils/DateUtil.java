package com.practo.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * Company: AcStack
 * User: Shwetanka
 * Date: Apr 10, 2012
 * Time: 8:26:35 PM
 */
public class DateUtil {
  public static boolean isToday(Date d){
    Date now = new Date();
    if(d.compareTo(getStartOfDay(now))>0 && d.compareTo(getEndOfDay(now)) < 0){
      return true;
    }
    return false;
  }

  public static boolean isInWeek(Date d){
    Date now = new Date();
    if(d.compareTo(getFirstDateOfWeek(now))>0 && d.compareTo(getEndDateOfWeek(now))<0){
      return true;
    }
    return false;
  }

  public static Date getFirstDateOfWeek(Date d) {
    Calendar now = Calendar.getInstance();
    now.setTime(d);
    int dayOfWeek = now.get(Calendar.DAY_OF_WEEK) -1;
    int offset = dayOfWeek % 7;
    int startDate = now.get(Calendar.DAY_OF_MONTH);
    if(offset > 0) {
      startDate = now.get(Calendar.DATE) - offset ;
    } else {
      startDate -=7;
    }
    now.set(Calendar.DAY_OF_MONTH, startDate + 1);
    now.set(Calendar.HOUR_OF_DAY,0);
    now.set(Calendar.MINUTE,0);
    now.set(Calendar.SECOND,0);
    now.set(Calendar.MILLISECOND, 0);
    return now.getTime();
  }

  public static Date getEndDateOfWeek(Date d){
    Calendar now = Calendar.getInstance();
    now.setTime(d);
    int dayOfWeek = now.get(Calendar.DAY_OF_WEEK)-1;
    int offset = 7-(dayOfWeek%7);
    int startDate = now.get(Calendar.DAY_OF_MONTH);
    if(offset > 0) {
      startDate = now.get(Calendar.DATE) + offset ;
    } else {
      startDate +=7;
    }
    now.set(Calendar.DAY_OF_MONTH, startDate);
    now.set(Calendar.HOUR_OF_DAY,23);
    now.set(Calendar.MINUTE,59);
    now.set(Calendar.SECOND,59);
    now.set(Calendar.MILLISECOND, 999);
    return now.getTime();
  }

  public static Date getStartOfDay(Date d){
    Calendar cal = Calendar.getInstance();
    cal.setTime(d);
    cal.set(Calendar.HOUR_OF_DAY, 0);
    cal.set(Calendar.MINUTE, 0);
    cal.set(Calendar.SECOND, 0);
    cal.set(Calendar.MILLISECOND, 0);
    return cal.getTime();
  }

  public static Date getEndOfDay(Date d){
    Calendar cal = Calendar.getInstance();
    cal.setTime(d);
    cal.set(Calendar.HOUR_OF_DAY, 23);
    cal.set(Calendar.MINUTE, 59);
    cal.set(Calendar.SECOND, 59);
    cal.set(Calendar.MILLISECOND, 999);
    return cal.getTime();
  }
}
