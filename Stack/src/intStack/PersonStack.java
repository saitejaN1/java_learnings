package intStack;

public class PersonStack {
	private Person [] Stack;
	private int top;
	private int size;
	public  PersonStack() 
	{
		top =-1;
		size = 50;
		Stack = new Person[50];
		
		
	}
	public  PersonStack(int size)
	{
		top = -1;
		this.size=size;
		Stack = new Person[this.size];
	}
	
public boolean push(Person item)
{
	if(!isFull())
	{
		top++;
		Stack[top]=item;
		return true;
	}else {
		return false;
	}
}
public Person pop() 
{
  return Stack[top--];
  
}
public boolean isEmpty()
{
	return (top ==-1);
}
public boolean isFull()
{
	return(top==Stack.length-1);
	
}

}
