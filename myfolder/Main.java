import java.util.Scanner;
public class Main
{
	static Scanner sc = new Scanner(System.in); 
	public static void main(String args[])
	{
		System.out.println("Enter the radius!: ");
		double radius =sc.nextDouble();
		double area = Math.PI*(radius*radius);
		System.out.println("The are of the circle is: " +area);
		double halfArea = area/2;
		System.out.println("The perimeter is: "+halfArea);
	}
}
