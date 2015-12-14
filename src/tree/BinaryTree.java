package tree;

import java.util.LinkedList;
import java.util.List;

import test1.IllegalException;

/**
 * 创建二叉树，对树进行遍历操作
 * 
 * @author yuyg yuyg@succez.com
 */
public class BinaryTree {
	private int index = 0;
	private Tree tree;

	/**
	 * 创建2叉树，返回根节点
	 * 
	 * @param tree
	 * @return 根节点
	 * @throws Exception
	 */
	public TNode createBinaryTree(String tree) throws Exception {
		TNode root = new TNode();
		if (tree.isEmpty()) {
			throw new Exception("输入的字符串不能为空");// 判断输入的树是否为空
		}
		if (index < tree.length()) {
			root.setValue(tree.charAt(index));
			if (tree.charAt(++index) != '#') {
				if (root.getLeftChild() == null) {
					root.setLeftChild(createBinaryTree(tree));// 如果左子树为空，创建左子树
				}
			}
			if (tree.charAt(++index) != '#') {
				if (root.getRightChild() == null) {
					root.setRightChild(createBinaryTree(tree));// 如果右子树为空，创建右子树
				}
			}
		}
		return root;
	}

	/**
	 * 使用先序遍历，将遍历到的节点存到List中返回
	 * 
	 * @param node
	 * @return
	 * @return List<TNode>
	 * @throws
	 */
	public List<TNode> frontOrder(TNode node) {
		List<TNode> list = new LinkedList<TNode>();
		frontOrder(node, list);// 对象复用
		return list;
	}

	/**
	 * 先序遍历递归调用
	 */
	private void frontOrder(TNode node, List<TNode> list) {
		if (node != null) {
			list.add(node);
			frontOrder(node.getLeftChild(), list);// 遍历左子树
			frontOrder(node.getRightChild(), list);// 遍历右子树
		}
	}

	public List<TNode> midOrder(TNode node) {
		List<TNode> list = new LinkedList<TNode>();
		midOrder(node, list);
		return list;
	}

	/**
	 * 中序遍历递归调用
	 */
	public void midOrder(TNode node, List<TNode> list) {
		if (node != null) {
			midOrder(node.getLeftChild(), list);
			list.add(node);
			midOrder(node.getRightChild(), list);
		}
	}

	/**
	 * 后序遍历
	 * 
	 * @param node
	 * @return
	 */
	public List<TNode> lastOrder(TNode node) {
		List<TNode> list = new LinkedList<TNode>();// 创建一个list容器，用于存放遍历的树的节点
		lastOrder(node, list);// 对象复用
		return list;
	}

	public void lastOrder(TNode node, List<TNode> list) {
		if (node != null) {
			lastOrder(node.getLeftChild(), list);// 遍历左子树
			lastOrder(node.getRightChild(), list);// 遍历右子树
			list.add(node);// 将根节点加入到list容器中
		}
	}

	/**
	 * 输入树的根节点和所求的层度，遍历这棵树的指定层的所有节点，将节点存到List中返回。
	 * @param node
	 * @param n
	 * @return
	 * @throws Exception
	 */
	public List<TNode> TreeLevel(TNode node, int n) throws Exception {
		int depth = BinaryTreeDepth(node);
		if (n < 1 || n > depth) {
			throw new IllegalException(n, depth);
		}
		List<TNode> list = new LinkedList<TNode>();
		TreeLevel(list, node, n); 
		return list;
	}

	/**
	 * 
	 * @Title: TreeLevel
	 * @Description: 提供给TreeLevel(TNode node, int n)调用，进行递归操作
	 * @author: yuyg yuyg@succez.com
	 */
	private void TreeLevel(List<TNode> list, TNode node, int n) {
		if (n == 1) {
			list.add(node);
		} else if (n == 2) { // 如果树的层数为2时，即到了要遍历的层数的上一层，将他的左右孩子加入到list中。
			if (node.getLeftChild() != null) {
				list.add(node.getLeftChild());
			}
			if (node.getRightChild() != null) {
				list.add(node.getRightChild());
			}
		} else {
			if (node.getLeftChild() != null) {
				TreeLevel(list, node.getLeftChild(), n - 1);// 树的左子树的遍历递归，到n=2时，即到了要遍历的层数的上一层。
			}
			if (node.getRightChild() != null) {
				TreeLevel(list, node.getRightChild(), n - 1);// 树的左子树的遍历递归，到n=2时，即到了要遍历的层数的上一层。
			}
		}
	}

	/**
	 * 输入树的根节点，计算出树的深度
	 * @param: @param node
	 * @param: @return
	 * @return int
	 * @author: yuyg yuyg@succez.com
	 */
	private int BinaryTreeDepth(TNode node) {
		if (node == null) {
			return 0;// 如果根节点为空，返回层数为0；
		} else {
			int left = BinaryTreeDepth(node.getLeftChild());// 计算根节点的左子树的深度。
			int right = BinaryTreeDepth(node.getRightChild());// 计算根节点的右子树的深度。
			return 1 + Math.max(left, right);// 对比左右子树的深度，取最大值，由于根节点属于一层，需要加1。
		}
	}

	public void setIndex() {
		this.index = 0;
	}

	public Tree getTree() {
		return tree;
	}

}
