package com.practo;

import com.practo.enums.ReportType;
import com.practo.enums.TicketPriority;
import com.practo.enums.TicketStatus;
import org.apache.struts.action.ActionForm;

/**
 * Company: AcStack
 * User: Shwetanka
 * Date: Apr 8, 2012
 * Time: 1:18:51 PM
 */
public class TicketForm extends ActionForm{
  private TicketStatus status;
  private ReportType reportType;
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

  public ReportType getReportType() {
    return reportType;
  }

  public void setReportType(ReportType reportType) {
    this.reportType = reportType;
  }
}
