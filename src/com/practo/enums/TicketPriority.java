package com.practo.enums;

/**
 * Company: AcStack
 * User: Shwetanka
 * Date: Apr 7, 2012
 * Time: 12:01:24 PM
 */
public enum TicketPriority {
  NO_PRIORITY_SET(0), LOW(1), NORMAL(2), HIGH(3), URGENT(4);

  private Integer priority;

  TicketPriority(Integer priority) {
    this.priority = priority;
  }

  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public static TicketPriority getPriorityByValue(Integer val){
    if(val==null || val < 0){
      return null;
    }
    if(val == 0){
      return NO_PRIORITY_SET;
    }else if(val == 1){
      return LOW;
    }else if(val == 2){
      return NORMAL;
    } else if(val == 3){
      return HIGH;
    }else if(val == 4){
      return URGENT;
    }else {
      return null;
    }
  }
}
