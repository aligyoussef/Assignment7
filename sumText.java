import java.util.Scanner;
import java.io.*;
public class sumText
{
	public static void main(String[] args)
	{
		double sum = 0;
		try{
		File list = new File("numlist.txt");
		Scanner input = new Scanner(list); 
		while(input.hasNextDouble())
		{
			sum = sum + input.nextInt();
		}
		System.out.println(sum);
		}
		catch(FileNotFoundException e)
		{
		e.printStackTrace();
		}
	}
}