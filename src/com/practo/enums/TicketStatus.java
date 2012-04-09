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
}
