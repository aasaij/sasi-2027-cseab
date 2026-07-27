//Program to print natural numbers upto N using recursion
#include <stdio.h>
void print(int x){
	if (x == 0)
		return;
	print(x-1); // head recursion		
	printf("%d", x);
	print(x-1); // tail recursion
}
int main(){
	int n;
	scanf("%d",&n);
	print(n);
	return 0;
}
