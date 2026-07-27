//Program to find minimum number of coins using greedy algorithm
#include <stdio.h>
#include <stdlib.h>
int compare(const void *x, const void *y){
//	return *(int*)x - *(int*)y; // ascending order
	return *(int*)y - *(int*)x; // descending order
}
int main(){
	int amt;
	scanf("%d", &amt);
	int nCoins;
	//Number of denominations
	scanf("%d", &nCoins);
	int coins[nCoins];
	//denomination details
	for (int i = 0; i<nCoins; i++)
		scanf("%d", &coins[i]);  
	//implementing greedy
	qsort(coins,nCoins, sizeof(coins[0]),compare);
	int minCoins = 0;
	for (int i = 0; amt > 0 && i<nCoins; i++){
		if (amt >= coins[i]){
			minCoins += amt / coins[i];
			amt %= coins[i];
		}
	}
	if (amt == 0)
		printf("%d", minCoins);
	else
		printf("-1");
	return 0;
}
//
//8
//3
//4 1 6