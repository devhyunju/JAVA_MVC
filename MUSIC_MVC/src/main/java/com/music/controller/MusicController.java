package com.music.controller;

import com.music.service.MusicService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MusicController {
	
	public static String form(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("MusicController.form");
		return "/music/music_form";
	}
	public static String regist(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
		System.out.println("MusicController.regist");
		MusicService.regist(req, resp);
		return "redirect:/";
	}
	public static String list(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("MusicController.list");
		return "/music/music_list";
	}

}
