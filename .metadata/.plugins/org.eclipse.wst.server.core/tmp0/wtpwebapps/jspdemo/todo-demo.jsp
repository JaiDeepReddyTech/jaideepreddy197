<%@ page import="java.util.*" %>
<html>
<body>
<form action="todo-demo.jsp">
<input type="text" name="theItems"/>
<input type="submit" value="submit"/>

</form>
<br>
<% 
List <String> items= (List<String>) session.getAttribute("myToDoList");

if(items==null){
	items=new ArrayList<String>();
	session.setAttribute("myToDoList",items);	
}
String theItems=request.getParameter("theItems");
if(items!=null){
	items.add(theItems);
}

%>
<hr>
<br>To List Items<br>
<ol>
<%for(String temp:items){
	out.println("<li>"+temp+"</li>");
}

	%>
</ol>
</body>
</html>