package com.practo.entity;

import java.util.Date;

/**
 * Company: AcStack
 * User: Shwetanka
 * Date: Apr 8, 2012
 * Time: 12:59:25 AM
 */
public class TicketComment {
  private Integer authorId;
  private String type;
  private boolean publicComment;
  private String value;
  private Date commentTime;

  public Date getCommentTime() {
    return commentTime;
  }

  public void setCommentTime(Date commentTime) {
    this.commentTime = commentTime;
  }

  public Integer getAuthorId() {
    return authorId;
  }

  public void setAuthorId(Integer authorId) {
    this.authorId = authorId;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public boolean isPublicComment() {
    return publicComment;
  }

  public void setPublicComment(boolean publicComment) {
    this.publicComment = publicComment;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
