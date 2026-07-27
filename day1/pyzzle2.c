#include <stdio.h>
#include<math.h>
int main(){
	//printf("%f", 10.5%4); // error
	printf("%f", fmod(10.5,4)); 
	return 0;
}