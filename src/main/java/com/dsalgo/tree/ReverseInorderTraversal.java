package com.dsalgo.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseInorderTraversal {
	public static void main(String[] args) {

		Deque<Node> stack = new ArrayDeque<Node>();

		// Tree structure ready
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node3.setLeft(node6);
		node3.setRight(node7);

		stack.push(node1);

		reverseInoorderTraversal(node1, stack);
		while (!stack.isEmpty()) {
			System.out.println(stack.pop() + "--->");
		}
	}

	static void reverseInoorderTraversal(Node currentNode, Deque<Node> stack) {
		if (currentNode == null)
			return;
		Node left = currentNode.getLeft();
		Node right = currentNode.getRight();
		if (null != right)
			stack.push(right);
		if (null != left)
			stack.push(left);
		reverseInoorderTraversal(right, stack);
		reverseInoorderTraversal(left, stack);

	}
}
