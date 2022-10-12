<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<style>

div{
width=500px;
margin=0 auto;
}

</style>
<body>
	<div>
		<h2 style="color: red">Employee Details</h2>
		<table border="5">
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Department</th>
				<th>Salary</th>

			</tr>
			<c:forEach var="tempEmployee" items="${employee_list}">
				<tr>
					<td>${tempEmployee.firstName}</td>
					<td>${tempEmployee.lastName}</td>
					<td>${tempEmployee.dept}</td>
					<td>${tempEmployee.salary}</td>

				</tr>

			</c:forEach>
		</table>

	</div>

</body>



</html>