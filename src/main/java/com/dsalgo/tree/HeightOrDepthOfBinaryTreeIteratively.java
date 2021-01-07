package com.dsalgo.tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class HeightOrDepthOfBinaryTreeIteratively {

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

		int height = findHeight(node1, 0);
		System.out.println(height);

	}

	private static int findHeight(Node node1, int height) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node1);

		while (!queue.isEmpty()) {
			Deque<Node> list = new ArrayDeque<>();
			while (!queue.isEmpty()) {
				list.add(queue.poll());
			}
			++height;

			System.out.println("Nodes at level " + height + "=" + list);
			for (Node cn : list) {
				if (null != cn.getLeft())
					queue.add(cn.getLeft());
				if (null != cn.getRight())
					queue.add(cn.getRight());
			}
		}

		return height;

	}

}
