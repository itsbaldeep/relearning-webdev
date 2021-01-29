<%@include file="header.jsp" %>
<%
    int i = Integer.parseInt(request.getParameter("firstNum"));
    int j = Integer.parseInt(request.getParameter("secondNum"));
    int k = i + j;
%>
<p>Answer is: <%= k %></p>
<%@include file="footer.jsp" %>