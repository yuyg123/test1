package test1;

/**
 * 
 * @Description: 10进制转化为16进制
 * @author yuyg yuyg@succez.com
 * @date 2015年12月11日 下午12:52:16
 */
public class IntToHex {

	private static byte[] intToChar = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E',
			'F' };// 定义字符数组，包含16进制里的数。

	public static byte intToChar(int num) {
		return intToChar[num];
	}

	/**
	 * 将int转换为16进制数
	 * @pre intToHex(-15)转换后为-F
	 */
	public static String intToHex(int num) {
		if (num == Integer.MIN_VALUE) {
			return "-80000000"; // int的最小值超出了边界，应作为特殊处理，直接返回值。
		}
		byte[] chars = new byte[9];
		boolean isPlus = true;
		if (num < 0) {
			isPlus = false;
			num = -num;
		}
		int i = 8;
		if (num == 0) {
			return "0";
		}
		while (num > 0) {
			chars[i--] = intToChar(num & 0xf);
			num >>= 4;
		}
		if (!isPlus) {
			chars[i] = '-';
			return new String(chars, i, chars.length - i);
		}
		i++;
		return new String(chars, i, chars.length - i);
	}

}
