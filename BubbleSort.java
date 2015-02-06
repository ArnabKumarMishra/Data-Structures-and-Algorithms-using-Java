import java.util.Scanner;
class BubbleSort
{

	public static void main(String[] args)
	{
	
		Scanner input = new Scanner(System.in);

		System.out.println("Enter how many numbers to sort.");
		int size = input.nextInt();

		int[] array = new int[size];

		System.out.println("Enter the numbers to be sorted.");
		for(int i = 0; i < size; i++)
		{

			array[i] = input.nextInt();

		}

		sort(array);

		System.out.println("The numbers in sorted order are: ");
		for(int i = 0; i < size; i++)
		{

			System.out.println(array[i]);

		}

	}

	public static void sort(int[] numbers)
	{

		for(int j = 0; j < numbers.length; j++)
			for(int i = 0; i < numbers.length -1-j; i++)
				if(numbers[i] > numbers[i+1])
				{
					int temp = numbers[i];
					numbers[i] = numbers[i+1];
					numbers[i+1] = temp;
				}

	}	

}