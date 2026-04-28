package com.global.coupon;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.UUID;

public class CouponModel {
	public static String getCoupon() throws UnknownHostException {
		InetAddress localAddress = InetAddress.getLocalHost();
		String ip = localAddress.getHostAddress();
		return UUID.randomUUID().toString() + "-" + ip;
	}
}
