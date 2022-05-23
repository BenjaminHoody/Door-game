import java.util.Scanner;

public class DoorGame
	{
 
		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Choose a door. 1, 2 , or 3");
				int choice = userInput.nextInt();
				if (choice == 1)
					{
						System.out.println("Nothing happens! consider this a good thing.");
					}
				else if (choice == 2)
					{
						System.out.println("You win a car!!!");
						
						
						System.out.println("1: Drive with a mask on!");
						System.out.println("2: Drive with no mask on");
						int choice2 = userInput.nextInt();
						
						if(choice2 == 1)
							{
						System.out.println("You were driving with your mask over your eyes because you can get COVID through the eyes!");
						System.out.println("A car popped out and you died in a car accident!. But its ok because at least you didn't contribute to the global pandemic.");
							}
						
						if(choice2 == 2)
							{
								System.out.println("You got home safely!");
							}
					}
				else if(choice == 3)
					{
						System.out.println("You win $10,000!");
					}
			}

	}
