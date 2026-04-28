package com.global.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet(value = "/hello")
public class HelloServlet extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		System.out.println("HelloServlet.init");
	}
	@Override
	public void destroy() {
		System.out.println("HelloServlet.destroy");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("HelloServlet.doGet");
		String name = req.getParameter("name");
		PrintWriter pw = resp.getWriter();//sysout 이랑 똑같
		pw.printf("<h1>Hello %s</h1>", name);
		pw.close();
	}
	
/*	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("HelloServlet.doPost");
		String name = req.getParameter("name");
		PrintWriter pw = resp.getWriter();//sysout 이랑 똑같
		pw.printf("<h1>Hello %s</h1>", name);
		pw.close();
	}*/
}
