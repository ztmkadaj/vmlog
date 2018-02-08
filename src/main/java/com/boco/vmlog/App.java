package com.boco.vmlog;

import java.util.HashMap;
import java.util.Map;

import com.github.kevinsawicki.http.HttpRequest;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		login();

	}

	public static void login() {
		String url = "http://192.168.100.251/webAuth/";
		Map<String, String> params = new HashMap<String, String>();

		// username=zhaoming2017&password=123456&pwd=123456&secret=true
		params.put("username", "zhaoming2017");
		params.put("password", "123456");
		params.put("pwd", "123456");
		params.put("secret", "true");

		HttpRequest request = HttpRequest.post(url).form(params);

		System.out.println(request.body());

	}

}
