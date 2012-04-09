package com.practo.entity;

import com.practo.enums.TicketPriority;
import com.practo.enums.TicketStatus;
import com.practo.enums.TicketType;

import java.util.Date;
import java.util.List;

/**
 * Company: AcStack
 * User: Shwetanka
 * Date: Apr 7, 2012
 * Time: 12:58:35 PM
 */
public class ZendeskTicket {
  private Integer niceId;
  private Integer assigneeId;
  private TicketType type;
  private TicketStatus status;
  private TicketPriority priority;
  private Integer submitterId;
  private String subject;
  private String description;
  private List<TicketComment> comments;
  private Date creationTime;

  public Date getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Date creationTime) {
    this.creationTime = creationTime;
  }

  public List<TicketComment> getComments() {
    return comments;
  }

  public void setComments(List<TicketComment> comments) {
    this.comments = comments;
  }

  public Integer getNiceId() {
    return niceId;
  }

  public void setNiceId(Integer niceId) {
    this.niceId = niceId;
  }

  public Integer getAssigneeId() {
    return assigneeId;
  }

  public void setAssigneeId(Integer assigneeId) {
    this.assigneeId = assigneeId;
  }

  public TicketType getType() {
    return type;
  }

  public void setType(TicketType type) {
    this.type = type;
  }

  public TicketStatus getStatus() {
    return status;
  }

  public void setStatus(TicketStatus status) {
    this.status = status;
  }

  public TicketPriority getPriority() {
    return priority;
  }

  public void setPriority(TicketPriority priority) {
    this.priority = priority;
  }

  public Integer getSubmitterId() {
    return submitterId;
  }

  public void setSubmitterId(Integer submitterId) {
    this.submitterId = submitterId;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
