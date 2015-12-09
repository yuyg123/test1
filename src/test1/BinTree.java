package test1;

public class BinTree {

	public static void main(String[] args) {
		TNode C = new TNode("C", null, null);
		TNode H = new TNode("H", null, null);
		TNode F = new TNode("F", null, null);
		TNode G = new TNode("G", null, null);
		TNode B = new TNode("B", G, H);
		TNode D = new TNode("D", C, F);
		TNode A = new TNode("A", B, D);
		System.out.print(TreeLevel(A, 1));
	}

	public static StringBuffer TreeLevel(TNode tree, int n) {
		StringBuffer s = new StringBuffer();
		TreeLevel(tree, n, s);
		return s;
	}

	public static void TreeLevel(TNode tree, int n, StringBuffer s) {
		if (n == 1) {
			s.append(tree.value);
		} else if (n == 2) {
			s.append(tree.left.value);
			s.append(tree.right.value);
		} else {
			TreeLevel(tree.left, n - 1);
			TreeLevel(tree.right, n - 1);
		}
	}

}
