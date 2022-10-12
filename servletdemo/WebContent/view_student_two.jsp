<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<h2 style="color: red">Student Details</h2>
	<table border="1">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Location</th>

		</tr>
		<c:forEach var="tempStudent" items="${list_student}">
			<tr>
				<td>${tempStudent.firstName}</td>
				<td>${tempStudent.lastName}</td>
				<td>${tempStudent.email}</td>
				<td>${tempStudent.location}</td>

			</tr>



		</c:forEach>


	</table>



</body>



</html>