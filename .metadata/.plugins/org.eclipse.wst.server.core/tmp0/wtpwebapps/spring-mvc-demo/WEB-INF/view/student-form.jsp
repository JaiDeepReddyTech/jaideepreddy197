<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">


</style>
</head>
<body>
<div>
<form:form action="processForm" modelAttribute="student">
First Name : <form:input path="firstName"/>
<br><br>
Last Name : <form:input path="lastName"/>
<br><br>
country :
<form:select path="country">
<form:options items="${theCountryOptions}"/>
</form:select>
<br><br>
Favorite Language :
<br>
<form:radiobutton path="favoriteLanguage" value="Java"/>Java
<form:radiobutton path="favoriteLanguage" value="#C"/>#C
<form:radiobutton path="favoriteLanguage" value="Ruby"/>Ruby
<form:radiobutton path="favoriteLanguage" value="Solidity"/>Solidity
<br><br>
Operating Systems : 
<br><br>
<form:checkbox path="operationSystem" value="Windows"/>Windows
<form:checkbox path="operationSystem" value="Linux"/>Linux
<form:checkbox path="operationSystem" value="MacOS"/>Mac OS
<br><br>
<input type="submit" value="submit"/>
</form:form>
</div>
</body>
</html>