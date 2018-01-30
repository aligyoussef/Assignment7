import java.util.Scanner;
public class Grades
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number of students: ");
		Scanner input1 = new Scanner(System.in);
		int num1 = input1.nextInt();
		int[] students = new int[num1];
		int highest = 0;
		
		System.out.println("Enter " + num1 + " scores");
		for(int i = 0; i<num1; i++)
		{
			Scanner input2 = new Scanner(System.in);
			int num2 = input2.nextInt();
			students[i] = num2; 
			
		}
		
		for(int j = 0; j<num1; j++)
			{
				if(students[j] > highest)
				{
					highest = students[j];
				}
			}
		for(int g = 0; g<num1; g++)
		{
			int grade = students[g];
			if(grade >= (highest-10))
			{
				System.out.println("Student " + g + " score is " + grade  + " and grade is A");
			}
			else if(grade >= (highest-20))
			{
				System.out.println("Student " + g + " score is " + grade  + " and grade is B");
			}
			else if(grade >= (highest-30))
			{
				System.out.println("Student " + g + " score is " + grade  + " and grade is C");
			}
			else if(grade >= (highest-40))
			{
				System.out.println("Student " + g + " score is " + grade  + " and grade is D");
			}
			else
				System.out.println("Student " + g + " score is " + grade  + " and grade is F");
		}
		
	}
}