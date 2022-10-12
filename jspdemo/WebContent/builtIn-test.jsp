<html>
<body>
<h3>JSP Build-In Objects</h3>

Request User agent : <%= request.getHeader("User-Agent") %>
<br/>
<br/>
Request User Language : <%=request.getLocale() %>
</body>
</html>