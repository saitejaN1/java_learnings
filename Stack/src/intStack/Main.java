package intStack;



public class Main 
{
	public static void main(String[] args) 
	{
		
//	IntStack intStack = new IntStack();
//		if((! intStack.isFull()))
//		{
//			( intStack).push(23);
//			( intStack).push(3);
//			( intStack).push(2);
//			( intStack).push(13);
//			( intStack).push(34);
//			
//		}
//		System.out.println(( intStack).pop() );
		
		
	Person person1 = new Person("raju", "1234");
	Person person2 = new Person("sai", "143");
	PersonStack stack= new PersonStack();
	
	stack.push(person1);
	stack.push(person2);
	System.out.println(stack.pop().toString());
	System.out.println(stack.pop().toString());
	}

}
