<%@include file="header.jsp" %>
<form action="add.jsp" method="POST">
    <div class="form-group">
        <label>First Number</label>
        <input type="number" name="firstNum" required />
    </div>
    <div class="form-group">
        <label>Second Number</label>
        <input type="number" name="secondNum" required />
    </div>
    <input type="submit" value="Submit" />
</form>
<%@include file="footer.jsp" %>