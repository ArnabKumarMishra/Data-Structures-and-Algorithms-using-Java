import java.util.Scanner;
class APTest
{
	public static void main(String[] args)
	{
		int d = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the AP series that we need to test: ");
		int size = input.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array elements");
		for(int i = 0; i < size; i++)
		{
			arr[i] = input.nextInt();
		}
		int a= arr[0];
		int fd = (arr[1]-arr[0]);
		int sd = (arr[2]-arr[1]);
		if(arr.length == 2)
		{	
			System.out.println("No missing value");
		}
		else if(fd == sd)
		{
			d = arr[1] - arr[0];
		}
		else
		{
			if(fd > sd)
			{
				int diff1 = arr[0]+d;
				System.out.println("The missing value is: "+diff1);
			}
			else
			{
				int diff2 = arr[1]+2*d;
				System.out.println("The missing value is: "+diff2);
			}
		}
		int temp;
		for(int i = 1; i < size; i++)
		{
			temp = a+(i*d);
			if(arr[i] != temp)
			{
				int miss = arr[i] -d;
				System.out.println("The missing value is: "+miss);
				break;
			}
		}
	}
}