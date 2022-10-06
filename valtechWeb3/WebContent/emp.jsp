<%@page import="com.valtech.dao.Employee"%>
<%@page import="com.valtech.dao.EmployeeDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
	EmployeeDAO dao=new EmployeeDAO(); 
	int id=Integer.parseInt(request.getParameter("empId"));
	Employee e=dao.getEmployee(id);
	String prev="empCtlr?empId="+dao.getPreviousId(id);
	String next="empCtlr?empId="+dao.getNextId(id);
	String first="empCtlr?empId="+dao.getFirstId();
	String last="empCtlr?empId="+dao.getLastId();
	
			
%>

<table>
<tr>
<td>Id</td><td><%=e.getId() %></td>
</tr>
<tr>
	<td>Name</td><td><%= e.getName()%></td>
</tr>
<tr>
<td>Age</td><td><%= e.getAge() %></td></td>
</tr>
<tr>
<td>Gender</td><td><%= e.getGender() %></td></td>
</tr>
<tr>
<td>Salary</td><td><%= e.getSalary() %></td></td>
</tr>
<tr>
<td><a href=<%=prev %>><button>Previous</button></a>
</td>
<td><a href=<%=next %>><button>Next</button></a></td><br>
<td><a href=<%=first %>><button>First Employee</button></a></td><br>
<td><a href=<%=last %>><button>Last Employee</button></a></td><br>
</table>

</body>
</html>