<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>AJAX fetch2</title>
	</head>
	<body>
		<div>
			<h1>AJAX fetch2</h1>
		</div>
		<div>
		    <input type="text" id="artist" placeholder="아티스트명">
		    <input type="button" id="btnSearch" value="검색">
		</div>
		<div id="result"></div>
		<script>
		    let count = 1;
		    const searchMusic = async () => {
		        const artist = document.getElementById('artist').value.trim();
		        if (!artist) return;
		        const params = new URLSearchParams({
		            term: artist,
		            country: 'KR',
		            media: 'music',
		            limit: 1
		        });
		        try {
		            const response = await fetch(`https://itunes.apple.com/search?${params}`);
		            const data = await response.json();
		            
		            console.log(data);
		            
		            data.results.forEach(song => {
		                const html = `
		                    <h3>${count++}. ${song.trackName}</h3>
		                    <div>
		                        <img src="${song.artworkUrl100}" style="display: inline-block">
		                        <audio controls src="${song.previewUrl}"></audio>
		                    </div>
		                    <hr>
		                `;
		                
		                document.getElementById('result').insertAdjacentHTML('afterbegin', html);
		            });
		        } catch (error) {
		            console.error('Error fetching music:', error);
		        } finally {
		            document.getElementById('artist').value = '';
		        }
		    };
		    document.getElementById('btnSearch').addEventListener('click', searchMusic);
		    document.getElementById('artist').addEventListener('keypress', (e) => {
		        if (e.key === 'Enter') {
		            searchMusic();
		        }
		    });
		</script>
	</body>
</html>