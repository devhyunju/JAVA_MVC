<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>AJAX fetch</title>
	</head>
	<body>
		<div>
			<h1>AJAX fetch</h1>
		</div>
		<div>
		    <input type="text" id="artist" placeholder="아티스트명">
		    <input type="button" id="btnSearch" value="검색">
		</div>
		<div id="result"></div>
		<script>
		    let count = 1;
		    document.getElementById('btnSearch').addEventListener('click', function() {
		        const artist = document.getElementById('artist').value.trim();
		        const params = new URLSearchParams({
		            term: artist,
		            country: 'KR',
		            media: 'music',
		            limit: 1
		        });
		        fetch('https://itunes.apple.com/search?' + params)
	            .then(response => response.json())
	            .then(data => {
	                console.log(data);
	                data.results.forEach(function(song, index) {
	                    let html = '';
	                    html += '<h3>' + count++ + '.' + song.trackName + '</h3>';
	                    html += '<div>';
	                    html += '  <img src="' + song.artworkUrl100 + '" style="display: inline-block">';
	                    html += '  <audio controls src="' + song.previewUrl + '"></audio>';
	                    html += '</div>';
	                    html += '<hr>';
	                    const resultDiv = document.getElementById('result');
	                    resultDiv.insertAdjacentHTML('afterbegin', html);
	                });
	            })
	            .catch(error => {
	                console.error(error);
	            });
		        document.getElementById('artist').value = '';
		    });
		    document.getElementById('artist').addEventListener('keypress', function(e) {
		        if (e.which === 13 || e.keyCode === 13) {
		            document.getElementById('btnSearch').click();
		        }
		    });
		</script>
	</body>
</html>