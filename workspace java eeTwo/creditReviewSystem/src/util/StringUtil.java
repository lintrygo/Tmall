package util;

import java.io.UnsupportedEncodingException;

public class StringUtil {
	/**
	 * 将字符串转为utf-8格式的中文
	 * @param str
	 * @return
	 */
	public static String ToCN(String str) {
		if (str == null)
			return str;
		try {
			return new String(str.getBytes("iso8859-1"), "utf-8");
		} catch (UnsupportedEncodingException e) {
			return str;
			//e.printStackTrace();
		}
	}

}
