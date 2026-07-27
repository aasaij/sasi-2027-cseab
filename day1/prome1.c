//Program to check whether the given  number is prime or not
#include <stdio.h>
int main(){
	int n;
	scanf("%d", &n);
	if (n == 1)
		printf("Neither prime nor composite");
	else {
		for (int i = 2; i<=n-1; i++)
			if (n % i == 0){
				printf("Not Prime");
				return 0;//terminate
			}
		printf("Prime");			
	}
	return 0;
}