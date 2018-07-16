package facebook;

import java.util.HashMap;
import java.util.Map;

public class UrlEncodeAndDecode {
	
	static Map<Integer,String> map = new HashMap<>();
	static int i =0;
	public static void main(String[] args) {
		String url = "http://longurlleetcode.com";
		String finalURL = decode(encode(url));
		System.out.println(url);
		System.out.println(finalURL);
	}

	private static String encode(String url) {
		
		map.put(i, url);
		
		return "http://tinyUrl" + i++;
	}
	
	private static String decode(String url) {
		return map.get(Integer.parseInt(url.replace("http://tinyUrl", "")));
	}
}
