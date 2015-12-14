package testCase;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import tree.BinaryTree;
import tree.TNode;

public class BinaryTreeTest {

	@Before
	public void setUp() throws Exception {

	}
	
	/**
	 * 
	 * @throws Exception
	 */

	@Test
	public void test() throws Exception {
		TNode root1 = null;

		BinaryTree bTree1 = new BinaryTree();
		root1 = bTree1.createBinaryTree("B##");// 测试只有根节点的树  A
		assertEquals("B", ListtoString(bTree1.TreeLevel(root1, 1)));

		bTree1.setIndex();
		root1 = bTree1.createBinaryTree("AB##C##");// 测试深度为2的慢二叉树A(B,C)
		assertEquals("A", ListtoString(bTree1.TreeLevel(root1, 1)));
		assertEquals("BC", ListtoString(bTree1.TreeLevel(root1, 2)));

		bTree1.setIndex();
		root1 = bTree1.createBinaryTree("AB##CD###");// 测试一棵任意二叉树 A(B,C(D,))
		assertEquals("A", ListtoString(bTree1.TreeLevel(root1, 1)));
		assertEquals("BC", ListtoString(bTree1.TreeLevel(root1, 2)));
		assertEquals("D", ListtoString(bTree1.TreeLevel(root1, 3)));
		
		bTree1.setIndex();
		root1 = bTree1.createBinaryTree("ABGA###H##CD##EI##J##");// 测试一棵完全二叉树 A(B(G(A,),H),C(D,E(I,J)))
		assertEquals("A", ListtoString(bTree1.TreeLevel(root1, 1)));
		assertEquals("BC", ListtoString(bTree1.TreeLevel(root1, 2)));
		assertEquals("GHDE", ListtoString(bTree1.TreeLevel(root1, 3)));
		assertEquals("AIJ", ListtoString(bTree1.TreeLevel(root1, 4)));

	}

	/**
	 * 将list中对象的数据转化为String类型返回
	 * @param list <TNode> 
	 * @return String类型
	 */
	public String ListtoString(List<TNode> list) {
		StringBuilder sbr = new StringBuilder();
		for (TNode tnode : list) {
			sbr.append(tnode.getValue()); // 加强的for循环遍历list，将list中对象的value属性加入到StringBuilder中
		}
		return sbr.toString(); 
	}

}
