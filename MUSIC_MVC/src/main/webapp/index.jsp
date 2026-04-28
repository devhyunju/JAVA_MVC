<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
	</head>
	<body>
		<div>
			<h1>MUSIC MVC</h1>
		</div>
		<ul>
			<li><a href="<c:url value="/music/form.ms"/>">Music Form</a></li>
			<li><a href="<c:url value="/music/list.ms"/>">Music List</a></li>
		</ul>
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
