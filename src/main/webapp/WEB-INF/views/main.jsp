<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>ListTest</title>
	<link rel="stylesheet" href="/main/main.css">
</head>
<body>
	<h1>MySQL TEST</h1>
	    <table> 
	    		<tr>
			        <th>Title</th>
			        <th>Writer</th>
			        <th>Content</th>
			        <th>Date</th>
				</tr>
		        <c:forEach items="${list}" var="list">
		            <tr style="text-align: center;">
		                <td>${list.title}</td>
		                <td>${list.writer}</td>
		                <td>${list.content}</td>
		                <td>${list.regDate}</td>
					</tr>
					
		        </c:forEach>
	    </table>
</body>
</html>