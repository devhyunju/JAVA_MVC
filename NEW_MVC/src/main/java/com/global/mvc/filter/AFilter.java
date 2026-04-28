package com.global.mvc.filter;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class AFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//전처리 : 들어올 때 처리하고 싶으면 여기에 코딩 
		String ip = request.getRemoteAddr();
		System.out.println(ip);
		if ("192.168.0.7".equals(ip)) {
			chain.doFilter(request, response);
		} else {
			PrintWriter pw = response.getWriter();
			pw.print("<h1>Goodbye</h1>");
			return;
		}
		chain.doFilter(request, response);
		
		//후처리 : 나갈때 처리하고 싶으면 여기에 코딩 
		
	}

}
