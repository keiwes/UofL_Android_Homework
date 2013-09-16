package com.keiwes.assignment2;

public class LinkedListTest {
	public static void main(String[] args)
	{
		MyLinkedList myList = new MyLinkedList();
		myList.add("wes");
		myList.add("kim");
		myList.add("justin");
		myList.add("leanne");
		
		System.out.println(myList.printForwards());
		System.out.println(myList.printBackwards());
	}
}
	