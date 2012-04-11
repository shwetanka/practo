<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
        <h3>Choose Report Type</h3>
        Report Type :&nbsp;
        <form action="/report.html" method="get">
            <input type="hidden" value="report" name="action">
            <select name="type" size="1">
                <option value="daily" <c:if test="${repType eq 'daily'}">selected</c:if>>Daily</option>
                <option value="weekly" <c:if test="${repType eq 'weekly'}">selected</c:if>>Weekly</option>
            </select>
            <input type="submit" value="search">
        </form>
    </div>
    <div class="results">
        <c:choose>
            <c:when test="${not empty ticketMap}">
                <table border="0" width="100%">
                    <tr>
                      <th width="10%">Ticket Id</th>
                      <th width="20%">Subject</th>
                      <th width="35%">Description</th>
                      <th width="15%">Creation Date</th>
                      <th width="10%">Status</th>
                      <th width="10%">Priority</th>
                    </tr>
                    <tr><td colspan="6" style="color:#f22f2f">Open<c:if test="${not empty ticketMap['OPEN']}"> (${fn:length(ticketMap['OPEN'])})</c:if></td></tr>
                    <c:choose>
                        <c:when test="${not empty ticketMap['OPEN']}">
                            <c:forEach items="${ticketMap['OPEN']}" var="ticket">
                                <tr>
                                  <td>${ticket.niceId}</td>
                                  <td>${ticket.subject}</td>
                                  <td>${ticket.description}</td>
                                  <td>${ticket.creationTime}</td>
                                  <td>${ticket.status}</td>
                                  <td>${ticket.priority}</td>
                                </tr>
                            </c:forEach>
                        </c:when>
                        <c:otherwise>
                            <tr><td colspan="6" style="color:#f2afff">No results found</td></tr>
                        </c:otherwise>
                    </c:choose>
                    <tr><td colspan="6" style="color:#f22f2f">Pending<c:if test="${not empty ticketMap['PENDING']}"> (${fn:length(ticketMap['PENDING'])})</c:if></td></tr>
                    <c:choose>
                        <c:when test="${not empty ticketMap['PENDING']}">
                            <c:forEach items="${ticketMap['PENDING']}" var="ticket">
                                <tr>
                                  <td>${ticket.niceId}</td>
                                  <td>${ticket.subject}</td>
                                  <td>${ticket.description}</td>
                                  <td>${ticket.creationTime}</td>
                                  <td>${ticket.status}</td>
                                  <td>${ticket.priority}</td>
                                </tr>
                            </c:forEach>
                        </c:when>
                        <c:otherwise>
                            <tr><td colspan="6" style="color:#f2afff">No results found</td></tr>
                        </c:otherwise>
                    </c:choose>
                    <tr><td colspan="6" style="color:#f22f2f">Solved<c:if test="${not empty ticketMap['SOLVED']}"> (${fn:length(ticketMap['SOLVED'])})</c:if></td></tr>
                    <c:choose>
                        <c:when test="${not empty ticketMap['SOLVED']}">
                            <c:forEach items="${ticketMap['SOLVED']}" var="ticket">
                                <tr>
                                  <td>${ticket.niceId}</td>
                                  <td>${ticket.subject}</td>
                                  <td>${ticket.description}</td>
                                  <td>${ticket.creationTime}</td>
                                  <td>${ticket.status}</td>
                                  <td>${ticket.priority}</td>
                                </tr>
                            </c:forEach>
                        </c:when>
                        <c:otherwise>
                            <tr><td colspan="6" style="color:#f2afff">No results found</td></tr>
                        </c:otherwise>
                    </c:choose>
                </table>
            </c:when>
            <c:otherwise>
                No results found
            </c:otherwise>
        </c:choose>
    </div>
</div>

</div>
</body>
</html>