<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.lutarevichsonya.Models.Animal" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <style>
        table, th, td {
            border: 3px solid black;
            border-collapse: collapse;
        }
    </style>
    <title>Title</title>
</head>
<body>
<%
    List<Animal> animals = (List) request.getAttribute("animals");
%>
<table>
    <thead>
    <tr>
        <th>name</th>
        <th>full owner name</th>
        <th>type</th>
        <th>age</th>
    </tr>
    </thead>
    <tbody>
    <%
    for(Animal animal : animals) {
    %>
    <tr>
        <td><%=animal.getName() %></td>
        <td><%=animal.getFullOwnerName() %></td>
        <td><%=animal.getType() %></td>
        <td><%=String.valueOf(animal.getAge()) %></td>
    </tr>
    <%
        }
    %>
    </tbody>
    </table>
</body>
</html>
