package tree;

public class BinaryTree {
	private int index = 0;
	private Tree tree;

	public TNode createBinaryTree(String tree) throws Exception {
		TNode root = new TNode();
		if (tree.isEmpty()) {
			throw new Exception("输入的字符串不能为空");
		}
		if (index < tree.length()) {
			root.setValue(tree.charAt(index));
			if (tree.charAt(++index) != '#') {
				if (root.getLeftChild() == null) {
					root.setLeftChild(createBinaryTree(tree));
				}
			}
			if (tree.charAt(++index) != '#') {
				if (root.getRightChild() == null) {
					root.setRightChild(createBinaryTree(tree));
				}
			}

		}
		return root;
	}

	/*
	 * 先序遍历
	 */
	public String frontOrder(TNode node) {
		StringBuilder str = new StringBuilder();
		frontOrder(node, str);
		return str.toString();
	}

	public void frontOrder(TNode node, StringBuilder str) {
		if (node != null) {
			str.append(node.getValue());
			frontOrder(node.getLeftChild(), str);
			frontOrder(node.getRightChild(), str);
		}
	}

	/*
	 * 中序遍历
	 */
	public String midOrder(TNode node) {
		StringBuilder str = new StringBuilder();
		midOrder(node, str);
		return str.toString();
	}

	public void midOrder(TNode node, StringBuilder str) {
		if (node != null) {
			frontOrder(node.getLeftChild(), str);
			str.append(node.getValue());
			frontOrder(node.getRightChild(), str);
		}
	}

	/*
	 * 后序遍历
	 */
	public String lastOrder(TNode node) {
		StringBuilder str = new StringBuilder();
		lastOrder(node, str);
		return str.toString();
	}

	public void lastOrder(TNode node, StringBuilder str) {
		if (node != null) {
			frontOrder(node.getLeftChild(), str);
			frontOrder(node.getRightChild(), str);
			str.append(node.getValue());
		}
	}

	/*
	 * 返回树指定层的数据
	 */
	public String TreeLevel(TNode node, int n) throws Exception {
		int depth = BinaryTreeDepth(node);
		if (n < 1 || n > depth) {
			throw new Exception("输入数字不要超过" + depth + "或者小于1");
		}
		StringBuilder sbf = new StringBuilder();
		TreeLevel(sbf, node, n);
		String str = sbf.toString();
		return str;
	}

	private void TreeLevel(StringBuilder sbf, TNode node, int n) {
		if (n == 1) {
			sbf.append(node.getValue());
		} else if (n == 2) {
			if (node.getLeftChild() != null) {
				sbf.append(node.getLeftChild().getValue());
			}
			if (node.getRightChild() != null) {
				sbf.append(node.getRightChild().getValue());
			}
		} else {
			if (node.getLeftChild() != null) {
				TreeLevel(sbf, node.getLeftChild(), n - 1);
			}
			if (node.getRightChild() != null) {
				TreeLevel(sbf, node.getRightChild(), n - 1);
			}
		}
	}

	/*
	 * 返回树的深度
	 */
	private int BinaryTreeDepth(TNode node) {
		if (node == null) {
			return 0;
		} else {
			int left = BinaryTreeDepth(node.getLeftChild());
			int right = BinaryTreeDepth(node.getRightChild());
			return 1 + Math.max(left, right);
		}
	}

	public Tree getTree() {
		return tree;
	}

}
