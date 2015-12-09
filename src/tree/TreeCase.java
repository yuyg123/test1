package tree;

public class TreeCase {
	
	public static void main(String[] args){
		BinaryTree bTree=new BinaryTree();
		TNode[] nodes=new TNode[10]; 
		String[] arr={"A","B","C","D","E","F","G","H","J","K"};
		for(int i=0;i<arr.length;i++){
			nodes[i]=new TNode(arr[i]);
			bTree.insertNode(nodes[i]);
		}
		System.out.print("先序遍历：  ");
		bTree.frontOrder(bTree.getTree().getNode());
		System.out.println();
		System.out.print("中序遍历：  ");
		bTree.midOrder(bTree.getTree().getNode());
		System.out.println();
		System.out.print("后序遍历：  ");
		bTree.lastOrder(bTree.getTree().getNode());
		System.out.println();
		System.out.print("层遍历：      ");
		try {
			bTree.TreeLevel(bTree.getTree().getNode(),0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
