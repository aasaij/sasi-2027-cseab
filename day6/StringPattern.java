public class StringPattern
{
	public static void main(String[] args) {
		String str = new java.util.Scanner(System.in).next();
		int len = str.length();
		for (int i = 1; i<=len; i++)
		    System.out.printf("%-"+len+"."+i+"s"+"%"+len+"."+i+"s\n", str, str);
	}
}