package test1;

public class InttoH {

	public static String inttoHex(int num) {
		StringBuffer s = new StringBuffer();
		boolean isPlus = true;
		if (num < 0) {
			isPlus = false;
			num = -num;
		}
		int i = 0;
		while (num / 16 != 0) {
			i = num % 16;
			s.append(inttoChar(i));
			num = num / 16;
		}
		s.append(inttoChar(num));
		s.append("x0");
		if (!isPlus) {
			s.append('-');
		}
		String str = s.reverse().toString();
		return str;
	}

	/*
	 * 将10以上的数转化为字符
	 */
	private static char inttoChar(int i) {
		switch (i) {
		    case 0:
		    	return '0';
			case 1:
			    return '1';
		    case 2:
			    return '2';
		    case 3:
			    return '3';
		    case 4:
			    return '4';
		    case 5:
			    return '5';
		    case 6:
			    return '6';
		    case 7:
			    return '7';
		    case 8:
			    return '8';
		    case 9:
			    return '9';
		    case 10:
			    return 'A';
		    case 11:
			    return 'B';
		    case 12:
			    return 'C';
		    case 13:
			    return 'D';
		    case 14:
			    return 'E';
		    default:
			    return 'F';
		}
	}
	


}
