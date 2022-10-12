<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*,com.jsp.tagdemo.Employee"%>
<% 
List<Employee> data = new ArrayList<>();
data.add(new Employee("Jaideep", "Reddy", true));
data.add(new Employee("Sai", "Kumar", false));
data.add(new Employee("Anna", "Sofia", false));
data.add(new Employee("Layan", "Nakho", true));
pageContext.setAttribute("myEmployee", data);
%>
<html>
<body >
	<table border="2">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>VIP Pass</th>
		</tr>
		<c:forEach var="tempEmployee" items="${myEmployee}">
			<tr>
				<td>${tempEmployee.firstName}</td>
				<td>${tempEmployee.lastName}</td>
				<td><c:if test="${tempEmployee.memberVip}">
				Allowed
				</c:if>
				
				<c:if test="${not tempEmployee.memberVip}">Rejected</c:if>
				</td>
			</tr>
			
		</c:forEach>
	</table>


</body>

</html>