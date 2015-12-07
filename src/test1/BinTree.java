package test1;

public class BinTree {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TNode C=new TNode("C", null, null);
		TNode H=new TNode("H", null, null);
		TNode F=new TNode("F", null, null);	
		TNode G=new TNode("G", null, null);		
		TNode B=new TNode("B", G, H);
		TNode D=new TNode("D", C, F);
		TNode A=new TNode("A", B, D);
		String str=TreeLevel(A, 3);
	}
	
	public static String TreeLevel(TNode tree, int n){
		StringBuffer s=new StringBuffer();
		TreeLevel(tree, n, s);
		String str= s.toString();		
		return str;
	}
	
	public static void TreeLevel(TNode tree, int n,StringBuffer s){
		if(n==2){
			//System.out.print(tree.left.value);			
			//System.out.print(tree.right.value);
			s.append(tree.left.value);
			s.append(tree.right.value);			
		}
		else{
			TreeLevel(tree.left, n-1);
			TreeLevel(tree.right, n-1);
		}		
	}

}
