<%@include file="header.jsp" %>

<h2>Add two numbers here</h2>
<form action="add.jsp" method="GET">
    <div class="form-group">
        <label>First Number</label>
        <input type="number" name="firstNum" required>
    </div>
    <div class="form-group">
        <label>Second Number</label>
        <input type="number" name="secondNum" required>
    </div>
    <input type="submit" value="Submit">
</form>

<h2>Cookies</h2>
<form action="progress.jsp" method="POST">
    <label>Name</label>
    <input type="text" name="name" required>
    <input type="submit" value="Submit">
</form>

<h2>Sessions</h2>
<form action="session1.jsp" method="POST">
    <div class="form-group">
        <label>Username</label>
        <input type="text" name="name" required>
    </div>
    <div class="form-group">
        <label>Password</label>
        <input type="password" name="password" required>
    </div>
    <input type="submit" name="submit" value="Submit" >
</form>

<h2>Page Counter</h2>
<% 
    int count;
    if (request.getParameter("counter") == null) count = 1;
    else count = Integer.parseInt(request.getParameter("counter"));
%>
<p>This is Hit Counter No.: <%= count %></p>
<a href="main.jsp?counter=<%= String.valueOf(count + 1) %>">Increase</a>
<br>
<a href="main.jsp">Reset</a>

<%@include file="footer.jsp" %>