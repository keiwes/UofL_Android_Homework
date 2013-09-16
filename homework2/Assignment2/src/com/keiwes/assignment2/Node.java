package com.keiwes.assignment2;

public class Node {
	
	//Declare variables
	private String value = "";
	private Node nextNode = null;
	private Node prevNode = null;
	
	//Constructor
	public Node(String input) {
		this.value = input;
	}

	//Value
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

	//Next Node
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	public Node getNextNode() {
		return nextNode;
	}

	//Prev Node
	public void setPrevNode(Node prevNode) {
		this.prevNode = prevNode;
	}
	
	public Node getPrevNode() {
		return prevNode;
	}

	//Override toString
	@Override
	public String toString() {
		return "Node [value=" + value + ", pointerNode=" + nextNode + "]";
	}

}