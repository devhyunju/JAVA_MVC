<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
	</head>
	<body>
		<div>
			<h1>MUSIC FORM</h1>
		</div>
		<hr>
		<div>
			<form id="frm1">
				<span>1.제목을 입력하세요.</span><br>
				<input type="text" id="title" name="title" placeholder="제목" maxlength="100"><br>
				<br>
				<span>2.가수 입력하세요.</span><br>
				<input type="text" id="vocal" name="vocal" placeholder="가수" maxlength="100"><br>
				<br>
				<span>3.발매사를 입력하세요.</span><br>
				<input type="text" name="releaseComp" placeholder="발매사" maxlength="100"><br>
				<br>
				<span>4.발매일을 입력하세요.</span><br>
				<input type="text" name="releaseDate" placeholder="발매일" maxlength="100"><br>
				<br>
				<input type="button" id="btnRegist" value="등록">
			</form>
			<script>
				document.getElementById('btnRegist').addEventListener('click', function(){
					let title = document.getElementById('title');
					let vocal = document.getElementById('vocal');
					if ( '' == title.value ) {
						alert('제목을 입력해주세요.');
						title.style.backgroundColor = "skyblue";
						title.focus();
						return;
					}
					title.style.backgroundColor = "";
					if ( '' == vocal.value.trim() ) {
						alert('가수를 입력해주세요.');
						vocal.style.backgroundColor = "skyblue";
						vocal.focus();
						return;
					}
					vocal.style.backgroundColor = "";
					if ( confirm("음악이 등록됩니다.\n진행할까요?") ) {
						let frm1 = document.getElementById('frm1');
						frm1.action = '<c:url value="/music/regist.ms"/>';
						frm1.method = 'post';
						frm1.submit();
					}
				});
			</script>
		</div>
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
