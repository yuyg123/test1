package tree;

import java.util.LinkedList;

public class BinaryTree {
	private Tree tree;
	public  LinkedList<TNode> nodeList=null;

	public BinaryTree() {
		tree = new Tree();
	}

	public void insertNode(TNode node) {
		if (tree.getNode() == null) {
			tree.setNode(node);
			return;
		} else {
			nodeList = new LinkedList<TNode>();
			nodeList.add(tree.getNode());
			while (!nodeList.isEmpty()) {
				TNode temp = nodeList.pollFirst();//取链表中的第一个元素作为根节点
				if (temp.leftChild == null) {
					temp.setLeftChild(node);
					return;
				} else if (temp.getRightChild() == null) {
					temp.setRightChild(node);
					return;
				} else {
					nodeList.add(temp.getLeftChild());
					nodeList.add(temp.getRightChild());
				}
			}
		}
	}

	/*
	 * 先序遍历
	 */
	public void frontOrder(TNode node) {
		if (node != null) {
			System.out.print(node.getValue());
			frontOrder(node.getLeftChild());
			frontOrder(node.getRightChild());
		}

	}

	/*
	 * 中序遍历
	 */
	public void midOrder(TNode node) {
		if (node != null) {
			frontOrder(node.getLeftChild());
			System.out.print(node.getValue());
			frontOrder(node.getRightChild());
		}

	}

	/*
	 * 后序遍历
	 */
	public void lastOrder(TNode node) {
		if (node != null) {
			frontOrder(node.getLeftChild());
			frontOrder(node.getRightChild());
			System.out.print(node.getValue());
		}

	}

	/*
	 * 返回树指定层的数据
	 */
	public String TreeLevel(TNode node, int n) throws Exception {
		StringBuffer sbf = new StringBuffer();
		TreeLevel(sbf, node, n);
		String str = sbf.toString();
		System.out.print(str);
		return str;
	}

	private void TreeLevel(StringBuffer sbf, TNode node, int n) throws Exception {
		if (n < 1) {
			 throw new Exception(""); 
		}
		if (n == 1) {
			sbf.append(node.getValue());
		} else if (n == 2) {
			if (node.leftChild != null) {
				sbf.append(node.leftChild.getValue());
			}
			if (node.rightChild != null) {
				sbf.append(node.rightChild.getValue());
			}
		} else {
			if (node.leftChild != null) {
				TreeLevel(sbf, node.leftChild, n - 1);
			}
			if (node.rightChild != null) {
				TreeLevel(sbf, node.rightChild, n - 1);
			}
			
		}

	}

	public Tree getTree() {
		return tree;
	}


}
