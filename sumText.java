import java.util.Scanner;
import java.io.*;
public class sumText
{
    static double sum = 0;
    static int nums = 0;
    static double[] store;
	public static void main(String[] args)
	{
		
	
		try{
		File list = new File("numlist.txt");
		
		nums = countNumbers(list);
	    System.out.println("Sum of numbers is: " + sum);
	    double[] store = new double[nums];
	    storeNumbers(list, store);
		System.out.println("Average is: " + (sum/nums));
		
	
		
		
		System.out.println(sum);
		throw new FileNotFoundException("File not found.");
		}
		catch(FileNotFoundException e)
		{
		    e.printStackTrace();
		}
	}
	public static int countNumbers(File f)
	{
	    int count = 0;
	   
	    try{
	    Scanner input = new Scanner(f); 
	    while(input.hasNextLine())   //Getting amount of numbers in the file and summing them.
		{
		    if(input.hasNextDouble())
		    {
			count++;
			sum = sum + input.nextDouble();
		    }
		}
		return count;
	    }
	    catch(FileNotFoundException e)
	    {
	        e.printStackTrace();
	        
	    }
	    return count; 
	}
	public static double[] storeNumbers(File f, double[] a)
	{
	    try{
	    Scanner input2 = new Scanner(f);
	    double[] store = new double[nums];
	    for(int i = 0; i<store.length; i++) //Storing the numbers in an array and printing them
		{
			if(input2.hasNextDouble())
			{
			store[i] = input2.nextDouble();
			System.out.println(store[i]);
			
			
			}
			
		}
		return store; 
	    }
	    catch(FileNotFoundException e)
	    {
	        e.printStackTrace();
	        
	    }
	    return store; 
	    
	}
}
