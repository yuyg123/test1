package test1;

public class InttoH {

	public static void main(String[] args) {		
		System.out.println(InttoH(45));
	}
	
	public static StringBuffer InttoH(int num){
		StringBuffer s=new StringBuffer();
		int i=0;
		while(num>15){
			i=num%16;
			if(i>=10){
				s.append(IntoC(i));				
			}
			else
				s.append(i);
			num=num/16;			
		}
     	s.append(num);
     	s.append("x0");
		return s.reverse();
	}
	
	public static char IntoC(int i){
		switch(i){
		case 10: return 'a';
		case 11: return 'b';
		case 12: return 'c';
		case 13: return 'd';
		case 14: return 'e';
		default: return 'f';		
		}
	}
	
	
}
