import java.util.Scanner;

class stackOperations
{
	int top = 0;
	int[] stack = new int[5];


	public void push(int item)
	{
		if(top != stack.length)
		{
			stack[top] = item;
			top = top + 1;
		}
		else
		{
			System.out.println("Stack overflow");
		}
	}
	public void pop()
	{
		if(top == 0)
		{
			System.out.println("Stack underflow");
		}
		else
		{
			System.out.println("The popped element is: "+stack[top-1]);
			top = top - 1;
		}
	}
	public void display()
	{
		System.out.println("The stack elements from first to last, following the order of input are: ");
		for(int i = 0; i < top ; i++)
		{
			System.out.println(stack[i]);
		}
	}	
}
public class stack
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		stackOperations s1 = new stackOperations();
		s1.push(5);
		s1.push(10);
		s1.push(15);
		s1.push(20);
		s1.push(25);
		s1.display();

		s1.pop();
		s1.pop();
		s1.pop();
		s1.display();
	}
}














