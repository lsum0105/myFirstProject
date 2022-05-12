package myFirstProject;
import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args)
	{
		int count, number;
		System.out.println("Enter a number");
		Scanner keyboard = new Scanner(System.in);
		number = keyboard.nextInt();
		count = 1;
		do
		{
			System.out.print(count+",");
			count++;
		}
		while (count <= number);
		System.out.println();
		System.out.println("Thank you for playing");
	}
}