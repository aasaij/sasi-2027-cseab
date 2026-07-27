import java.util.Scanner;
public class CoinChange
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Getting amount to give change
		int amt = in.nextInt();
		//Getting number of denominations
		int nCoins = in.nextInt();
		int[] coins = new int[nCoins];
		//getting denominations details
		for (int i =0; i<nCoins; i++)
		    coins[i] = in.nextInt();
		int[] dp = new int[amt+1];
		//Initialization dp table with Integer Max value
		for (int i = 1; i<=amt; i++)
		    dp[i] = Integer.MAX_VALUE; // 2147483647
		// filling the dp table
	    for (int coin : coins){
	        for (int i = coin; i<=amt; i++)
	            if (dp[i-coin]!=Integer.MAX_VALUE)
	                dp[i] = Math.min(1+dp[i-coin], dp[i]);
	    }
	    if (dp[amt]!=Integer.MAX_VALUE)
	        System.out.println(dp[amt]);
	    else
	        System.out.println(-1);
	}
}
