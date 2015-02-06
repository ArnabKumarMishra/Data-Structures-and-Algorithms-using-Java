import java.util.Scanner;
class MNP
{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = input.nextInt();
		int[] numbers = new int[size];
		System.out.println("Enter the numbers");
		for(int i = 0; i < size; i++)
		{
		
			numbers[i] = input.nextInt();

		}
		int min = 0;
		for(int i = 0; i < size; i++)
		{
		
			if(numbers[i] < min)
			{

				min = numbers[i];

			}
		
		}
		System.out.println("The minimum number is: "+min);

	}

}