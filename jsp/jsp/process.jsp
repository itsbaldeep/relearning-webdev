<%@include file="header.jsp" %>
<p>Hello there!</p>
<p>Your name is: 
    <%
        Cookie[] cs = request.getCookies();
        for (Cookie c : cs)
            if (c.getName().equals("name")) out.print(c.getValue());
    %>
</p>
<p>Your age is: <%= request.getParameter("age") %></p>
<%@include file="footer.jsp" %>