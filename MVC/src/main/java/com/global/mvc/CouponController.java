package com.global.mvc;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value = "/coupon")
public class CouponController extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("CouponController.doGet");
	CouponModel.generateNumber(req);//컨트롤러는 모델한테 일 시키고 담아둔 리퀘스트 jsp(view)에 전달 
	req.getRequestDispatcher("/WEB-INF/coupon.jsp").forward(req, resp);
	}
}
