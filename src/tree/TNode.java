package tree;
/**
 * 
 * @ClassName: TNode
 * @Package : 建立节点类，定义属性
 * @Description: TODO
 * @author yuyg yuyg@succez.com
 * @date 2015年12月11日 下午1:49:50
 */
public class TNode {

	private char value;
	private TNode leftChild;
	private TNode rightChild;

	public TNode() {
	}

	public char getValue() {
		return value;
	}

	public TNode getRightChild() {
		return rightChild;
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
