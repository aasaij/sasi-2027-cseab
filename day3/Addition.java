//Addition of two numbers
import java.util.Scanner;
public class Addition
{
	public static void main(String[] args) {
	   // int n = new java.util.Scanner(System.in).nextInt();
	   Scanner in = new Scanner(System.in);
	   double x, y;
	   x = in.nextDouble();
	   y = in.nextDouble();
	   double sum = x + y;
	   if ((long)sum == sum)
	        System.out.println((long)sum);
	   else
	        System.out.println(sum);
	}
}
