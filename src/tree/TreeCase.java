package tree;

public class TreeCase {

	public static void main(String[] args) {
		TNode node = null;
		TNode node1 = null;
		BinaryTree bTree = new BinaryTree();
		BinaryTree bTree1 = new BinaryTree();
		try {
			node1 = bTree1.createBinaryTree("ABF####");
			node = bTree.createBinaryTree("AB#G##CF##D#G##");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.print("先序遍历：  ");
		System.out.println(bTree.frontOrder(node));
		System.out.print("中序遍历：  ");
		System.out.println(bTree.midOrder(node));
		System.out.print("后序遍历：  ");
		System.out.println(bTree.lastOrder(node));
		System.out.print("层遍历：      ");
		try {
			System.out.println(bTree.TreeLevel(node,3));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.print("先序遍历：  ");
		System.out.println(bTree1.frontOrder(node1));
		System.out.print("中序遍历：  ");
		System.out.println(bTree1.midOrder(node1));
		System.out.print("后序遍历：  ");
		System.out.println(bTree1.lastOrder(node1));
		System.out.print("层遍历：      ");
		try {
			System.out.println(bTree1.TreeLevel(node1,3));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
