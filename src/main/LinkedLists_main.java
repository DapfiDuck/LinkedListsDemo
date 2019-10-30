package main;

import list.LinkedList;

public class LinkedLists_main {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.append(2);
		list.append(3);
		list.append(5);
		list.append(7);
		
		list.print((byte) 2);
		list.print();
		list.delete((byte) 2);
		list.print();
		
		list.insert((byte) 2, 15);		
		list.print();

	}

}
