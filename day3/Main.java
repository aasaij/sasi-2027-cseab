//Trip optimization
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int days = in.nextInt();
		int n = in.nextInt();
		String[] cityNames = new String[n];
		int[] time = new int[n];
		int[] gifts = new int[n];
		for (int i = 0; i<n; i++){
		    cityNames[i] = in.next();
		    time[i] = in.nextInt();
		    gifts[i] = in.nextInt();
		}
		int[][] dp = new int[n+1][days+1];
		for (int i = 1; i<=n; i++){
		    for (int j = 1 ; j<=days; j++){
		        if (j >=time[i-1])
		            dp[i][j] = Math.max(dp[i-1][j], gifts[i-1]+dp[i-1][j-time[i-1]]);
		        else
		            dp[i][j] = dp[i-1][j];
		    }
		}
		System.out.println(dp[n][days]);
	}
}
