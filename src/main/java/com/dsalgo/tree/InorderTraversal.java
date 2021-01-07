package com.dsalgo.tree;

import java.util.LinkedList;
import java.util.Queue;

public class InorderTraversal {

	public static void main(String[] args) {
		Queue<Node> queue = new LinkedList<Node>();

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

		queue.add(node1);

		while (!queue.isEmpty()) {
			Node currentNode = queue.poll();
			if (null == currentNode)
				continue;
			Node left = currentNode.getLeft();
			if (left != null)
				queue.add(left);
			Node right = currentNode.getRight();
			if (null != right)
				queue.add(right);
			System.out.print(currentNode.getData() + "-->");
		}

	}
}
