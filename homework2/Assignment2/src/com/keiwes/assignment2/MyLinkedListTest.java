package com.keiwes.assignment2;

import junit.framework.Assert;

import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void linkedListTest() {
		String names2Evaluate = "wes kim justin leanne ";
		MyLinkedList list = new MyLinkedList();
		list.add("wes");
		list.add("kim");
		list.add("justin");
		list.add("leanne");
		
		Assert.assertEquals(names2Evaluate, list.printForwards());
		Assert.assertEquals("leanne justin kim wes ", list.printBackwards());
	}

}
