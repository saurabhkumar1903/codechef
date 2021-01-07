package com.dsalgo.tree;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {
	private int data;
	private Node left;
	private Node right;

	public Node(int data) {
		super();
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}

}
