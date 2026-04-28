package com.global.mvc;


import java.util.UUID;

import jakarta.servlet.http.HttpServletRequest;

public class CouponModel {
	public static void generateNumber(HttpServletRequest req) {
		String couponNum = UUID.randomUUID().toString();//랜덤으로 생성되는 ID 객체에 넣기
		req.setAttribute("coupon", couponNum);//저장해두기 
	}
}
