package com.dsalgo.tree;

public class HeightOrDepthOfBinaryTree {

	public static void main(String[] args) {
		// Tree structure ready
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		Node node9 = new Node(9);
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node3.setLeft(node6);
		node3.setRight(node7);
		node7.setLeft(node8);
		node7.setRight(node9);

		int height = preOrder(node1, 1);
		System.out.println(height);

	}

	private static int preOrder(Node node, int height) {
		if (null == node)
			return height;
		Node left = node.getLeft();
		Node right = node.getRight();
		int leftHeight = height, rightHeight = height;

		if (null != left)
			leftHeight = preOrder(left, height + 1);
		if (null != right)
			rightHeight = preOrder(right, height + 1);

		if (leftHeight > rightHeight)
			return leftHeight;
		else
			return rightHeight;

	}

}
