<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>AJAX jQuery</title>
		<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
	</head>
	<body>
		<div>
			<h1>AJAX jQuery</h1>
		</div>
		<div>
			<input type="text" id="artist" placeholder="아티스트명">
			<input type="button" id="btnSearch" value="검색">
		</div>
		<div id="result"></div>
		<script>
			let count = 1;
			$('#btnSearch').click(function() {
				$.getJSON('https://itunes.apple.com/search', {
					term: $('#artist').val().trim()
	                ,country: 'KR'
	                ,media: 'music'
	                ,limit: 1
				}).done(function(data) {
	                console.log(data);
	                data.results.forEach(function(song, index) {
	                	let html = '';
	                	html += '<h3>' + count++ + '.'+ song.trackName + '</h3>';
	                	html += '<div>';
	                	html += '  <img src="' + song.artworkUrl100 + '" style="display: inline-block">';
	                	html += '  <audio controls src="' + song.previewUrl + '"></audio>';
	                	html += '</div>';
	                	html += '<hr>';
	                	$('#result').prepend(html);
	                });
	            }).fail(function(error) {
	                console.error(error);
	            });
				$('#artist').val('');
			});
			$('#artist').keypress(function(e) {
	            if (e.which === 13) {
	                $('#btnSearch').click();
	            }
	        });
		</script>
	</body>
</html>