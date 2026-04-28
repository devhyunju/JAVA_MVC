<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
		<style>
		  table, th, td {
		    border: 1px solid black;
		    border-collapse: collapse;
		  }
		</style>
	</head>
	<body>
		<div>
			<h1>MUSIC LIST</h1>
		</div>
		<hr>
		<div>
			<table>
				<tr>
					<th>No.</th>
					<th>Key</th>
					<th>제목</th>
					<th>가수</th>
					<th>발매사</th>
					<th>발매일</th>
					<th>생성일시</th>
				</tr>
				<c:forEach var="music" items="${applicationScope.musicList }" varStatus="i" >
					<tr>
						<td>${i.count}</td>
						<td>${music.key}</td>
						<td>${music.title}</td>
						<td>${music.vocal}</td>
						<td>${music.releaseComp}</td>
						<td>${music.releaseDate}</td>
						<td><fmt:formatDate value="${music.createDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
					</tr>
				</c:forEach>
			</table>
		</div>
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
