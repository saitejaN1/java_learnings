package org.list.com;

public class Main {
 
	public static void main(String[] args) {
	
//		IntLinkedList list = new IntLinkedList();
//		list.insertitem(3);
//		list.insertitem(23);
//		list.insertitem(56);
//		list.printList();
//		list.sortList();
//		System.out.println("After sortlist");
//		list.printList();
//		System.out.println("After delete the value");
//		list.deleteItem(23);
//		list.printList();
		Person person1 = new Person("sai","56748");
	    Person person2 = new Person("teja","23451");
		Person person3 = new Person("siva","78929");
		
		IntPerson list = new IntPerson(person1);
		list.insertitem(person2);
		list.insertitem(person3);
		list.printList();
		
		
		
}
}
