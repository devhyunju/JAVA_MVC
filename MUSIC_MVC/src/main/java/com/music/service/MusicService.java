package com.music.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import com.music.bean.Music;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MusicService {
	
	@SuppressWarnings("unchecked")
	public static void regist(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
		System.out.println("MusicService.regist");
		String title = req.getParameter("title").trim();
		if ( null == title || "".equals(title) ) {
			throw new ServletException("title is empty");
		}
		Music music = new Music();
		music.setKey(UUID.randomUUID().toString());
		music.setTitle(title);
		music.setVocal(req.getParameter("vocal"));
		music.setReleaseComp(req.getParameter("releaseComp"));
		music.setReleaseDate(req.getParameter("releaseDate"));
		music.setCreateDate(new Date());
		ArrayList<Music> musicList = (ArrayList<Music>) req.getServletContext().getAttribute("musicList");
		musicList.add(music);
	}

}
