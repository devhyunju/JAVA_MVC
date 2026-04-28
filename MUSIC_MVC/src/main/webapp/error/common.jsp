<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
	</head>
	<body>
		<div>
			<h1>Common Error</h1>
		</div>
		<div>
			${pageContext.errorData.statusCode}<br>
			${pageContext.errorData.throwable}<br>
			${pageContext.errorData.requestURI}
		</div>
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
