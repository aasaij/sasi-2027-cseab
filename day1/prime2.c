#include <stdio.h>
int main(){
    int n=101;
    if (n == 1)
        printf("Neither prime nor composite");
    else {
        for (int i = 2; i*i<=n; i++)
            if (n % i == 0){
                printf("Not Prime");
                return 0;//terminate
            }
        printf("Prime");            
    }
    return 0;
}