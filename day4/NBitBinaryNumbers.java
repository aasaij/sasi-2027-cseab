//Program to print N-Bit binary numbers which of the sums of ones >= 2
public class NBitBinaryNumbers
{
    public static void generate(String s, int ones, int n){
        //base case
        if (s.length() == n){
            if (ones >= 2)
                System.out.println(s);
            return;
        }
        generate(s+"0", ones, n);
        generate(s+"1", ones+1, n);
    }
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		generate("", 0, n);
	}
}
