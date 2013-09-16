package com.keiwes.assignment2;

public class MyLinkedList {
	private Node backTraceNode = null;
	private Node firstNode = null;

	public void add(String input) {
		Node tmpNode = new Node(input);
		tmpNode.setPrevNode(backTraceNode); 
		if(backTraceNode!=null){
			tmpNode.setNextNode(null);
			backTraceNode.setNextNode(tmpNode);
		}else{
			firstNode=tmpNode;
		}
		backTraceNode = tmpNode;
	}

	public String printForwards() {
		StringBuffer result = new StringBuffer();
		Node tmpNode = firstNode;
		while(tmpNode!=null){
			result.append(tmpNode.getValue() + " ");
			tmpNode=tmpNode.getNextNode();
		}
		return result.toString();
	}
	
	public String printBackwards() {
		StringBuffer result = new StringBuffer();
		Node tmpNode = backTraceNode;
		while(tmpNode!=null){
			result.append(tmpNode.getValue() + " ");
			tmpNode=tmpNode.getPrevNode();
		}
		return result.toString();
	}
	
}

