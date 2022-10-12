<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<style>
.error {
	color: red;
}

.div {
	width: 500px;
	height: 600px;
	background-color: yellow;
}

.body {
	background-color: red;
}
</style>
</head>
<body>
	<div align="center">
		<h2>Customer Form</h2>

		<hr>
		<form:form action="processForm" modelAttribute="theCustomer">

First Name :		<form:input path="firstName" placeholder="firstName" />
			<br>
			<br>
Last Name* :		<form:input path="lastName" placeholder="lastName" />
			<form:errors path="lastName" cssClass="error" />
			<br>
			<br> 	
		Free Pass :<form:input path="freePass" />
			<form:errors path="freePass" cssClass="error" />
			<br>
			<br> 
			Postal Code :<form:input path="postalCode" />
			<form:errors path="postalCode" cssClass="error" />
			<br>
			<br> 
				Course Code :<form:input path="courseCode" placeholder="JAI"/>
			<form:errors path="courseCode" cssClass="error" />
			<br>
			<br>
			<input type="submit" value="Submit" />
		</form:form>
	</div>
</body>

</html>