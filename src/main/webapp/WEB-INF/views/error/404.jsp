<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html lang="ko">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" >
	<title>ERROR</title>
	<link rel="stylesheet" href="/commons/css/style.css">
	<script src="/commons/js/jquery-3.4.1.min.js"></script>
	<script type="text/javascript" src="/commons/js/jQueryTest.js"></script>
</head>
<body>
	<div layout:fragment="content">
	    <h1>KimiException Test Page</h1>
	    Error Code : 404
	    <br>exception : <td><spring:message code="error.404" text="default text" /></td>
	</div>
</body>
</html>