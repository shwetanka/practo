package com.practo.enums;

/**
 * Company: AcStack
 * User: Shwetanka
 * Date: Apr 8, 2012
 * Time: 11:42:23 PM
 */
public enum ReportType {
  DAILY("Daily"), WEEKLY("Weekly");
  private String typeName;
  ReportType(String typeName) {
    this.typeName = typeName;
  }

  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public String getReportType(){
    return this.toString();
  }

  public static ReportType getReportTypeByValue(String value){
    if(value==null || value.trim().equals("")){
      return null;
    }else if(value.equalsIgnoreCase("daily")){
      return DAILY;
    }else if(value.equalsIgnoreCase("weekly")){
      return WEEKLY;
    }else {
      return null;
    }
  }

}
