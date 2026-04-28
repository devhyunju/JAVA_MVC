package com.global.mvc.service;

import java.util.UUID;

public class BService {
	public static String uuid() {
		return UUID.randomUUID().toString();
	}

}
