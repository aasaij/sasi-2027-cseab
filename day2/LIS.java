import java.util.Scanner;
public class LIS
{
    public static int lis(int[] list){
        int n = list.length;
        int[] dp = new int[n];
	    for (int i =0; i<n; dp[i++]=1);
	    for (int i=1; i<n; i++)
	        for (int j =0; j<i; j++)
	            if (list[i]>list[j])
	                dp[i] = Math.max(dp[i], 1+dp[j]);
	    int max = dp[0];
	    for (int i = 1; i<n; i++)
	        if (max < dp[i])
	            max = dp[i];
	   return max;
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int[] list = new int[n];
	    for (int i = 0; i<n; i++)
	        list[i] = in.nextInt();
	   System.out.println(lis(list));
	}
}
