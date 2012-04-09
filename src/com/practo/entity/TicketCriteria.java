package com.practo.entity;

import com.practo.enums.TicketPriority;
import com.practo.enums.TicketStatus;

/**
 * Company: AcStack
 * User: Shwetanka
 * Date: Apr 8, 2012
 * Time: 1:15:27 PM
 */
public class TicketCriteria {
  private TicketStatus status;
  private boolean forDay;
  private boolean forWeek;
  private TicketPriority priority;

  public TicketPriority getPriority() {
    return priority;
  }

  public void setPriority(TicketPriority priority) {
    this.priority = priority;
  }

  public TicketStatus getStatus() {
    return status;
  }

  public void setStatus(TicketStatus status) {
    this.status = status;
  }

  public boolean isForDay() {
    return forDay;
  }

  public void setForDay(boolean forDay) {
    this.forDay = forDay;
  }

  public boolean isForWeek() {
    return forWeek;
  }

  public void setForWeek(boolean forWeek) {
    this.forWeek = forWeek;
  }
}
