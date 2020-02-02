package org.queue.app;

public class Main {
 public static void main(String[] args) {
	
//	 IntQueue intQueue = new IntQueue();
//	 intQueue. enqueue(43);
//	 intQueue.enqueue(23);
//	 intQueue.enqueue(23);
//	 
//	 intQueue.showAll();
//	 
	 PersonQ personQ = new PersonQ();
	 personQ.enqueue(new Person("sai","345"));
	 personQ.enqueue(new Person("teja", "123"));
	 personQ.enqueue(new Person("bhargav", "153"));
	 
	 personQ.showAll();
}
}
