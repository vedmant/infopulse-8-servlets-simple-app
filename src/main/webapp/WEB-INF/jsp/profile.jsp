<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="header.jsp" %>
<div class="container">
    <h2>Profile</h2>

    <table>
        <tr>
            <th>Namw</th>
            <th>Login</th>
        </tr>
        <c:forEach items="${sessionScope.users}" var="user">
            <tr>
                <td>$(user.name)</td>
                <td>$(user.login)</td>
            </tr>
        </c:forEach>
    </table>
</div>
<%@include file="footer.jsp" %>