package com.global.mvc.controller;

import com.global.mvc.service.BService;

import jakarta.servlet.http.HttpServletRequest;

public class BController {
	public static String b(HttpServletRequest req) {
		String uuid = BService.uuid();
		req.setAttribute("uuid", uuid);
		return "/WEB-INF/views/b.jsp";
	}
}
