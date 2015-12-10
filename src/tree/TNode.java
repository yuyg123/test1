package tree;

public class TNode {

	private char value;
	private TNode leftChild;
	private TNode rightChild;

	public char getValue() {
		return value;
	}

	public TNode getRightChild() {
		return rightChild;
	}

	public TNode(char c) {
		this.value = c;
	}

	public TNode() {
		super();
	}

	public void setRightChild(TNode rightChild) {
		this.rightChild = rightChild;
	}

	public TNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TNode leftChild) {
		this.leftChild = leftChild;
	}

	public void setValue(char value) {
		this.value = value;
	}

}
