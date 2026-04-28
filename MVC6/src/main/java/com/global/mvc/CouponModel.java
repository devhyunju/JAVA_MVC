package com.global.mvc;

import java.util.UUID;

import jakarta.servlet.http.HttpServletRequest;

public class CouponModel {
	public static void generateNumber(HttpServletRequest req) {
		String number = UUID.randomUUID().toString();
		req.setAttribute("coupon", number);
	}

}
