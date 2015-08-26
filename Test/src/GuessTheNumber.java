import java.util.Scanner;


public class GuessTheNumber {
	private static Scanner scan;

	public static void main(String[] args)
	{
		scan = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int counter = 0;
		x = 1 + (int)(Math.random()*10);
		
		do{
			counter++;
			System.out.println("Guess a number between 1 and 10");
			y = scan.nextInt();
			
		}while(y != x);
		
		System.out.println("Congratulations. You gussed the number! It took you "+counter+" tries to find it.");
	}

	

}
