import java.util.Scanner;
import java.util.InputMismatchException;
public class GuessingGame {
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String s = input.next();
		System.out.println("Nice to meet you, " + s + "!");
		int answer = (int)(Math.random() * 10 + 1);
		int guess = 0;
		while (guess != answer)
		{
			boolean isNumber = false;
			while (!isNumber)
			{
				try
				{
					System.out.println("Try and guess my number please!");
					int x = input.nextInt();
					guess = x;
					isNumber = true;
				}
				catch(InputMismatchException e)
				{
					System.out.println("That was errortype: " + e);
				}
			}
		}
		System.out.println("Good job " + s + "!");
	}

}