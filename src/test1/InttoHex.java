package test1;

/**
 * 
 * @Description: 10进制转化为16进制
 * @author yuyg yuyg@succez.com
 * @date 2015年12月11日 下午12:52:16
 */
public class InttoHex {

	private static char[] inttoChar = { '0', '1', '2', '3', '4', '5', '6', '7',
			'8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };// 定义字符数组，包含16进制里的数。

	public static char inttoChar(int num) {
		return inttoChar[num];
	}

	/**
	 * 将int转换为16进制数
	 * @param num
	 * @return
	 */
	public String inttoHex(int num) {
		if (num == Integer.MIN_VALUE) {
			return "80000000"; // int的最小值超出了边界，应作为特殊处理，直接返回值。
		}
		StringBuilder s = new StringBuilder();
		boolean isPlus = true;
		if (num < 0) {
			isPlus = false;
			num = -num;
		}
		int i = 0;
		while (num / 16 != 0) { // 直到num小于15时跳出循环，循环里面每次相除求余，保存到StringBuilder中
			i = num & 0xf;
			s.append(inttoChar(i));
			num = num >>> 4;
		}
		s.append(inttoChar(num));
		if (!isPlus) {
			s.append('-');
		}
		String str = s.reverse().toString();// 存进来的字符串顺序是反的，需要逆序处理转化为字符串返回。
		return str;
	}

}
