<%@include file="header.jsp" %>
<%
    String name = request.getParameter("name");
    String password = request.getParameter("password");
    session.setAttribute("username", name);
    response.sendRedirect("session2.jsp");
%>
<%@include file="footer.jsp" %>