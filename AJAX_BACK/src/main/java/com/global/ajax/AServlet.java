package com.global.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

@WebServlet("/api/test")
public class AServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(this);
		String data = req.getParameter("data");
		ObjectMapper mapper = new ObjectMapper();
		JsonNode msgJsonNode = mapper.readTree(data);
		String msg = msgJsonNode.get("msg").asString();
		Map<String, String> map = new HashMap<>();
		map.put("msg", msg + "_" + UUID.randomUUID().toString());
		String msgJson = mapper.writeValueAsString(map);
		PrintWriter pw = resp.getWriter();
		pw.print(msgJson);
		pw.close();
	}
}
