package com.practo.entity;

import com.practo.enums.ReportType;
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
  private ReportType type;
  private TicketPriority priority;

  public ReportType getType() {
    return type;
  }

  public void setType(ReportType type) {
    this.type = type;
  }

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

}
