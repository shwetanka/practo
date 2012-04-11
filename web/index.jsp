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
  <head>
      <title>Practo Task- Zendesk Api Sample</title>
      <link rel="stylesheet" type="text/css" href="/css/style.css"/>
  </head>
  <body>
  <div class="container">
  <h1>Sample Zendesk Reports</h1>
  <div class="search">
      <h3>Choose Filters</h3>
      <div class="formDiv">
      <html:form method="GET" action="/report.html">
          Report Type&nbsp;&nbsp;
          <html:select property="strType">
              <html:option value="All">All</html:option>
              <html:options collection="reportTypes" labelProperty="typeName" labelName="typeName" property="reportType"/>
          </html:select>
          &nbsp;&nbsp;Ticket Status&nbsp;&nbsp;
          <html:select property="statusId">
              <html:option value="-1">All</html:option>
              <html:options collection="statusTypes" labelName="statusType" labelProperty="statusType" property="statusId"/>
          </html:select>&nbsp;&nbsp;
          <html:submit value="search"></html:submit>
      </html:form>
      </div>
  </div>
  <div class="results">
      <c:choose>
  <c:when test="${not empty tickets}">
      <table id="results" width="100%" border="0">
      <tr>
          <th width="10%">Ticket Id</th>
          <th width="20%">Subject</th>
          <th width="35%">Description</th>
          <th width="15%">Creation Date</th>
          <th width="10%">Status</th>
          <th width="10%">Priority</th>
      </tr>
      <c:forEach items="${tickets}" var="ticket">
          <tr>
              <td>${ticket.niceId}</td>
              <td>${ticket.subject}</td>
              <td>${ticket.description}</td>
              <td>${ticket.creationTime}</td>
              <td>${ticket.status}</td>
              <td>${ticket.priority}</td>
          </tr>
      </c:forEach>
      </table>
  </c:when>
  <c:otherwise>
      No results found!
  </c:otherwise>
  </c:choose>
  </div>
  </div>
  </body>
</html>