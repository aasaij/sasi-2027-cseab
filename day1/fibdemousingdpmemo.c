//Program to find nth term fibonacci using memoization
#include <stdio.h>
int cnt;
int fib(int x, int m[]){
	cnt++;
	if (x == 0 || x == 1)
		return x;
	//checking whether xth term is calculated
	if (m[x]!=-1)
		return m[x];
	return m[x] = fib(x-1, m)+fib(x-2,m);	
}
int main(){
	int n;
	scanf("%d", &n);
	int dp[n+1];
	//initializing memo table into -1
	for (int i = 0;i<=n;dp[i++]=-1);
	
	printf("%d", fib(n, dp));
	printf("\n%d", cnt);
	return 0;
}