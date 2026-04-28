package com.global.mvc;

import java.util.UUID;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

public class CouponModel {
	public static void generateNumber(HttpServletRequest req) {
		String Num = UUID.randomUUID().toString();
		req.setAttribute("coupon", Num);
	}
}
