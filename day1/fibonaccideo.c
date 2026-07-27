//Program to find nth term of Fibonacci series
#include <stdio.h>
int cnt;
int fib(int x){
	cnt++;
	if ( x == 0 || x == 1)
		return x;
	return fib(x-1)+fib(x-2);
}
int main(){
	int n;
	scanf("%d", &n);
	printf("%d", fib(n));
	printf("\n%d", cnt);
	return 0;
}