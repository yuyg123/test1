package testCase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tree.BinaryTree;
import tree.TNode;

public class BinaryTreeTest {
	private BinaryTree bTree;
	private BinaryTree bTree1;

	@Before
	public void setUp() throws Exception {
		bTree = new BinaryTree();
		bTree1 = new BinaryTree();
	}

	/*
	 * 测试完全2叉树
	 */
	@Test
	public void test() throws Exception {
		TNode node = null;
		node = bTree.createBinaryTree("ABG##H##DC##F##");
		assertEquals("ABGHDCF", bTree.frontOrder(node));
		assertEquals("BGHADCF", bTree.midOrder(node));
		assertEquals("BGHDCFA", bTree.lastOrder(node));
		assertEquals("GHCF", bTree.TreeLevel(node, 3));
	}

	/**
	 * 测试空字符串
	 * @throws Exception
	 */
	// @Test
	// public void test1() throws Exception {
	// TNode node = null;
	// node = bTree.createBinaryTree("");
	// assertEquals("", bTree.lastOrder(node));
	// }
	//

	/*
	 * 测试任意二叉树
	 */
	@Test
	public void test2() throws Exception {
		TNode node = null;
		TNode node1 = null;

		node = bTree.createBinaryTree("ABF####");
		node1 = bTree1.createBinaryTree("AB#G##CF##D#G##");
		assertEquals("ABF", bTree.frontOrder(node));
		assertEquals("BFA", bTree.midOrder(node));
		assertEquals("BFA", bTree.lastOrder(node));
		assertEquals("F", bTree.TreeLevel(node, 3));

		assertEquals("ABGCFDG", bTree1.frontOrder(node1));
		assertEquals("BGACFDG", bTree1.midOrder(node1));
		assertEquals("BGCFDGA", bTree1.lastOrder(node1));
		assertEquals("GFD", bTree1.TreeLevel(node1, 3));
	}

}
