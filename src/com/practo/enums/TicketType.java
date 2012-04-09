package com.practo.enums;

/**
 * Company: AcStack
 * User: Shwetanka
 * Date: Apr 7, 2012
 * Time: 11:59:36 AM
 */
public enum TicketType {
  NO_TYPE_SET(0), QUESTION(1), INCIDENT(2), PROBLEM(3), TASK(4);

  private Integer typeId;

  TicketType(Integer typeId) {
    this.typeId = typeId;
  }

  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }
}
