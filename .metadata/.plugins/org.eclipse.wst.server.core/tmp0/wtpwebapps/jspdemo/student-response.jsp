<html>
<head>
<title>Student Details</title>
</head>
<body align="center">

	<h3 style="color: red">Student Confirmed</h3>
	<br>
	 Name          : ${param.firstName} ${param.lastName }
	<br>
	 Date Of Birth : ${param.DOB }
	 <br>
	 Email Address : ${param.studentEmail }
	<br>
	 Country       : ${param.country }
<br>
	Favorite Language :
	<ul align="center">
		<%
		String[] lang = request.getParameterValues("favoriteLanguage");
		if (lang != null) {

			for (String tempLang : lang) {
				out.println("<li>" + tempLang + "</li>");
			}
		}
		%>
	</ul>
</body>

</html>