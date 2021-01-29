<%@include file="header.jsp" %>
<form action="process.jsp" method="POST">
    <%
        String name = request.getParameter("name");
        Cookie c = new Cookie("name", name);
        response.addCookie(c);
    %>
    <label>Age</label>
    <input type="number" name="age" required>
    <input type="submit" value="Submit">
</form>
<%@include file="footer.jsp" %>