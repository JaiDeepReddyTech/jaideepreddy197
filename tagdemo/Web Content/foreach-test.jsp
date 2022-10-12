<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String []friends={"Ravi","Rajesh","Akhil"};
pageContext.setAttribute("myFriends",friends);
%>

<html>
<body>
<c:forEach var="tempfrd" items="${myFriends }">
${tempfrd }<br>
</c:forEach>
</body>
</html>