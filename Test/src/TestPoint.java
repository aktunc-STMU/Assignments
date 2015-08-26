import java.util.Scanner;

public class TestPoint {
	
	private static Scanner scan;

	public static void main(String[] args)
	{
		int x1=0;
		int x2=0;
		int y1=0;
		int y2=0;
		scan = new Scanner(System.in);
		System.out.println("Enter two points");
		System.out.println("X-coordinate 1:");
		x1 = scan.nextInt();
		System.out.println("Y-coordinate 1:");
		y1 = scan.nextInt();
		System.out.println("X-coordinate 2:");
		x2 = scan.nextInt();
		System.out.println("Y-coordinate 2:");
		y2 = scan.nextInt();
		ThePoint one = new ThePoint(x1,y1);
		ThePoint two = new ThePoint(x2,y2);
		System.out.println(ThePoint.distance(one,two));
		
	}

}
