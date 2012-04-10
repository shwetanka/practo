<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%--
  Created by IntelliJ IDEA.
  User: Shwetanka
  Date: Apr 6, 2012
  Time: 9:49:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head><title>Practo Task- Zendesk Api Sample</title></head>
  <body>
  <div>
      <html:form method="GET" action="/report.html">
          <html:select property="strType">
              <html:option value="All">All</html:option>
              <html:options collection="reportTypes" labelProperty="typeName" labelName="typeName" property="reportType"/>
          </html:select>
          <html:select property="statusId">
              <html:option value="All">All</html:option>
              <html:options collection="statusTypes" labelName="statusType" labelProperty="statusType" property="statusId"/>
          </html:select>
          <html:submit value="search"></html:submit>
      </html:form>
  </div>
  <c:if test="${not empty tickets}">
      <table id="results" width="100%" border="0">
      <tr>
          <th width="10%">Nice Id</th>
          <th width="25%">Subject</th>
          <th width="15%">Creation Date</th>
          <th width="20%">Assignee ID</th>
          <th width="20%">Status</th>
          <th width="10%">Priority</th>
      </tr>
      <c:forEach items="${tickets}" var="ticket">
          <tr>
              <td>${ticket.niceId}</td>
              <td>${ticket.subject}</td>
              <td>${ticket.creationTime}</td>
              <td>${ticket.assigneeId}</td>
              <td>${ticket.status}</td>
              <td>${ticket.priority}</td>
          </tr>
      </c:forEach>
      </table>
  </c:if>
  </body>
</html>