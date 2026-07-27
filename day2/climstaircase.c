//Program to implement climbing staircase
#include <stdio.h>
int climbStairCase(int n, int dp[]){
	//Base case
	if (n<=2)
		return n;
	if (dp[n]!=-1)
		return dp[n];
	return dp[n]= climbStairCase(n-1, dp) + climbStairCase(n-2, dp);
	
}

int main(){
	int n;
	scanf("%d", &n);
	int dp[n+1];
	for (int i = 0; i<=n; dp[i++]=-1);
	printf("%d", climbStairCase(n, dp));
	return 0;
}