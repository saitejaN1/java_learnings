package intStack;

public class IntStack
{
	
		private int [] Stack;
		private int top;
		private int size;
		public IntStack() 
		{
			top =-1;
			size = 50;
			Stack = new int[50];
			
			
		}
		public IntStack(int size)
		{
			top = -1;
			this.size=size;
			Stack = new int[this.size];
		}
		
	public boolean push(int item)
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
	public int pop() 
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




