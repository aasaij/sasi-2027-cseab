#include <stdio.h>

int main(){
	char c = 250; // -128 to 127
	int x;
	x = c + !c + ~c + ++c;
	printf("%d", x);
	
	return 0;
}