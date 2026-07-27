//Program to print factors of N
#include <stdio.h>

int main(){
	int n;
	scanf("%d", &n);
	//Printing factors of N
	for (int i = 1; i<=n; i++)
		if (n % i == 0)
			printf("%d ", i);
	return 0;
}