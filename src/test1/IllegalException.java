package test1;

public class IllegalException extends IllegalArgumentException{
	public IllegalException(int num,int depth) {
		System.out.println("输入的数字"+num+"不合法，不要超过" + depth + "或者小于1");
	}

}
