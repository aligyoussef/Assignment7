import java.util.Scanner;
import java.io.*;
public class sumText
{
	public static void main(String[] args)
	{
		double sum = 0;
		int count = 0;
		try{
		File list = new File("numlist.txt");
		Scanner input = new Scanner(list); 
		while(input.hasNextDouble())   //Getting number of lines
		{
			count++;
			sum = sum + input.nextDouble();
		}
		Scanner input2 = new Scanner(list); 
			
		int[] store = new int[count];
		for(int i = 0; i<store.length; i++)
		{
			if(input.hasNextDouble())
			{
			store[i] = input.nextDouble();
			
			sum = sum + input.nextDouble();
			}
			
		}
		System.out.println(sum);
		}
		catch(FileNotFoundException e)
		{
		e.printStackTrace();
		}
	}
}
