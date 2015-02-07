import java.util.Scanner;
class lonelyInteger
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array(should be between 1 and 99 and odd)");
		int size = input.nextInt();
		System.out.println("Enter  the elements of the array(elements should be from 0 to 99)");
		int[] arr = new int[size];
		for(int i = 0; i < size; i++)
		{
			arr[i] = input.nextInt();
		}
		int[] count = new int[100];
		for(int i = 0; i < 100; i++)
		{
			count[i] = 0;
		}
		for(int i = 0; i < size; i++)
		{
			count[arr[i]] = count[arr[i]] + 1;
		}
		for(int i = 0; i < 100; i++)
		{
			if(count[i]==1)
			{
				System.out.println("The lonely integer is: "+i);
				break;
			}
		}
	}
}