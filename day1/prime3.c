#include <stdio.h>
int main(){
    int n;
    scanf("%d", &n);
    if (n == 1)
        printf("Neither prime nor composite");
    else if (n > 3 && (n % 2 == 0 || n % 3 == 0))
    	printf("Not prime");
    else {
        for (int i = 5; i*i<=n; i+=6)
            if (n % i == 0 || n % (i+2)==0 ){
                printf("Not Prime");
                return 0;//terminate
            }
        printf("Prime");            
    }
    return 0;
}
//5,7, 11, 13  17, 19, 23 , 29, 31


//All prime numbers are either 6N+1 or 6N-1 except 2 & 3
//But all 6N+1 & 6N-1 are not prime numbers
//13	==> 6 x 2 + 1
//17	==> 6 x 3 - 1
//7	==> 6 x 1 + 1

