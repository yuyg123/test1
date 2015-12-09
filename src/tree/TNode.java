package tree;

public class TNode {

	private String value;
	TNode leftChild;
	TNode rightChild;

	public String getValue() {
		return value;
	}

	public TNode getRightChild() {
		return rightChild;
	}

	public TNode(String value) {
		super();
		this.value = value;
	}

	public TNode(TNode leftChild, TNode rightChild) {
		this.leftChild = leftChild;
		this.rightChild = rightChild;
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

	public void setValue(String value) {
		this.value = value;
	}

}
