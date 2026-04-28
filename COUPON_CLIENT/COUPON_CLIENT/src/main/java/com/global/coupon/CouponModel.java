package com.global.coupon;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import jakarta.servlet.http.HttpServletRequest;

public class CouponModel {
	
	public static void getCoupon(HttpServletRequest req) throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
				                .uri(URI.create("http://192.168.0.15:8081/COUPON_SERVER/api/v1/coupon"))
				                .GET()
				                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status Code: " + response.statusCode());
        System.out.println("Body: " + response.body());
        req.setAttribute("coupon", response.body());
	}
}
