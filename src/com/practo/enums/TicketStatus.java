package com.practo.enums;

/**
 * Company: AcStack
 * User: Shwetanka
 * Date: Apr 7, 2012
 * Time: 11:57:15 AM
 */
public enum TicketStatus {
  NEW(0), OPEN(1), PENDING(2), SOLVED(3), CLOSED(4);

  private Integer statusId;
  TicketStatus(Integer statusId){
    this.statusId = statusId;
  }

  public Integer getStatusId() {
    return statusId;
  }

  public void setStatusId(Integer statusId) {
    this.statusId = statusId;
  }

  public String getStatusType(){
    return this.toString();
  }

  public static TicketStatus getStatusByValue(Integer val){
    if(val == null || val <0){
      return null;
    }else if(val == 0){
      return NEW;
    }else if(val == 1){
      return OPEN;
    }else if(val == 2){
      return PENDING;
    }else if(val == 3){
      return SOLVED;
    }else if(val == 4){
      return CLOSED;
    }else {
      return null;
    }
  }
}
