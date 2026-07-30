#include <stdio.h>
#include <string.h>
int main(){
//	char *str = "Pavani";
	char str[100];	
	scanf("%s", str);
	int len = strlen(str);
	for (int i = 1; i<=len; i++)
		printf("%-*.*s%*.*s\n",len, i, str,len, i, str);
	return 0;
}